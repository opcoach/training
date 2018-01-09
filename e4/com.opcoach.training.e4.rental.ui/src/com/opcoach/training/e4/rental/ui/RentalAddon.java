package com.opcoach.training.e4.rental.ui;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

public class RentalAddon implements RentalUIConstants
{

	@PostConstruct
	void startRentalFeature(IEclipseContext ctx, IExtensionRegistry reg, @Optional IEclipsePreferences prefs)
	{

		System.out.println("---->  Enter in the RentalAddon ");
		System.out.println("IEclipsePreferences is : " + prefs);
		// Put objects in context
		ctx.set(RentalAgency.class, RentalAgencyGenerator.createSampleAgency());
		ctx.set(RENTAL_UI_IMG_REGISTRY, getLocalImageRegistry());

		IPreferenceStore prefStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID);
		ctx.set(RENTAL_UI_PREF_STORE, prefStore);

		// Read the palettes extensions and publish it in context
		readPaletteExtensions(reg, ctx);
		ctx.set(PALETTE_MANAGER, paletteManager);

		// Set the current palette in context...
		String palId = prefStore.getString(PREF_PALETTE);
		ctx.set(Palette.class, paletteManager.get(palId));

	}

	@Inject @Optional
	private Logger logger;

	/** The map of possible color providers (read in extensions) */
	private Map<String, Palette> paletteManager = new HashMap<String, Palette>();

	/**
	 * A method to create and initialize an ImageRegistry
	 * @return a initialized ImageRegistry that can be put in the context
	 */
	ImageRegistry getLocalImageRegistry()
	{
		// Get the bundle using the universal method to get it from the current class
		Bundle b = FrameworkUtil.getBundle(getClass());  
		
		// Create a local image registry
		ImageRegistry reg = new ImageRegistry();

		// Then fill the values...
		reg.put(IMG_CUSTOMER, ImageDescriptor.createFromURL(b.getEntry(IMG_CUSTOMER)));
		reg.put(IMG_RENTAL, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL)));
		reg.put(IMG_RENTAL_OBJECT, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL_OBJECT)));
		reg.put(IMG_AGENCY, ImageDescriptor.createFromURL(b.getEntry(IMG_AGENCY)));
		reg.put(IMG_COLLAPSE_ALL, ImageDescriptor.createFromURL(b.getEntry(IMG_COLLAPSE_ALL)));
		reg.put(IMG_EXPAND_ALL, ImageDescriptor.createFromURL(b.getEntry(IMG_EXPAND_ALL)));

		return reg;
	}

	@PreDestroy
	void stopRentalFeature(IEclipseContext ctx)
	{
		ctx.remove(RentalAgency.class);
	}

	/** Read the palette extension (called by the postConstruct) */
	Map<String, Palette> readPaletteExtensions(IExtensionRegistry reg, IEclipseContext ctx)
	{
		IExtensionPoint extp = reg.getExtensionPoint("com.opcoach.training.e4.rental.ui.Palette");
		IExtension[] extensions = extp.getExtensions();

		for (IExtension ext : extensions)
		{
			IConfigurationElement[] config = ext.getConfigurationElements();
			for (IConfigurationElement elt : config)
			{
				// Create the palette for current extension.
				try
				{
					// Create the executable extension
					Bundle b = Platform.getBundle(elt.getNamespaceIdentifier());
					Class<?> cz = b.loadClass(elt.getAttribute("paletteClass"));
					IColorProvider delegatedICP = (IColorProvider) ContextInjectionFactory.make(cz, ctx);

					// Add it (with its name) in the color provider map
					Palette p = new Palette(elt.getAttribute("id"));
					p.setName(elt.getAttribute("name"));
					p.setColorProvider(delegatedICP);
					paletteManager.put(p.getId(), p);

					// paletteManager.put(elt.getAttribute("name"),
					// delegatedICP);
				} catch (InvalidRegistryObjectException e)
				{
					if (logger != null)
					logger.error(e, "Unable to create palette class : " + elt.getAttribute("colorProviderClass"));
				} catch (ClassNotFoundException e)
				{
					if (logger != null)
					logger.error(e, "Unable to create palette class : " + elt.getAttribute("colorProviderClass"));

				}
			}
		}

		return paletteManager;

	}

	@Inject
	public void readModelFragmentsExtensions(IExtensionRegistry reg)
	{
		// IExtensionRegistry reg = Platform.getExtensionRegistry();
		System.out.println("Enter in read model Extensions");
		for (IConfigurationElement elt : reg.getConfigurationElementsFor("org.eclipse.e4.workbench.model"))
		{
			if (elt.getName().equals("fragment"))
			     System.out.println("Model Fragment : "+ elt.getAttribute("uri") + " found in "+ elt.getNamespaceIdentifier());
			else if (elt.getName().equals("processor"))
			     System.out.println("Model processor class : "+ elt.getAttribute("class") + " found in "+ elt.getNamespaceIdentifier());

		}

	}

	/**
	 * Listen to change of the pref palette, and set the current palette in
	 * context
	 */
	@Inject
	public void changePalette(@Preference(value = PREF_PALETTE) String paletteID, IEclipseContext ctx)
	{
		// DO nothing if palette manager not yet called.
		if (paletteManager != null)
			ctx.set(Palette.class, paletteManager.get(paletteID));
	}

}
package com.opcoach.training.e4.rental.ui;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.osgi.framework.Bundle;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

public class RentalAddon implements RentalUIConstants
{
	@Inject
	private Logger logger;

	/** The map of possible color providers (read in extensions) */
	private Map<String, Palette> paletteManager = new HashMap<String, Palette>();

	@PostConstruct
	void startRentalFeature(IEclipseContext ctx, IExtensionRegistry reg)
	{
		// Hook event listeners
		ctx.set(RentalAgency.class, RentalAgencyGenerator.createSampleAgency());
		ctx.set(ImageRegistry.class, getLocalImageRegistry());

		ctx.set(IPreferenceStore.class, RentalUIActivator.getPreferenceStore());

		// Read the palettes extensions and publish it in context
		readPaletteExtensions(reg);
		ctx.set(PALETTE_MANAGER, paletteManager);

		// Set the current palette in context...
		String palId = RentalUIActivator.getPreferenceStore().getString(PREF_PALETTE);
		ctx.set(Palette.class, paletteManager.get(palId));

		// Display extensions sample 
		readAdapterExtensions(reg);

	}

	ImageRegistry getLocalImageRegistry()
	{
		Bundle b = Platform.getBundle(RentalUIActivator.PLUGIN_ID);
		ImageRegistry reg = new ImageRegistry();

		reg.put(CUSTOMER_IMG_KEY, ImageDescriptor.createFromURL(b.getEntry("icons/Customers.png")));
		reg.put(RENTAL_IMG_KEY, ImageDescriptor.createFromURL(b.getEntry("icons/Rentals.png")));
		reg.put(RENTAL_OBJECT_IMG_KEY, ImageDescriptor.createFromURL(b.getEntry("icons/RentalObjects.png")));
		reg.put(AGENCY_IMG_KEY, ImageDescriptor.createFromURL(b.getEntry("icons/Agency.png")));

		return reg;

	}

	@PreDestroy
	void stopRentalFeature(IEclipseContext ctx)
	{
		ctx.remove(RentalAgency.class);
	}

	/** Read the palette extension (called by the postConstruct) */
	Map<String, Palette> readPaletteExtensions(IExtensionRegistry reg)
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
					IColorProvider delegatedICP = (IColorProvider) elt.createExecutableExtension("paletteClass");

					// Add it (with its name) in the color provider map
					Palette p = new Palette(elt.getAttribute("id"));
					p.setName(elt.getAttribute("name"));
					p.setColorProvider(delegatedICP);
					paletteManager.put(p.getId(), p);

					// paletteManager.put(elt.getAttribute("name"),
					// delegatedICP);
				} catch (CoreException e)
				{
					logger.error(e, "Unable to create palette class : " + elt.getAttribute("colorProviderClass"));
				}
			}
		}

		return paletteManager;

	}

	@Inject
	public void readAdapterExtensions(IExtensionRegistry reg)
	{
		// IExtensionRegistry reg = Platform.getExtensionRegistry();
		System.out.println("Enter in read Adapters Extensions");
		for (IConfigurationElement elt : reg.getConfigurationElementsFor("org.eclipse.core.runtime.adapters"))
		{
			System.out.println("Plugin : " + elt.getNamespaceIdentifier() + "\t\tAdapter : " + elt.getAttribute("class"));
		}

	}

	/**
	 * Listen to change of the pref palette, and set the current palette in  context
	 */
	@Inject
	public void changePalette(@Preference(nodePath = RentalUIActivator.PLUGIN_ID, value = PREF_PALETTE) String paletteID, IEclipseContext ctx)
	{
		// DO nothing if palette manager not yet called.
		if (paletteManager != null)
			ctx.set(Palette.class, paletteManager.get(paletteID));
	}

}
package com.opcoach.training.e4.rental.ui;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

/**
 * The activator class controls the plug-in life cycle This class must be
 * registered as a LifeCycleURI to fill the context
 */
public class RentalUIActivator implements BundleActivator, RentalUIConstants
{

	private static RentalUIActivator plugin;
	

	/*
	 * public static RentalUIActivator getDefault() { return plugin; };
	 */
	
	private static int count = 0;

	@PostContextCreate
	private void populateContext(IEclipseContext econtext)
	{
		System.out.println("********************  Enter in RUIA populate context #" + count++);
		econtext.set(RentalAgency.class, RentalAgencyGenerator.createSampleAgency());
		econtext.set(ImageRegistry.class, getLocalImageRegistry() );
		econtext.set(IPreferenceStore.class, getPreferenceStore());
		// InjectorFactory.getDefault().addBinding(AgencyLabelProvider.class).implementedBy(AgencyLabelProvider.class);
	}

	
	private IPreferenceStore preferenceStore;
	
	public IPreferenceStore getPreferenceStore() {
        // Create the preference store lazily.
        if (preferenceStore == null) {
            preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, context.getBundle().getSymbolicName());

        }
        return preferenceStore;
    }
	
	
	private  static BundleContext context;

	public static BundleContext getContext()
	{
		return context;
	}

	private ImageRegistry getLocalImageRegistry()
	{
		Bundle b = context.getBundle();
		ImageRegistry reg = new ImageRegistry();

		reg.put(CUSTOMER_KEY, ImageDescriptor.createFromURL(b.getEntry("icons/Customers.png")));
		reg.put(RENTAL_KEY, ImageDescriptor.createFromURL(b.getEntry("icons/Rentals.png")));
		reg.put(RENTAL_OBJECT_KEY, ImageDescriptor.createFromURL(b.getEntry("icons/RentalObjects.png")));
		reg.put(AGENCY_KEY, ImageDescriptor.createFromURL(b.getEntry("icons/Agency.png")));

		return reg;

	}
	
	public static RentalUIActivator getDefault()
	{
		return plugin;
	}

	// The plug-in ID
	public static final String PLUGIN_ID = "com.opcoach.training.e4.rental.ui";

	/** The map of possible color providers (read in extensions) */
	private static Map<String, IColorProvider> paletteManager = new HashMap<String, IColorProvider>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bcontext) throws Exception
	{
		context = bcontext;
		plugin = this;
		System.out.println("Start rental ui bundle");
		// readViewExtensions();
		// readColorProviderExtensions();
	}

	@Inject
	private Logger logger;

	private void logAMessage()
	{
		logger.info("Un message");
	}

	@Inject
	public void readColorProviderExtensions(IExtensionRegistry reg)
	{
		IExtensionPoint extp = reg.getExtensionPoint("com.opcoach.training.e4.rental.ui.Palette");
		IExtension[] extensions = extp.getExtensions();

		for (IExtension ext : extensions)
		{
			IConfigurationElement[] config = ext.getConfigurationElements();
			for (IConfigurationElement elt : config)
			{
				// Create the color provider for label.
				try
				{
					// Create the executable extension
					Object exeExt = elt.createExecutableExtension("paletteClass");
					// Add it (with its name) in the color provider map
					String name = elt.getAttribute("name");
					paletteManager.put(name, (IColorProvider) exeExt);
				} catch (CoreException e)
				{
					IStatus st = new Status(IStatus.ERROR, PLUGIN_ID, "Unable to create palette class : "
							+ elt.getAttribute("colorProviderClass"), e);
					logger.error(e, "Unable to create palette class : " + elt.getAttribute("colorProviderClass"));

				}
			}
		}

	}

	@Inject
	public void readViewExtensions(IExtensionRegistry reg)
	{
		// IExtensionRegistry reg = Platform.getExtensionRegistry();
		System.out.println("Enter in readView Extensions");
		for (IConfigurationElement elt : reg.getConfigurationElementsFor("org.eclipse.ui.views"))
		{
			if (elt.getName().equals("view"))
				System.out.println("Plugin : " + elt.getNamespaceIdentifier() + "\t\t\tVue : " + elt.getAttribute("name"));
		}

	}

	/* @return a never null collection of overriden color providers */

	public static Map<String, IColorProvider> getPaletteManager()
	{
		return paletteManager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception
	{
		context = null;
		plugin = null;
	}


}

package com.opcoach.training.rental.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

/**
 * The activator class controls the plug-in life cycle
 */
public class RentalUIActivator extends AbstractUIPlugin
{

	// The plug-in ID
	public static final String PLUGIN_ID = "com.opcoach.rental.ui";

	// The shared instance
	private static RentalUIActivator plugin;

	/**
	 * The constructor
	 */
	public RentalUIActivator()
	{
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception
	{
		super.start(context);
		plugin = this;
		readColorProviderExtensions();
	}
	
	public void readColorProviderExtensions()
	{
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint extp = reg.getExtensionPoint("com.opcoach.rental.ui.ColorProvider");
		IExtension[] extensions = extp.getExtensions();
		
		for (IExtension ext : extensions)
		{
			IConfigurationElement[] config = ext.getConfigurationElements();
			for (IConfigurationElement elt : config)
			{
				// Create the color provider for label.
				try
				{
					overridenColorProvider = (IColorProvider) elt.createExecutableExtension("colorProviderClass");
				} catch (CoreException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	private IColorProvider overridenColorProvider;
	
	public IColorProvider getOverridenColorProvider()
	{
		return overridenColorProvider;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception
	{
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static RentalUIActivator getDefault()
	{
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path
	 * 
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path)
	{
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public static RentalAgency getAgency()
	{
		return RentalAgencyGenerator.createSampleAgency();
	}
}

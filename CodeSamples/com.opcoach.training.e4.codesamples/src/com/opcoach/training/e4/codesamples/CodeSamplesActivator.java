package com.opcoach.training.e4.codesamples;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class CodeSamplesActivator implements BundleActivator
{

	// The plug-in ID
	public static final String PLUGIN_ID = "com.opcoach.training.codesamples";

	// The shared instance
	private static CodeSamplesActivator plugin;

	/**
	 * The constructor
	 */
	public CodeSamplesActivator()
	{
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception
	{
		System.out.println("Enter in start of CodeSampleActivator");
		plugin = this;

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
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static CodeSamplesActivator getDefault()
	{
		return plugin;
	}

	@Inject
	public void getExtensionsQuickAccess(IExtensionRegistry reg)
	{
		for (IConfigurationElement elt : reg.getConfigurationElementsFor("pluginID.extensionID"))
		{
			String attValue = elt.getAttribute("anAttributeName");
			System.out.println(" Found this element : " + elt.getName() + " with attr=" + attValue);
		}

	}

	@Inject
	public void getExtensions(IExtensionRegistry reg)
	{
		IExtensionPoint extp = reg.getExtensionPoint("pluginID.extensionID");
		IExtension[] extensions = extp.getExtensions();

		for (IExtension ext : extensions)
		{
			// Get all configuration element for current extension
			for (IConfigurationElement elt : ext.getConfigurationElements())
			{
				String attValue = elt.getAttribute("anAttributeName");
				System.out.println(" Found this element : " + elt.getName() + " with attr=" + attValue);
			}
		}
	}

	@Inject
	private Collection<Driver> readDriverExtensions(IExtensionRegistry reg, Logger log)
	{
		Collection<Driver> results = new ArrayList<Driver>();
		for (IConfigurationElement e : reg.getConfigurationElementsFor("pID.Driver"))
		{
			try
			{
				results.add((Driver) e.createExecutableExtension("driverClass"));

			} catch (Exception ex)
			{
				log.error("Unable to create extension.", ex);
			}
		}
		return results;
	}

	@Inject
	private Collection<Driver> readIconsURLList(IExtensionRegistry reg, Logger log)
	{
		// Get drivers and set their configuration files.
		Collection<Driver> results = new ArrayList<Driver>();

		for (IConfigurationElement e : reg.getConfigurationElementsFor("pID.Driver"))
		{
			// Must get the source plugin declaring this configuration element
			Bundle bdl = Platform.getBundle(e.getContributor().getName());
			try
			{
				// Create the driver
				Driver driver = (Driver) e.createExecutableExtension("driverClass");
				
				// get config file URL in attribute and set it on driver
				String iconPath = e.getAttribute("configurationFile");
				URL url = bdl.getEntry(iconPath);
				driver.setConfiguration(url);
				
				results.add(driver);
				
			} catch (Exception ex)
			{
				log.error("Unable to create Driver extension.", ex);
			}
		}

		return results;
	}

	/**
	 * Get a color, assuming key is a Rgb to string format
	 * 
	 * @param key
	 *            a rgb string readable by StringConverter
	 * @return the color corresponding to key.
	 */
	public Color getAColor(String key)
	{
		// Utilise le Registry global de JfaceResources
		ColorRegistry reg = JFaceResources.getColorRegistry();
		// Essai de récuperer l'image peut être déjà présente
		Color col = reg.get(key);
		if (col == null)
		{
			// L'image n'est pas encore stockée dans le registry, on l'ajoute
			RGB rgb = StringConverter.asRGB(key);
			// Le path sert de clé
			reg.put(key, rgb);
			col = reg.get(key);
		}

		return col;

	}
	


}

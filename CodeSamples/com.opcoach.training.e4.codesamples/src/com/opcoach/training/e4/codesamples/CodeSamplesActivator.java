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
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
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

	private static final String DRIVER_MANAGER = "com.opcoach.training.DriverManager";

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

		// Call some tests...
		InjectionSample.testInjectionSample();
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
	private void readDriverExtensions(IExtensionRegistry reg, Logger log, IEclipseContext ctx)
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
		// Add the drive manager in the Eclipse Context
		ctx.set(DRIVER_MANAGER, results);
	}
	
	@Inject
	private void createDriverExtensionsWithInjection(IExtensionRegistry reg, Logger log, IEclipseContext ctx)
	{
		Collection<Driver> results = new ArrayList<Driver>();
		for (IConfigurationElement e : reg.getConfigurationElementsFor("pID.Driver"))
		{
			try
			{
				// Instead of calling createExecutableExtension, use the following code to have injection
				// results.add((Driver) e.createExecutableExtension("driverClass"));
				Bundle b = Platform.getBundle(e.getNamespaceIdentifier()); 
				Class<?> clazz = b.loadClass(e.getAttribute("driverClass"));
				Driver instance = (Driver) ContextInjectionFactory.make(clazz, ctx);
				results.add(instance);

			} catch (Exception ex)
			{
				log.error("Unable to create extension", ex);
			}
		}
		// Add the drive manager in the Eclipse Context
		ctx.set(DRIVER_MANAGER, results);
	}

	/**
	 * Read the Driver extension point and initialize DriverManager in the
	 * context
	 */
	@Inject
	private void readDrivers(IExtensionRegistry reg, Logger log, IEclipseContext ctx)
	{
		// Get drivers and set their configuration files.
		Collection<Driver> result = new ArrayList<Driver>();

		for (IConfigurationElement e : reg.getConfigurationElementsFor("pID.Driver"))
		{
			// Must get the source plugin declaring this configuration element
			Bundle bdl = Platform.getBundle(e.getContributor().getName());
			try
			{
				// Create the driver
				Driver driver = (Driver) e.createExecutableExtension("driverClass");

				// get configuration file URL in attribute and set it on driver
				String configFile = e.getAttribute("configurationFile");
				URL url = bdl.getEntry(configFile);
				driver.setConfiguration(url);

				result.add(driver);

			} catch (Exception ex)
			{
				log.error("Unable to create Driver extension.", ex);
			}
		}
		// Add the drive manager in the Eclipse Context
		ctx.set(DRIVER_MANAGER, result);
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
		// Essai de r�cuperer l'image peut �tre d�j� pr�sente
		Color col = reg.get(key);
		if (col == null)
		{
			// L'image n'est pas encore stock�e dans le registry, on l'ajoute
			RGB rgb = StringConverter.asRGB(key);
			// Le path sert de cl�
			reg.put(key, rgb);
			col = reg.get(key);
		}

		return col;

	}

}

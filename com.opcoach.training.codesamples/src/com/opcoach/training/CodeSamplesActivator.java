package com.opcoach.training;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class CodeSamplesActivator extends AbstractUIPlugin
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
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception
	{
		super.start(context);
		plugin = this;

		getExtensions();
		getExtensionsQuickAccess();
		readDriverExtensions();
		readIconsURLList();
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
	public static CodeSamplesActivator getDefault()
	{
		return plugin;
	}

	/** Read extensions and all configuration elements */
	private void getExtensions()
	{
		// Step by step access
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = reg.getExtensionPoint("pluginID.extensionID");

		for (IExtension extension : extensionPoint.getExtensions())
		{
			// Get all configuration elements for current extension
			for (IConfigurationElement e : extension.getConfigurationElements())
			{
				System.out.println("Found this element :" + e.getName());

			}

		}
	}

	/** Read extensions and all configuration elements */
	private void getExtensionsQuickAccess()
	{
		IExtensionRegistry reg = Platform.getExtensionRegistry();

		// Direct access
		for (IConfigurationElement e : reg.getConfigurationElementsFor("pID.extID"))
		{
			System.out.println("Found this element :" + e.getName());
		}
	}

	private Collection<Driver> readDriverExtensions()
	{
		IExtensionRegistry reg = Platform.getExtensionRegistry();

		Collection<Driver> results = new ArrayList<Driver>();
		for (IConfigurationElement e : reg.getConfigurationElementsFor("pID.Driver"))
		{
			try
			{
				results.add((Driver) e.createExecutableExtension("driverClass"));
			} catch (Exception ex)
			{
				getLog().log(new Status(IStatus.ERROR, e.getNamespaceIdentifier(), 
						"Unable to create extension.", ex));
			}
		}
		return results;
	}
	
	

	private Collection<URL> readIconsURLList()
	{
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		// Retourne la liste des URL des icones des drivers...
		Collection<URL> results = new ArrayList<URL>();

		for (IConfigurationElement e : reg.getConfigurationElementsFor("pID.Driver"))
		{
			// Must get the source plugin declaring this configuration element
			Bundle bdl = Platform.getBundle(e.getContributor().getName());
			try
			{
				String iconPath = e.getAttribute("icon");
				results.add((URL) bdl.getEntry(iconPath));
			} 
			catch (Exception ex)
			{
				getLog().log(new Status(IStatus.ERROR, e.getNamespaceIdentifier(), 
						     "Unable to find resource.", ex));
			}
		}
		
		return results;
	}
	
	/** Get a color, assuming key is a Rgb to string format
	 * 
	 * @param key a rgb string readable by StringConverter
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

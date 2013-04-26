package com.opcoach.training.e4.rental.ui;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle This class must be
 * registered as a LifeCycleURI to fill the context
 */
public class RentalUIActivator implements BundleActivator
{

	// The plug-in ID
	public static final String PLUGIN_ID = "com.opcoach.training.e4.rental.ui";

	private static IPreferenceStore preferenceStore;

	public static IPreferenceStore getPreferenceStore()
	{
		// Create the preference store lazily.
		if (preferenceStore == null)
		{
			preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID);

		}
		return preferenceStore;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bcontext) throws Exception
	{

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

	}

}

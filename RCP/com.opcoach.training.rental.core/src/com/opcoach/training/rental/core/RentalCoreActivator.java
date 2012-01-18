package com.opcoach.training.rental.core;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.core.helpers.RentalAgencyGenerator;

/**
 * The activator class controls the plug-in life cycle
 */
public class RentalCoreActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.opcoach.training.rental.core";

	// The shared instance
	private static RentalCoreActivator plugin;
	
	/**
	 * The constructor
	 */
	public RentalCoreActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static RentalCoreActivator getDefault() {
		return plugin;
	}
	
	private static MyRentalAgency agency = null;
	
	public static MyRentalAgency getAgency()
	{
		if (agency == null)
		{
			agency = RentalAgencyGenerator.createSampleAgency();
		}
		return agency;
	}

}

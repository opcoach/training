package com.opcoach.training.rental.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

/**
 * The activator class controls the plug-in life cycle
 */
public class RentalCoreActivator implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.opcoach.training.rental.core";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {

	}

	private static RentalAgency agency = RentalAgencyGenerator.createSampleAgency();

	public static RentalAgency getAgency() {
		return agency;
	}

}

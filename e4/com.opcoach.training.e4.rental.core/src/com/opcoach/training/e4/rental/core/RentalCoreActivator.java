package com.opcoach.training.e4.rental.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class RentalCoreActivator implements BundleActivator {

	// This context is for OSGi (not an injection context) !
	private static BundleContext context;


	public void start(BundleContext bundleContext) throws Exception {
		
		// Store the OSGi context 
		RentalCoreActivator.context = bundleContext;
		
	}

	
	static BundleContext getContext() {
		return context;
	}



	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		RentalCoreActivator.context = null;
	}
	
	
	


}

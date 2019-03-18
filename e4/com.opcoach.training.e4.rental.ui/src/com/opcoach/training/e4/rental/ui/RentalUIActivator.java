package com.opcoach.training.e4.rental.ui;

import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle This class must be
 * registered as a LifeCycleURI to fill the context
 */
public class RentalUIActivator implements BundleActivator
{

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bcontext) throws Exception
	{
	/*	Bundle e4Bundle = Platform.getBundle("org.eclipse.e4.ui.workbench");
		if (e4Bundle != null)
		{
		   IEclipseContext ct = EclipseContextFactory.getServiceContext(e4Bundle.getBundleContext());
		   ct.set(RentalUIConstants.PLUGIN_ID + ".context", "My value");
		}*/
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

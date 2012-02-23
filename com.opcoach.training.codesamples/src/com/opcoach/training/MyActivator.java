package com.opcoach.training;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class MyActivator extends AbstractUIPlugin
{
	private static MyActivator instance;  // Singleton

	public static MyActivator getDefault()
	{
		return instance;
	}

	public  MyActivator()
	{
		super();
		instance = this;
		// ... autres initialisations (lecture point extension par exemple)...
	}	

	public void start(BundleContext context) throws Exception
	{
		super.start(context);
	}
	
	public void stop(BundleContext context) throws Exception
	{
		super.stop(context);
	}
	
	// ... autres methodes (lecture point extension, accesseurs...)
	
	public static void error(String message, Exception exception)
	{
	   IStatus status = new Status(IStatus.ERROR, "pluginId", IStatus.ERROR, message, exception);
	   MyActivator.getDefault().getLog().log(status);
	}


}

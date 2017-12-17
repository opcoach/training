package com.opcoach.training.rental.gef;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class RentalGEFActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.opcoach.training.rental.gef";

	// The shared instance
	private static RentalGEFActivator plugin;
	
	/**
	 * The constructor
	 */
	public RentalGEFActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
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
	public static RentalGEFActivator getDefault() {
		return plugin;
	}
	
	  /**
     * Log an IStatus
     * 
     * @param status
     */
    public static void log(IStatus status)
    {
        getDefault().getLog().log(status);
    }

    /**
     * Log a message with given level into the Eclipse log file
     * 
     * @param message the message to log
     * @param level the message priority
     */
    public static void log(String message, int level)
    {
        IStatus status = new Status(level, PLUGIN_ID, level, message, null);
       
        log(status);
    }

    /**
     * Log an exception into the Eclipse log file
     * 
     * @param e the exception to log
     */
    public static void log(Throwable e)
    {
        if (e instanceof InvocationTargetException)
            e = ((InvocationTargetException) e).getTargetException();

        IStatus status = null;
        if (e instanceof CoreException)
            status = ((CoreException) e).getStatus();
        else
            status = new Status(IStatus.ERROR, PLUGIN_ID, IStatus.OK, "Error", e);

        log(status);
    }

}

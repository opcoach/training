package com.opcoach.training.e4.codesamples;

import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class ContextFromE3Sample
{

	public void getContextFromE3Code()
	{

		//.........................................
		// Get the OSGI global E4 context :
		//.........................................
		Bundle e4Bundle = Platform.getBundle("org.eclipse.e4.ui.workbench");
		if (e4Bundle != null)
		{
			BundleContext e4BundleContext = e4Bundle.getBundleContext();
			IEclipseContext osgiCtx = EclipseContextFactory.getServiceContext(e4BundleContext);
			osgiCtx.set("myKeyInOsgi1", "value");
		}

		//.........................................
		// Get the application E4 context
		//.........................................
		IWorkbench workbench = PlatformUI.getWorkbench();
		IEclipseContext appliCtx = workbench.getService(IEclipseContext.class);
		appliCtx.set("myKeyInAppli", "value");
		
		//.........................................
		// Get the main window E4 context
		//.........................................
		IEclipseContext windowCtx = workbench.getActiveWorkbenchWindow().getService(IEclipseContext.class);
		windowCtx.set("myKeyInWindow", "value");

	}
}

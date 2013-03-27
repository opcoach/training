package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class AnActivatorFillingTheContext implements BundleActivator
{
	@Inject
	public void defineMyService(IEclipseContext context)
	{
		// Create a MyService instance and put it in the context
		ContextInjectionFactory.make(MyService.class, context);
	}

	@Override
	public void start(BundleContext context) throws Exception 	{	}

	@Override
	public void stop(BundleContext context) throws Exception { 	}
	


}

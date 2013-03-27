package com.opcoach.training.e4.codesamples;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.contributions.IContributionFactory;

import com.opcoach.training.e4.codesamples.inject.SimpleCallOrder;

public class CodeSampleAddon
{

	@PostConstruct
	public void createMyObjects( IEclipseContext ctx)
	{
		IContributionFactory factory = ctx.get(IContributionFactory.class);

		String fullName = getClassURI("com.opcoach.training.e4.codesamples", SimpleCallOrder.class.getName());

	   Object o = factory.create(fullName, ctx);
		//IInjector injector = InjectorFactory.getDefault();
		//injector.inject(object, objectSupplier)
	   System.out.println("-----  CallOrder is here instanciated -----" + o);
	   
	   
	}
	
	private String getClassURI(String definingBundleId, String spec) 
	{
		if (spec.startsWith("platform:"))
		{
			return spec;
		} // $NON-NLS-1$
		return "platform:/plugin/" + definingBundleId + '/' + spec;
	}
}

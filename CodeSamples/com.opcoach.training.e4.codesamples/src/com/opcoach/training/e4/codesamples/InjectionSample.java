package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;

public class InjectionSample
{
	@Inject @Optional Toto fieldToto = new Toto();

	@Inject InjectionSample()
	{
		System.out.println("Enter in InjectionSample Constructor ");
	}
	
	@Optional @Inject
	private void aOptionalInjectedMethod(Toto toto)
	{
		System.out.println("Appel de la methode optionnelle avec paramètre toto = " + toto);
	}

	 @Inject
	private void aInjectedMethodWithOptionalParam(@Optional Toto toto)
	{
		System.out.println("Appel de la methode avec paramètre optionnel toto = " + toto);
	}

	 @Override
	public String toString()
	{
		return "InjectionSample with fieldToto = " + fieldToto;
	}
	
	public static void testInjectionSample()
	{
		// TODO Auto-generated method stub
		IEclipseContext ctx = EclipseContextFactory.create();
		InjectionSample sample = ContextInjectionFactory.make(InjectionSample.class, ctx);
		System.out.println("InjectionSample created " + sample);
	}
	
	
	class Toto {}
	
	
	IEclipseContext ctx;
	
	
	
	public void howToUninject()
	{
		
		
		// Object containing @Inject annotations, created with make 
		MyService serv = ContextInjectionFactory.make(MyService.class, ctx);
		
		
		
		// Somewhere in the code, don't forget to uninject it ! 
		ContextInjectionFactory.uninject(serv, ctx);
		
	}

}

package com.opcoach.training.e4.codesamples.inject;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.e4.ui.services.EMenuService;

public class Parent 
{
	public static final String PARAM_IN_PARENT ="parentParam";
	
	
	@Inject  
	public Parent()
	{
		// This method is called first
		System.out.println("----> Parent Call empty Constructor ");
	}

	@Inject  
	public Parent(Adapter adapter)
	{
		// This method is called first
		System.out.println("----> Parent Call Constructor with Adapter ");
	}
	@Inject  
	public Parent(EMenuService service)
	{
		// This method is called first
		System.out.println("----> Parent Call Constructor with Menu Service ");
	}

	@Inject 
	public void parentMethod1()  
	{
		// This method will be called after field init
		System.out.println("----> Parent Call parentMethod1");
	}

	@Inject 
	public void parentMethod2()  
	{
		// This method will be called after field init
		System.out.println("----> Parent Call parentMethod2");
	}

	@Inject 
	public void parentMethodToBeOverriden()
	{
		System.out.println("----> Parent Call parentMethodToBeOverriden ");
	}
	
	@Inject 
	public void parentMethodWithChangeableParam(@Optional @Named(PARAM_IN_PARENT) Object o)
	{
		System.out.println("----> Parent Call parentMethodWithChangeableParam with param : \n" + o);
	}
	
	@PostConstruct
	public void parentMethodPostContruct()
	{
		System.out.println("----> Parent Call : parentMethodPostContruct ");

	}

}

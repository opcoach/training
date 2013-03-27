package com.opcoach.training.e4.codesamples.inject;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;

public class Child extends Parent
{
	public static final String PARAM_IN_CHILD ="myparam";
	
	private long ID = System.currentTimeMillis();
	
	// --> Child  Call #2 field is initialized after call to constructor
	@Inject  
	private ESelectionService selectionService;

	
	public Child()
	{		
		System.out.println("--> Child  Call : constructor (empty)");

	}
	@Inject   // --> Child  Call #1
	public Child(EMenuService mservice)
	{
		System.out.println("--> Child  Call : constructor (EMenuService)");

	}

	@Inject // --> Child  Call #3
	public void childMethod1()  
	{
		// This method will be called after field init
		System.out.println("--> Child  Call : childMethod1");

	}
	
	@Inject // --> Child  Call #4
	public void childMethod2()
	{
		System.out.println("--> Child  Call : childMethod2");
	}
	
	@Inject // --> Child  Calls #5 with a value change 
	public void childMethodWithChangeableParam(@Optional @Named(PARAM_IN_CHILD) Object o)
	{
		System.out.println("--> Child  Call : childMethodWithChangeableParam\n" + o);
	}
	
	@Override
	@Inject // --> Child  Call #4
	public void parentMethodToBeOverriden()
	{
		System.out.println("--> Child  Call : parentMethodToBeOverriden");
	}
	
	@PostConstruct
	public void childMethodPostContruct1()
	{
		System.out.println("--> Child  Call : childMethodPostContruct1");

	}
	@PostConstruct
	public void childMethodPostContruct2()
	{
		System.out.println("--> Child  Call : childMethodPostContruct2");

	}
	
	
	@Override
	public String toString()
	{
		return "Child : " + ID;
	}

	

}

package com.opcoach.training.e4.samples;

import javax.inject.Inject;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;

public class CallOrder
{
	// --> Call #2 field is initialized after call to constructor
	@Inject  
	private ESelectionService selectionService;

	
	@Inject   // --> Call #1
	public CallOrder(EMenuService mservice)
	{
		// This method is called first
	}

	@Inject // --> Call #3
	public void aMethod()  
	{
		// This method will be called after field init
	}
	
	@Inject // --> Call #4
	public void anotherMethod(IStylingEngine eng)
	{
		// This method will be called after another method
	}
	

}

package com.opcoach.training.e4.codesamples.inject;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;

public class SimpleCallOrder
{
	public static final String MYPARAM = "myparam";
	private int nbCall = 1;

	// --> Call #2 field is initialized after call to constructor
	@Inject
	private ESelectionService selectionService;

	@Inject
	// --> Call #1
	public SimpleCallOrder(EModelService mservice)
	{
		// This method is called first
		System.out.println("Call Order : call #" + nbCall++ + ", constructor" + dispField());
	}

	@Inject
	// --> Call #3 (after field init)
	public void aMethod()
	{
		// Display the call of field init (can not be catched elsewhere)
		System.out.println("Call Order : call #" + nbCall++ + ", init Fields" + dispField());
		System.out.println("Call Order : call #" + nbCall++ + ", aMethod" + dispField());
	}

	@Inject
	// --> Call #4
	public void anotherMethod()
	{
		System.out.println("Call Order : call #" + nbCall++ + ", anotherMethod" + dispField());
	}

	@Inject
	// --> Calls #5 and #6 after a value change
	public void methodWithInjectedParam(@Optional @Named(MYPARAM) Object o)
	{
		System.out.println("Call Order : call #" + nbCall++ + ", methodWithInjectedParam, param is " + o);
	}

	private String dispField()
	{
		return ", field is : " + ((selectionService != null) ? "now initialized " : "null");
	}

}

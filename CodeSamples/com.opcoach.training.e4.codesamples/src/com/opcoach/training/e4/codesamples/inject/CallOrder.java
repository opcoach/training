package com.opcoach.training.e4.codesamples.inject;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;

public class CallOrder
{
	  public static final String MYPARAM = "myparam";

	  // --> Call #2 field is initialized after call to constructor
	  @Inject
	  private ESelectionService selectionService;

	  @Inject
	  // --> Call #1   Constructor is called first
	  public CallOrder()  { }

	  @Inject
	  // --> Call #3 (after field init)
	  public void aMethod() 	{ }

	  @Inject
	  // --> Call #4
	  public void anotherMethod()  { }

	  @Inject
	  // --> Call #5 and after when a value change
	  public void methodWithInjectedParam(@Optional @Named(MYPARAM) Object o)	{ }
	
  	  @PostConstruct
	  // --> Call #6 at the end 
	  public void endOfInit() { }

}

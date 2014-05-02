package com.opcoach.training.e4.codesamples.inject2;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;

public class Child extends Parent
{
	public static final String PARAM_IN_CHILD ="myparam";
	
	@Inject private ESelectionService selectionService;

	public Child() 	{}
	@Inject public Child(EMenuService ss)	{}
	
	@Inject public void childMethod1()  	{}
	@Inject public void childMethod2()      {}
	@Inject public void childMethodWithChangeableParam (@Optional 
			            @Named(PARAM_IN_CHILD) Object o) {}
	
	@Override @Inject public void parentMethodToBeOverriden() {}
	
	@PostConstruct public void childMethodPostContruct() {}

}

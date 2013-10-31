package com.opcoach.training.e4.codesamples.inject2;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;

public class Parent 
{
	public static final String PARAM_IN_PARENT="parentParam";
	
    public Parent() {}

	@Inject public Parent(Adapter adapter)      {}
	@Inject public Parent(EMenuService service) {}

	@Inject public void parentMethod1()   {}
	@Inject public void parentMethod2()   {}
	@Inject public void parentMethodToBeOverriden() {}
	@Inject public void parentMethodWithChangeableParam(@Optional 
			                       @Named(PARAM_IN_PARENT) Object o) {}
	
	@PostConstruct	public void parentMethodPostContruct() {}

}

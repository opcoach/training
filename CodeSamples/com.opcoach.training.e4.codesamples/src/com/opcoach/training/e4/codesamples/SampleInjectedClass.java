package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;

public class SampleInjectedClass
{
	// An injected field
	@Inject
	private MyService service;
	
	@Inject
	public SampleInjectedClass(Object1 object, @Optional Object2 o2)
	{
		// An injected constructor with 2nd parameter optional
	}
	
	@Inject
	public void anInjectedMethod(Object2 o2)
	{
		// An injected method
	}
	
}

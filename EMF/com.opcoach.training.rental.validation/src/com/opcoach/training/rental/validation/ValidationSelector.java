package com.opcoach.training.rental.validation;

import org.eclipse.emf.validation.model.IClientSelector;

public class ValidationSelector implements IClientSelector
{

	@Override
	public boolean selects(Object object)
	{
		System.out.println("In validation selector");
		// TODO Auto-generated method stub
		return true;
	}

}

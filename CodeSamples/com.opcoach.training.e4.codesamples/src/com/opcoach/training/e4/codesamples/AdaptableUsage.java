package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.e4.ui.services.IServiceConstants;

public class AdaptableUsage
{

	@Inject
	public void useObjectAsCustomer(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object o, 
									Adapter adapter)
	{
		// Try to translate the selected Object o into a Customer instance
		Customer cust = (Customer) adapter.adapt(o, Customer.class);

		// If we get it, we use it
		if (cust != null)
		{
			setCustomer(cust);
		}
	}
	
	
	

	private void setCustomer(Customer c)
	{
	}
}

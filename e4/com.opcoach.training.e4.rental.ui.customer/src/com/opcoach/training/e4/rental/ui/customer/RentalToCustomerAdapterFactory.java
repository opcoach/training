package com.opcoach.training.e4.rental.ui.customer;

import org.eclipse.core.runtime.IAdapterFactory;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;

/** Transform a rental into a customer. Just extract customer from rental */
public class RentalToCustomerAdapterFactory implements IAdapterFactory
{
	/** Transform an IFile into a Rental object if extension is .rental */
	public Object getAdapter(Object adaptableObject, Class adapterType)
	{
		Customer result = null;
		if ((adaptableObject instanceof Rental) && (adapterType == Customer.class))
		{
			result = ((Rental)adaptableObject).getCustomer();
		}
		return result;
	}

	public Class[] getAdapterList()
	{
		// Result returned types
		return new Class[] { Customer.class };
	}

}

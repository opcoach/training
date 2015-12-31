package com.opcoach.training.rental.adapters;

import org.eclipse.core.runtime.IAdapterFactory;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;

public class RentalAdapterFactory implements IAdapterFactory
{
	/** Transform a Rental instance into a Customer instance */
	@SuppressWarnings("unchecked")
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType)
	{
		T result = null;
		if ((adaptableObject instanceof Rental) && (adapterType == Customer.class))
		{
			result =  (T) ((Rental)adaptableObject).getCustomer();
		}
		return result;
	}

	public Class<?>[] getAdapterList()
	{
		// Result returned types
		return new Class[] { Customer.class };
	}

}

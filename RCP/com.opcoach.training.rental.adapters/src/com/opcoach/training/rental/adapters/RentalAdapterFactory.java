package com.opcoach.training.rental.adapters;

import org.eclipse.core.runtime.IAdapterFactory;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;

public class RentalAdapterFactory implements IAdapterFactory
{
	/** Transform an IFile into a Rental object if extension is .rental */
	public Object getAdapter(Object adaptableObject, Class adapterType)
	{
		Object result = null;
		if ((adaptableObject instanceof Rental) && (adapterType == Customer.class))
		{
			result =  ((Rental)adaptableObject).getCustomer();
		}
		return result;
	}

	public Class[] getAdapterList()
	{
		// Result returned types
		return new Class[] { Customer.class };
	}

}

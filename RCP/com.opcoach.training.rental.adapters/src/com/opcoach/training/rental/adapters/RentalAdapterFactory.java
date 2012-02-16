package com.opcoach.training.rental.adapters;

import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.core.RentalCoreActivator;

public class RentalAdapterFactory implements IAdapterFactory
{
	/** Transform an IFile into a Rental object if extension is .rental */
	public Object getAdapter(Object adaptableObject, Class adapterType)
	{
		Rental result = null;
		if ((adaptableObject instanceof IFile) && (adapterType == Rental.class))
		{
			IFile f = (IFile) adaptableObject;
			if (f.getFileExtension().equals("rental"))
			{
				// Create a sample rental object... does not read the file...
				MyRentalAgency agency = RentalCoreActivator.getAgency();
				Customer c = agency.getCustomers().get(0);
				RentalObject ro = agency.getObjectsToRent().get(0);
				result = agency.book(c, ro, new Date(), new Date());
			}
		}
		return result;
	}

	public Class[] getAdapterList()
	{
		// Result returned types
		return new Class[] { Rental.class };
	}

}

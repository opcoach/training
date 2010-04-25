package com.opcoach.training.rental.adapter;

import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.core.RentalCoreActivator;

public class RentalAdapterFactory implements IAdapterFactory
{

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType)
	{
		if (adaptableObject instanceof IFile)
		{
			IFile f = (IFile) adaptableObject;
			if (f.getFileExtension().equals("rental"))
			{
				RentalAgency agency  = RentalCoreActivator.getAgency();

				Customer c = agency.getCustomers().get(0);
				RentalObject ro = agency.getObjectsToRent().get(0);
			
				Rental r = agency.book(c,ro, new Date(), new Date());
				return r;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class[] getAdapterList()
	{
		// TODO Auto-generated method stub
		return new Class[] { Rental.class };
	}

}

package com.opcoach.training.rental.impl;

import java.util.Date;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;

public class MyRentalAgencyImpl extends RentalAgencyImpl implements MyRentalAgency
{

	@Override
	public Rental book(Customer customer, RentalObject rentedObject, Date from, Date to)
	{
		System.out.println("Methode book surchargée");
		return super.book(customer, rentedObject, from, to);
	}
	
	public void addCustomer(Customer customer)

	{
		getCustomers().add(customer);
	}

	
	public void addObject(RentalObject object)
	{
		getObjectsToRent().add(object);
	}

	


	
	public void removeCustomer(Customer customer)
	{
		customer.setParentAgency(null);
		getCustomers().remove(customer);
	}

	
	public void removeObject(RentalObject object)
	{
		object.setParentAgency(null);
		getObjectsToRent().remove(object);
	}
}

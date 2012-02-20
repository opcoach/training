package com.opcoach.training.rental.impl;

import java.util.Date;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.MyRentalFactory;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;

public class MyRentalAgencyImpl extends RentalAgencyImpl implements MyRentalAgency
{
	@Override
	public Rental book(Customer customer, RentalObject rentedObject, Date from, Date to)
	{
		System.out.println("book method overriden");  // ancestor throws exception
		Rental r = MyRentalFactory.eINSTANCE.createRental();
		r.setStartDate(from);
		r.setEndDate(to);
		r.setCustomer(customer);
		r.setRentedObject(rentedObject);
		addRental(r);
		return r;
	}
	
	public void addRental(Rental object) { 	getRentals().add(object); }

	public void removeRental(Rental object) {  getRentals().remove(object); }

}

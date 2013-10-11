package com.opcoach.training.e4.rental.core.test;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalFactory;
import com.opcoach.training.rental.RentalObject;

public class TestAgency
{

	@Test
	public void testBook()
	{
		RentalFactory rf = RentalFactory.eINSTANCE;
		
		RentalAgency a = rf.createRentalAgency();
		a.setName("Paris");
		
		Customer c1 = rf.createCustomer();
		c1.setFirstName("Henri");
		c1.setLastName("Marticou");
		a.getCustomers().add(c1);
		
		RentalObject velo  = rf.createRentalObject();
		velo.setName("Velo");
		a.getObjectsToRent().add(velo);
		
		Date now = new Date();
		Rental r = a.book(c1,velo,new Date(), new Date(now.getTime()+7*24*3600000L));
		
		assertTrue("Henri est le loueur", r.getCustomer().getFirstName().equals(c1.getFirstName()));
		assertTrue("Le velo est loué", r.getRentedObject().getName().equals(velo.getName()));
		assertTrue("La durée de location est 1 semaine", (r.getEndDate().getTime() - r.getStartDate().getTime()) == 7*24*3600000L);
		
	}

}

package com.opcoach.training.rental.core.test;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalFactory;
import com.opcoach.training.rental.RentalObject;

public class TestRentalAgency {


	@Test
	public void testBook() {
		
		RentalAgency agency =  RentalFactory.eINSTANCE.createRentalAgency();
		Customer c = RentalFactory.eINSTANCE.createCustomer();
		c.setFirstName("Pierre");
		c.setLastName("Dupond");
		RentalObject o = RentalFactory.eINSTANCE.createRentalObject();
		o.setName("Velo");
		
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime() + 3600L*24*7);
		
		agency.book(c, o, d1, d2);
		
		assertTrue("L'agence doit contenir une location", agency.getRentals().size() == 1);
		
	}

}

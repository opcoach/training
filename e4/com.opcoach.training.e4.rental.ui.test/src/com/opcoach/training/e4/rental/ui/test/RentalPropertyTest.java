package com.opcoach.training.e4.rental.ui.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.opcoach.e4tester.core.E4TestCase;
import com.opcoach.training.e4.rental.ui.parts.RentalPropertyPart;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class RentalPropertyTest extends E4TestCase {

	MPart part;

	@BeforeEach 
	public void setUp() throws Exception {
		
		// Create the property part for the test...
		part = createTestPart("Rental Property", RentalPropertyPart.VIEW_ID, RentalPropertyPart.class);
	}

	
	/** Simulate a rental selection in the UI */
	private Rental selectRental(int i) {
		Rental r = getContext().get(RentalAgency.class).getRentals().get(i);
		System.out.println("Current selected rental is : " + r);

		getSync().syncExec(()->getSelectionService().setSelection(r));
		wait1second();
		return r;
	}


	@Test
	public void testCreatePart() throws InterruptedException {

		assertNotNull(part, "The rentalPropertyPart must be created");
		// Test it must contains the expected value of the default rental object
		String objectLabel = getTextWidgetValue(part, "rentedObjectLabel");

		assertEquals("Perceuse Electrique", objectLabel, "The default rental must display 'Perceuse Electrique'");

	}

	@Test
	public void testSetSelection()  {

		Rental r = selectRental(1);

		assertEquals(r.getCustomer().getDisplayName(),
				getTextWidgetValue(part, "customerNameLabel"),
				"Customer Name displayed is not correct");
	}

	

	@Test
	@DisplayName("Test if a rental is  selected, and then a customer")
	public void testSetTwoSelections() {

		// Select a rental (that will update property view)
		Rental r = selectRental(1);
		assertEquals(r.getCustomer().getDisplayName(),
				getTextWidgetValue(part, "customerNameLabel"), "Customer Name displayed is not correct");

		// Then select a customer (that must not be received by property view)
	/*	Customer c = getContext().get(RentalAgency.class).getCustomers().get(2);
		getSelectionService().setSelection(c);
		System.out.println("Then set this customer " + c.getDisplayName());
		wait1second();

		// The selection must be the same (not updated)
		assertEquals("Customer Name displayed is not correct", r.getCustomer().getDisplayName(),
				getTextWidgetValue(part, "customerNameLabel"));
				*/
	}

}

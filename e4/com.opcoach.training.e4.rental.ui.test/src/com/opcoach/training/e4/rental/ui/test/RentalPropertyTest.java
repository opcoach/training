package com.opcoach.training.e4.rental.ui.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.opcoach.e4tester.core.E4TestCase;
import com.opcoach.training.e4.rental.ui.parts.RentalPropertyPart;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class RentalPropertyTest extends E4TestCase {

	MPart part;

	@Before // See issue #3 (https://github.com/opcoach/E4Tester/issues/3), replace with
			// BeforeEach later
	public void setUp() throws Exception {
		
		// Create the property part for the test...
		part = createTestPart("Rental Property", RentalPropertyPart.VIEW_ID, RentalPropertyPart.class);
	}

	
	/** Simulate a rental selection in the UI */
	private Rental selectRental(int i) {
		Rental r = getContext().get(RentalAgency.class).getRentals().get(i);
		System.out.println("Current selected rental is : " + r);

		getSelectionService().setSelection(r);
		wait1second();
		return r;
	}


	@Test
	public void testCreatePart() throws InterruptedException {

		assertNotNull("The rentalPropertyPart must be created", part);
		// Test it must contains the expected value of the default rental object
		String objectLabel = getTextWidgetValue(part, "rentedObjectLabel");

		assertEquals("The default rental must display 'Perceuse Electrique'", objectLabel, "Perceuse Electrique");

	}

	@Test
	public void testSetSelection()  {

		Rental r = selectRental(1);

		assertEquals("Customer Name displayed is not correct", r.getCustomer().getDisplayName(),
				getTextWidgetValue(part, "customerNameLabel"));
	}

	

	@Test
	// For junit5 when available in tycho : @DisplayName("Test if a rental is
	// selected, and then a customer")
	public void testSetTwoSelections() {

		// Select a rental (that will update property view)
		Rental r = selectRental(1);
		assertEquals("Customer Name displayed is not correct", r.getCustomer().getDisplayName(),
				getTextWidgetValue(part, "customerNameLabel"));

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

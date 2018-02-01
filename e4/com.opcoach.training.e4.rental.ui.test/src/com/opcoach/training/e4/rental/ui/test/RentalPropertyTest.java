package com.opcoach.training.e4.rental.ui.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.opcoach.e4tester.core.E4BaseTester;
import com.opcoach.training.e4.rental.ui.parts.RentalPropertyPart;

public class RentalPropertyTest extends E4BaseTester { 

	MPart part;

	@Before // See issue #3 (https://github.com/opcoach/E4Tester/issues/3), replace with
			// BeforeEach later
	public void setUp() throws Exception {
		System.out.println("Testing RentalPropertyTest... ");
		// Create a part for the test...
		try {
			part = createTestPart("Rental Property", RentalPropertyPart.VIEW_ID, RentalPropertyPart.class);
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}

	@After // See issue #3 (https://github.com/opcoach/E4Tester/issues/3), replace with
			// AfterEach later
	public void release() {
		// ContextInjectionFactory.uninject(part, ctx);
		wait1second();
		cleanTestWindow();
		part = null;
	}

	@Test
	public void testCreatePart() throws InterruptedException {

		// Junit 5 : assertNotNull(part, "The rentalPropertyPart must be created");
		assertNotNull("The rentalPropertyPart must be created", part);
		// Test it must contains the expected value of the default rental object
		
		String objectLabel = getTextWidgetValue(part, "rentedObjectLabel");

		// JUnit 5 : assertEquals(objectLabel, "Perceuse Electrique", "La location par
		// défaut doit afficher perceuse electrique");
		assertEquals("The default rental must display 'Perceuse Electrique'", objectLabel, "Perceuse Electrique");

	}

	// @Test
	// For junit5 when available in tycho : @DisplayName("Test if a rental is
	// selected")
	/*
	 * public void testSetSelection() throws InterruptedException {
	 * 
	 * Rental r = ctx.get(RentalAgency.class).getRentals().get(1);
	 * 
	 * ctx.set(IServiceConstants.ACTIVE_SELECTION, r); wait1second();
	 * 
	 * // JUnit 5 : assertEquals(r.getCustomer().getDisplayName(), //
	 * getTextWidgetValue(part, "customerNameLabel"), //
	 * "Customer Name displayed is not correct");
	 * assertEquals("Customer Name displayed is not correct",
	 * r.getCustomer().getDisplayName(), getTextWidgetValue(part,
	 * "customerNameLabel")); }
	 */

	/** Simulate a rental selection in the UI */
	/*
	 * private Rental selectRental(int i) { Rental r =
	 * ctx.get(RentalAgency.class).getRentals().get(i);
	 * System.out.println("Current selected rental is : " + r);
	 * 
	 * ctx.set(IServiceConstants.ACTIVE_SELECTION, r); wait1second(); return r; }
	 */

	// @Test
	// For junit5 when available in tycho : @DisplayName("Test if a rental is
	// selected, and then a customer")
	/*
	 * public void testSetTwoSelections() throws InterruptedException {
	 * 
	 * Rental r = selectRental(1); Customer c =
	 * ctx.get(RentalAgency.class).getCustomers().get(2);
	 * ctx.set(IServiceConstants.ACTIVE_SELECTION, c);
	 * System.out.println("Then set this customer " + c.getDisplayName());
	 * wait1second();
	 * 
	 * // The selection must be the same (not updated) // Junit5 :
	 * assertEquals(r.getCustomer().getDisplayName(), // getTextWidgetValue(part,
	 * "customerNameLabel"), // "Customer Name displayed is not correct");
	 * assertEquals("Customer Name displayed is not correct",
	 * r.getCustomer().getDisplayName(), getTextWidgetValue(part,
	 * "customerNameLabel")); }
	 */

}

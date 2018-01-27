package com.opcoach.training.e4.rental.ui.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.opcoach.training.e4.rental.ui.parts.RentalAgencyPart;
import com.opcoach.training.e4.rental.ui.parts.RentalPropertyPart;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class AgencyViewTest extends RentalTester {

	RentalAgencyPart part;

	@Before // See issue #3 (https://github.com/opcoach/E4Tester/issues/3), replace with
	// BeforeEach later
	public void setUp() throws Exception {
	//	RentalAgencyPart part = createPojoPart(RentalAgencyPart.class);
	//	ctx.set(RentalAgencyPart.class, part);

	}

	@After // See issue #3 (https://github.com/opcoach/E4Tester/issues/3), replace with
	// AfterEach later
	public void release() {
	//	ContextInjectionFactory.uninject(part, ctx);
	//	part = null;
	}

	@Test
	public void testCreateContent() throws InterruptedException {

		// JUnit 5 : assertNotNull(ctx.get(RentalAgencyPart.class), "The
		// rentalAgencyPart must be created" );
	//	assertNotNull("The rentalAgencyPart must be created", ctx.get(RentalAgencyPart.class));
	}

	/* @Test
	public void testSetSelection() {

		Rental r = ctx.get(RentalAgency.class).getRentals().get(1);

		ctx.set(IServiceConstants.ACTIVE_SELECTION, r);
		wait1second();

		// Check widget in UI
		assertTrue(true);
	} */

}

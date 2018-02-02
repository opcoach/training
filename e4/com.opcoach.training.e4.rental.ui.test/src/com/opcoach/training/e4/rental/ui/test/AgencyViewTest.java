package com.opcoach.training.e4.rental.ui.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.TreeViewer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.opcoach.e4tester.core.E4TestCase;
import com.opcoach.training.e4.rental.ui.parts.RentalAgencyPart;
import com.opcoach.training.e4.rental.ui.parts.RentalPropertyPart;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

/** This test case is a simple test with only the agency part */
public class AgencyViewTest extends E4TestCase {

	MPart part;

	@Before // See issue #3 (https://github.com/opcoach/E4Tester/issues/3), replace with
	// BeforeEach later
	public void setUp() throws Exception {
//		System.out.println("Testing AgencyViewTest... ");
		part = createTestPart("Rental Agency", RentalAgencyPart.VIEW_ID, RentalAgencyPart.class);
//		ctx.set(RentalAgencyPart.class, part);

	}

	@After // See issue #3 (https://github.com/opcoach/E4Tester/issues/3), replace with
	// AfterEach later
	public void release() {
		wait1second();
		cleanTestWindow();
		part = null;
	}

	@Test
	public void testCreateContent() throws InterruptedException {

		// JUnit 5 : assertNotNull(ctx.get(RentalAgencyPart.class), "The
		// rentalAgencyPart must be created" );
		assertNotNull("The rentalAgencyPart must be created", part);
	}

	@Test
	public void testExpand() {

		TreeViewer tv = getTreeViewer(part.getObject(), "agencyViewer");
		tv.expandAll();

		Object[] expanded = tv.getExpandedElements();
		RentalAgency a = part.getContext().get(RentalAgency.class);
		// There are 2 agencies with nodes in this application
		int nbExpectedNodes = 1 + 3 + a.getCustomers().size() + a.getRentals().size() + a.getObjectsToRent().size();
		assertEquals("There must be " + nbExpectedNodes + " expanded nodes", nbExpectedNodes, 2 * expanded.length);

	}

}

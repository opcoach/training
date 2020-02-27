package com.opcoach.training.e4.rental.ui.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.viewers.TreeViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.opcoach.e4tester.core.E4TestCase;
import com.opcoach.training.e4.rental.ui.parts.RentalAgencyPart;
import com.opcoach.training.rental.RentalAgency;

/** This test case is a simple test with only the agency part */
public class AgencyViewTest extends E4TestCase {

	MPart part;

	@BeforeEach 
	public void setUp() throws Exception {
		part = createTestPart("Rental Agency", RentalAgencyPart.VIEW_ID, RentalAgencyPart.class);

	}


	@Test
	public void testCreateContent() throws InterruptedException {

		assertNotNull(part, "The rentalAgencyPart must be created");
	}

	@Test
	public void testExpand() {

		TreeViewer tv = getTreeViewer(part, "agencyViewer");
		Object[] expanded = getExpandElements(tv);

		
		RentalAgency a = part.getContext().get(RentalAgency.class);
		// There are 2 agencies with nodes in this application
		int nbExpectedNodes = 1 + 3 + a.getCustomers().size() + a.getRentals().size() + a.getObjectsToRent().size();
		assertEquals( nbExpectedNodes, 2 * expanded.length, "There must be " + nbExpectedNodes + " expanded nodes");

	}

}

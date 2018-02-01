package com.opcoach.training.e4.rental.ui.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.opcoach.e4tester.core.E4BaseTester;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.e4.rental.ui.parts.AgencyContentProvider;
import com.opcoach.training.e4.rental.ui.parts.RentalAgencyPart;
import com.opcoach.training.e4.rental.ui.parts.RentalPropertyPart;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class AgencyViewAndPropertyPartTest extends E4BaseTester {

	MPart propertyPart, agencyPart;

	@Before // See issue #3 (https://github.com/opcoach/E4Tester/issues/3), replace with
			// BeforeEach later
	public void setUp() throws Exception {
		
		System.out.println("Testing AgencyViewAndPropertyPartTest... ");
		// Create a part for the test...
		try {
			propertyPart = createTestPart("Rental Property", RentalPropertyPart.VIEW_ID, RentalPropertyPart.class);
			agencyPart = createTestPart("Rental Agency", RentalAgencyPart.VIEW_ID, RentalAgencyPart.class);

			// Must expand all nodes for selection ! 
			TreeViewer tv = getTreeViewer(agencyPart.getObject(), "agencyViewer");
			tv.expandAll();

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
				propertyPart = null;
				agencyPart = null;

	}

	@Test
	public void testCreateParts() throws InterruptedException {

		assertNotNull( "The rentalPropertyPart must be created", propertyPart);
		assertNotNull( "The agencyPart must be created", agencyPart);
		
	}

	@Test
	// For junit5 when available in tycho : @DisplayName("Test if a rental is
	// selected")
	public void testRentalSelection() throws InterruptedException {

		RentalAgency a = getContext().get(RentalAgency.class);
		
		Rental rental = a.getRentals().get(1);
		selectObjectInTreeViewer(agencyPart, "agencyViewer", rental);
		
		wait1second();
		
		assertEquals("Customer Name displayed is not correct", rental.getCustomer().getDisplayName(),
				getTextWidgetValue(propertyPart, "customerNameLabel"));
	}


	

}

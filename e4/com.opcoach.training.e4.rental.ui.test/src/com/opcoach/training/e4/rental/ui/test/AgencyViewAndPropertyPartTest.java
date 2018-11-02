package com.opcoach.training.e4.rental.ui.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.viewers.TreeViewer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.opcoach.e4tester.core.E4TestCase;
import com.opcoach.training.e4.rental.ui.parts.RentalAgencyPart;
import com.opcoach.training.e4.rental.ui.parts.RentalPropertyPart;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class AgencyViewAndPropertyPartTest extends E4TestCase {

	MPart propertyPart, agencyPart;

	@BeforeEach 
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

	@AfterEach 
	public void release() {
		
		// ContextInjectionFactory.uninject(part, ctx);
				wait1second();
				cleanTestWindow();
				propertyPart = null;
				agencyPart = null;

	}

	@Test
	public void testCreateParts() throws InterruptedException {

		assertNotNull( propertyPart, "The rentalPropertyPart must be created" );
		assertNotNull( agencyPart, "The agencyPart must be created" );
		
	}

	@Test
    @DisplayName("Test if a rental is  selected")
	public void testRentalSelection() throws InterruptedException {

		RentalAgency a = getContext().get(RentalAgency.class);
		
		Rental rental = a.getRentals().get(1);
		selectObjectInTreeViewer(agencyPart, "agencyViewer", rental);
		
		wait1second();
		
		assertEquals(rental.getCustomer().getDisplayName(),
				getTextWidgetValue(propertyPart, "customerNameLabel"), "Customer Name displayed is not correct");
	}


	

}

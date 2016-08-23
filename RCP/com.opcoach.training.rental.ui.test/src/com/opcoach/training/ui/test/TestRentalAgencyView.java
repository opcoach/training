package com.opcoach.training.ui.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotPerspective;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotLabel;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.AfterClass;
import org.junit.Test;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.core.RentalCoreActivator;
import com.opcoach.training.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.ui.perspective.RentalPerspective;
import com.opcoach.training.rental.ui.views.agency.RentalAgencyView;
import com.opcoach.training.rental.ui.views.rental.RentalPropertyView;

public class TestRentalAgencyView implements RentalUIConstants {

	private static final SWTWorkbenchBot bot = new SWTWorkbenchBot();

	@Test
	public void testSelectRental() {
		
		SWTBotPerspective rentalPerspective = bot.perspectiveById(RentalPerspective.ID);
		rentalPerspective.activate();
		
		SWTBotView rentalAgencyView = bot.viewById(RentalAgencyView.VIEW_ID);
		assertNotNull(rentalAgencyView);	
		assertEquals("Title must be Rental Agency View", "Rental Agency View", rentalAgencyView.getTitle());
		
		SWTBotView rentalPropertyView = bot.viewById(RentalPropertyView.VIEW_ID);
		assertNotNull(rentalPropertyView);
		
		SWTBotTree t = rentalAgencyView.bot().tree(0);  // Use index when only one tree, else use treeWithId
		// Open the second node in 'Rentals' part
		Rental r = RentalCoreActivator.getAgency().getRentals().get(1);
		// Get the second node in tree after expand
		SWTBotTreeItem item = t.expandNode("Toulouse", RENTALS_NODE).expand().getNode(1);
		assertEquals("Second item in tree must be second rental", item.getText(), r.toString());
		
		// Select this item and check selection in property view
		item.select();
        SWTBotLabel label = rentalPropertyView.bot().label(0); 
 		assertEquals("Lave Moquette must be displayed ", label.getText(), r.getRentedObject().getName());

		
	}
	
	
	@AfterClass
	public static void sleep()
	{
		bot.sleep(10000);
	}

}

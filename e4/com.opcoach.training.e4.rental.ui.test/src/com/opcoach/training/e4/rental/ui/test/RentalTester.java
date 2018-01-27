package com.opcoach.training.e4.rental.ui.test;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.swt.widgets.Display;
import org.junit.BeforeClass;

import com.opcoach.e4tester.core.E4PartTester;
import com.opcoach.training.e4.rental.ui.RentalAddon;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.e4.rental.ui.test.e4Stubs.EclipseAdapter;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

/** base class for all unit test of this E4 UI Project... */
public class RentalTester  extends E4PartTester implements RentalUIConstants {
	
	/** Add here special init for the project ... */
	@BeforeClass // See issue #3 (https://github.com/opcoach/E4Tester/issues/3), replace with BeforeAll later
	public static void initRentalStuff() throws Exception {

		Display.getCurrent();
		
		ctx.set(RentalAgency.class, RentalAgencyGenerator.createSampleAgency());
		ctx.set(Adapter.class, new EclipseAdapter());
		
		// Create addon to load rental stuff
		ContextInjectionFactory.make(RentalAddon.class, ctx);

		openContextSpy();
	}
	

	
}

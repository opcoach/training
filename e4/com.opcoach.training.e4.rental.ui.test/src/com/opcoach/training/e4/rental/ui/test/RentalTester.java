package com.opcoach.training.e4.rental.ui.test;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.junit.BeforeClass;

import com.opcoach.e4tester.core.E4BaseTester;
import com.opcoach.training.e4.rental.ui.RentalAddon;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.e4.rental.ui.test.e4Stubs.EclipseAdapter;

/** base class for all unit test of this E4 UI Project... */
public class RentalTester  extends E4BaseTester implements RentalUIConstants {
	
	/** Add here special init for the project ... */
	@BeforeClass // See issue #3 (https://github.com/opcoach/E4Tester/issues/3), replace with BeforeAll later
	public static void initRentalStuff() throws Exception {

        getContext().set(Adapter.class, new EclipseAdapter());
		
		// Create addon to load rental stuff
		ContextInjectionFactory.make(RentalAddon.class, getContext());
	}
	

	
}

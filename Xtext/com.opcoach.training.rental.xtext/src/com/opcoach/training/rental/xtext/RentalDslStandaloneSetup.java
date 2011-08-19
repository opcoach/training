
package com.opcoach.training.rental.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RentalDslStandaloneSetup extends RentalDslStandaloneSetupGenerated{

	public static void doSetup() {
		new RentalDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


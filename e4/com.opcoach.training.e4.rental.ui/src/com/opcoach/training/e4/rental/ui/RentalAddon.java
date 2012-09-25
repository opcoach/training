 
package com.opcoach.training.e4.rental.ui;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.core.contexts.IEclipseContext;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

public class RentalAddon {
	//@Inject
	//IEventBroker eventBroker;
	
	@PostConstruct
	void hookListeners(IEclipseContext ctx) {
		// Hook event listeners
		ctx.set(RentalAgency.class, RentalAgencyGenerator.createSampleAgency());
	}
	
	@PreDestroy
	void unhookListeners() {
		// Unhook event listeners
	}
}
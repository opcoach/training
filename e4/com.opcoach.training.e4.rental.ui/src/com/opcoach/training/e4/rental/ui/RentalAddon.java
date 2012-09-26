 
package com.opcoach.training.e4.rental.ui;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

public class RentalAddon {
	//@Inject
	//IEventBroker eventBroker;
	
	@PostConstruct
	void hookListeners(IEclipseContext ctx) {
		// Hook event listeners
		ctx.set(RentalAgency.class, RentalAgencyGenerator.createSampleAgency());
		//ctx.set(ImageRegistry.class, getLocalImageRegistry() );
		//ctx.set(IPreferenceStore.class, new ScopedPreferenceStore(new InstanceScope(),PLUGIN_ID)

	}
	
	@PreDestroy
	void unhookListeners() {
		// Unhook event listeners
	}
}
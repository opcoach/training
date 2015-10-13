package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.workbench.UIEvents;

public class EventBrokerUsage
{

	
	@Inject
	IEventBroker broker;
	
	@Execute
	void execute()
	{
		// Create a new rental using factory
		Rental r = RentalFactory.eInstance.createRental();
		
		// broadcast the rental creation in broker
		broker.send("rental/new", r);
	}
	
	
	
	
	public class RentalReact
	{
		@Inject 
		@Optional
		void reactOnRentalEvent(@UIEventTopic("rental/*") Rental newRental)
		{
			// Use the rental to update it in a view for instance
		}
		
	}
	
	
	public void refreshAllWorkbench()
	{
		
		
		broker.send(UIEvents.REQUEST_ENABLEMENT_UPDATE_TOPIC, UIEvents.ALL_ELEMENT_ID); 

	}
}

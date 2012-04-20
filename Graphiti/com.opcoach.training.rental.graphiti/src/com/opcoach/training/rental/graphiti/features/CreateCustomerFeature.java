package com.opcoach.training.rental.graphiti.features;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.examples.common.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalFactory;
import com.opcoach.training.rental.graphiti.RentalDiagramTypeProvider;

public class CreateCustomerFeature extends AbstractCreateFeature
{
	public CreateCustomerFeature(IFeatureProvider fp)
	{
		super(fp, "Customer", "Create Customer");
	}

	@Override
	public boolean canCreate(ICreateContext context)
	{
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context)
	{
		String cname = ExampleUtil.askString("Customer name", "Client name ?", "");
		if (cname == null || cname.trim().length() == 0)
		{
			return EMPTY;
		}

		// create Customer
		Customer newCustomer = RentalFactory.eINSTANCE.createCustomer();
		newCustomer.setLastName(cname);
		newCustomer.setFirstName(cname);

		// Get the current agency edited by diagram
		IDiagramTypeProvider diagramTypeProvider = getFeatureProvider().getDiagramTypeProvider();
		RentalAgency agency = ((RentalDiagramTypeProvider) diagramTypeProvider).getAgency();
		//Add the customer in agency.
		// Agency is already stored in an external file, customer will be stored in the same file
		agency.getCustomers().add(newCustomer);
		
		// call the AddFeature
		addGraphicalRepresentation(context, newCustomer);

		// return newly created business object(s)
		return new Object[] { newCustomer };
	}

}

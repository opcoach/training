package com.opcoach.training.rental.graphiti.features;


import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalFactory;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.graphiti.RentalDiagramTypeProvider;

public class CreateRentalFeature extends AbstractCreateConnectionFeature
{

	public CreateRentalFeature(IFeatureProvider fp)
	{
		// set name and description of the creation feature
		super(fp, "Rental", "Create Rental ");
	}

	

	@Override
	public boolean canCreate(ICreateConnectionContext context)
	{
		Customer source = getCustomer(context.getSourceAnchor()); // Customer
		RentalObject target = getRentalObject(context.getTargetAnchor()); // RentalObject

		return ((source != null) && (target != null) && (source != target));

	}

	@Override
	public Connection create(ICreateConnectionContext context)
	{
		Connection newConnection = null;

		Customer source = getCustomer(context.getSourceAnchor()); // Customer
		RentalObject target = getRentalObject(context.getTargetAnchor()); // RentalObject

		if ((source != null) && (target != null))
		{
			// create new business object
			Rental r = RentalFactory.eINSTANCE.createRental();
			r.setCustomer(source);
			r.setRentedObject(target);
			Date now = new Date();
			r.setStartDate(now);
			r.setEndDate(new Date(now.getTime() + 7*24*3600*1000L));
			
			//Add the rental in agency.
			((RentalDiagramTypeProvider)getFeatureProvider().getDiagramTypeProvider()).getAgency().getRentals().add(r);

			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(r);
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}

		return newConnection;

	}

	
	@Override
	public boolean canStartConnection(ICreateConnectionContext context)
	{
		Customer c = getCustomer(context.getSourceAnchor());
		return c != null;
	}

	private Customer getCustomer(Anchor anchor)
	{
		EObject o = getEObject(anchor);
		return (o instanceof Customer) ? (Customer) o : null;
	}
	private RentalObject getRentalObject(Anchor anchor)
	{
		EObject o = getEObject(anchor);
		return (o instanceof RentalObject) ? (RentalObject) o : null;
	}
	/**
	 * Returns the EClass belonging to the anchor, or null if not available.
	 */
	private EObject getEObject(Anchor anchor)
	{
		if (anchor != null)
		{
			Object object = getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof EObject)
			{
				return (EObject) object;
			}
		}
		return null;
	}

}

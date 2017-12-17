package com.opcoach.training.rental.graphiti.features;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;

public class RentalFeatureProvider extends DefaultFeatureProvider
{
	public RentalFeatureProvider(IDiagramTypeProvider dtp)
	{
		super(dtp);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context)
	{
		Object o = context.getNewObject();
		if (o instanceof Customer) 	        {  return new AddCustomerFeature(this);   } 
		else if (o instanceof Rental)       {	return new AddRentalFeature(this);    } 
		else if (o instanceof RentalObject) { return new AddRentalObjectFeature(this);} 
		else if (o instanceof Rental)	    { return new AddRentalFeature(this);	  }
		
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures()
	{
		return new ICreateFeature[] { new CreateCustomerFeature(this), 
				                      new CreateRentalObjectFeature(this) };
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures()
	{
		return new ICreateConnectionFeature[] { new CreateRentalFeature(this) };
	}

}

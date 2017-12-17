package com.opcoach.training.rental.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import com.opcoach.training.rental.Rental;

public class AddRentalFeature extends AbstractAddShapeFeature
{

	public AddRentalFeature(IFeatureProvider fp)
	{
		super(fp);
	}

	public PictogramElement add(IAddContext context)
	{
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		Rental addedRental = (Rental) context.getNewObject();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		// CONNECTION WITH POLYLINE
		Connection connection = peCreateService.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPolyline(connection);
		polyline.setLineWidth(2);
		polyline.setForeground(manageColor(IColorConstant.BLACK));

		// create link and wire it
		link(connection, addedRental);

		return connection;
	}

	public boolean canAdd(IAddContext context)
	{
		// return true if given business object is an Rental
		// note, that the context must be an instance of IAddConnectionContext
		if (context instanceof IAddConnectionContext && context.getNewObject() instanceof Rental)
		{
			return true;
		}
		return false;
	}
}

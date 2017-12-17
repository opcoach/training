// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.gef.figures.RentalObjectFigure;

/**
 * @author olivier
 * 
 */
public class RentalObjectEditPart extends AbstractGraphicalEditPart
{

	@Override
	protected IFigure createFigure()
	{
		return new RentalObjectFigure();
	}

	@Override
	protected void createEditPolicies()
	{
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	@Override
	protected void refreshVisuals()
	{

		super.refreshVisuals();
		RentalObjectFigure fig = (RentalObjectFigure) getFigure();
		RentalObject ro = getRentalObject();
		fig.setObjectName(ro.getName());

	}

	public RentalObject getRentalObject()
	{
		return (RentalObject) getModel();
	}

}

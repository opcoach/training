// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.gef.figures.RentalFigure;

/**
 * @author olivier
 * 
 */
public class RentalEditPart extends AbstractGraphicalEditPart
{

	public Rental getRental()
	{
		return (Rental) getModel();
	}

	@Override
	protected IFigure createFigure()
	{
		return new RentalFigure();
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
		RentalFigure fig = (RentalFigure) getFigure();
		Rental r = getRental();
		fig.setDates(r.getStartDate(), r.getEndDate());

	}

}

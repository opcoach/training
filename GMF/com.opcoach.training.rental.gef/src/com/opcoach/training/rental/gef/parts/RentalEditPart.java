// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef.parts;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.gef.figures.CustomerFigure;
import com.opcoach.training.rental.gef.figures.RentalFigure;
import com.opcoach.training.rental.gef.figures.RentalObjectFigure;

/**
 * @author olivier
 *
 */
public class RentalEditPart extends AbstractRentalEditPart
{
	private static Point lastLocation = new Point(0,CustomerFigure.H_INIT+ RentalObjectFigure.H_INIT + 80);



	@Override
	protected IFigure createFigure()
	{

		Figure f =  new RentalFigure();
		f.setLocation(lastLocation);
		Rectangle b = f.getBounds();
		lastLocation = new Point(b.x + b.width + 2, b.y);
		return f;
	}

	@Override
	protected void createEditPolicies()
	{
		// TODO Auto-generated method stub

	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	@Override
	protected void refreshVisuals()
	{
		
		super.refreshVisuals();
		RentalFigure fig = (RentalFigure) getFigure();
		Rental r = (Rental) getModel();
		fig.setDates(r.getStartDate(), r.getEndDate());
		
	}
	

}

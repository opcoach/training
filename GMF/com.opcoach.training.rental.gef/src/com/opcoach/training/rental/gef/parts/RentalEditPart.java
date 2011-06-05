// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.opcoach.training.rental.gef.figures.RentalFigure;

/**
 * @author olivier
 *
 */
public class RentalEditPart extends AbstractGraphicalEditPart
{


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

}

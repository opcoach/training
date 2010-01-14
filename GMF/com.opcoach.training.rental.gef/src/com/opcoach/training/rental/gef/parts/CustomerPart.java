// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;

import com.opcoach.training.rental.gef.figures.CustomerFigure;

/**
 * @author olivier
 */
public class CustomerPart extends AbstractGraphicalEditPart
{

	@Override
	protected IFigure createFigure()
	{
		return new CustomerFigure();
	}

	@Override
	protected void createEditPolicies()
	{
		// Interdit ˆ l'Žditeur de supprimer ce noeud (car root node)
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new RootComponentEditPolicy()); 
			 
	}

}

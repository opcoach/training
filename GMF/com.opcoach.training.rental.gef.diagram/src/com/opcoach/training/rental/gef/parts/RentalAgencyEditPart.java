// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;

import com.opcoach.training.gef.policies.RentalAgencyEditPolicy;
import com.opcoach.training.rental.MyRentalAgency;

/**
 * @author olivier
 */
public class RentalAgencyEditPart extends AbstractGraphicalEditPart
{

	MyRentalAgency getAgency()
	{
		return (MyRentalAgency) getModel();
	}
	
	public void setModel(Object model) {
		super.setModel(model);
	}

	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	@Override
	protected List<Object> getModelChildren()
	{

		final List<Object> children = new ArrayList<Object>();

		// Add objects contained in rental agency
		children.addAll(getAgency().getCustomers());
		children.addAll(getAgency().getObjectsToRent());
		children.addAll(getAgency().getRentals());

		
		
		return children;
	}

	@Override
	protected void createEditPolicies()
	{
		// Interdit ˆ l'Žditeur de supprimer ce noeud (car root node)
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new RootComponentEditPolicy());
		// Ajoute le comportement de deplacement des fils
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new RentalAgencyEditPolicy((XYLayout) getContentPane().getLayoutManager()));

	}

	

	@Override
	protected IFigure createFigure()
	{
		figure = (IFigure) new FreeformLayer();
		// il faut mettre un XYLayout ou un descendant car on doit pouvoir bouger les objets
		// --> Pas de gridlayout possible
		figure.setLayoutManager(new FreeformLayout());

		return figure;

	}



}

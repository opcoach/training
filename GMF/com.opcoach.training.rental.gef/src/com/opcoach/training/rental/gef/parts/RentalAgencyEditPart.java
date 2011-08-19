// ------------------------------------------------
// OPCoach Training Projects
// � OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;

import com.opcoach.training.gef.policies.RentalAgencyEditPolicy;
import com.opcoach.training.rental.RentalAgency;

/**
 * @author olivier
 */
public class RentalAgencyEditPart extends AbstractGraphicalEditPart implements Adapter
{

	private IFigure figure;

	RentalAgency getAgency()
	{
		return (RentalAgency) getModel();
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
		// Interdit � l'�diteur de supprimer ce noeud (car root node)
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new RootComponentEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new RentalAgencyEditPolicy((XYLayout) getContentPane().getLayoutManager()));

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.FreeformGraphicalRootEditPart#getModel()
	 */
	@Override
	public Object getModel()
	{
		// TODO Auto-generated method stub
		Object result = super.getModel();
		// System.out.println("Model returned : " + result);
		return result;

	}

	@Override
	protected IFigure createFigure()
	{
		figure = (IFigure) new FreeformLayer();
		figure.setLayoutManager(new FreeformLayout());

		return figure;

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#activate()
	 */
	@Override
	public void activate()
	{
		super.activate();
		getAgency().eAdapters().add(this);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#deactivate()
	 */
	@Override
	public void deactivate()
	{
		// TODO Auto-generated method stub
		super.deactivate();
	}

	@Override
	public void notifyChanged(Notification notification)
	{
		refreshVisuals();
	}

	@Override
	public Notifier getTarget()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTarget(Notifier newTarget)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAdapterForType(Object type)
	{
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @Override protected IFigure createFigure() { return new CustomerFigure();
	 * }
	 */

}
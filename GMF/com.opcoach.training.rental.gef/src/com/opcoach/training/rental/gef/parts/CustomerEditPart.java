// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.opcoach.training.gef.policies.CustomerEditPolicy;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.gef.figures.CustomerFigure;

/**
 * @author olivier
 */
public class CustomerEditPart extends AbstractGraphicalEditPart

{
	private static Point lastLocation = new Point(0,50);

	
	public CustomerEditPart()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected IFigure createFigure()
	{
		IFigure result = new CustomerFigure(getCustomer().getDisplayName());
		result.setLocation(lastLocation);
		Rectangle b = result.getBounds();
		lastLocation = new Point(b.x + b.width + 2, b.y);
		return result;
	}

	@Override
	protected void createEditPolicies()
	{
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new CustomerEditPolicy());
		//installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

	}
	
	
	/**
	 * @generated
	 */
	/*protected LayoutEditPolicy createLayoutEditPolicy()
	{
		LayoutEditPolicy lep = new CustomerEditPolicy()
		{

			protected EditPolicy createChildEditPolicy(EditPart child)
			{
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null)
				{
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request)
			{
				return null;
			}

			protected Command getCreateCommand(CreateRequest request)
			{
				return null;
			}
		};
		return lep;
	}
	*/
	
	
	public Customer getCustomer()
	{
		return (Customer) getModel();
	}
	

}

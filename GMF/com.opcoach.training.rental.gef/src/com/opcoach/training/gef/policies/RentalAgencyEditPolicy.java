package com.opcoach.training.gef.policies;

import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import com.opcoach.training.gef.commands.ChangeBoundsCommand;
import com.opcoach.training.gef.commands.CreateCustomerCommand;
import com.opcoach.training.gef.commands.CreateRentalObjectCommand;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

public class RentalAgencyEditPolicy extends XYLayoutEditPolicy
{
	public RentalAgencyEditPolicy(final XYLayout layout)
    {
        super();
        setXyLayout(layout);
    }
	

/*	protected Command createDeleteCommand(final GroupRequest request)
	    {
		  System.out.println(" Host is : " + getHost().getClass().getName());
		  RentalAgency parent = (RentalAgency) getHost().getParent().getModel();
	        Customer child = ((CustomerEditPart) getHost()).getCustomer();
	        DeleteCustomerCommand deleteCmd = new DeleteCustomerCommand(child, parent);
	        return deleteCmd;
	    }
*/
	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint)
	{
		return null;
	}
	
	

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#createChangeConstraintCommand(org.eclipse.gef.requests.ChangeBoundsRequest, org.eclipse.gef.EditPart, java.lang.Object)
	 */
	@Override
	protected Command createChangeConstraintCommand(ChangeBoundsRequest request, EditPart child, Object constraint)
	{
    	Command command = UnexecutableCommand.INSTANCE;
    	//LocatedElement locatedElement = (LocatedElement) child.getModel();
    	//return new ChangeBoundsCommand(locatedElement, (Rectangle) constraint);
    	if (child  instanceof AbstractGraphicalEditPart){
    		AbstractGraphicalEditPart cep = (AbstractGraphicalEditPart) child;
    		command =    new ChangeBoundsCommand(cep, (Rectangle) constraint);
    	}
    	
    	return command;
    }


	@Override
	protected Command getCreateCommand(CreateRequest request)
	{
		 //EObject selectedLine = null;
        final Rectangle constraint = (Rectangle) getConstraintFor(request);
        // get the child object to create
        final Object newObject = request.getNewObject();
        
        final EditPart editPart = getHost(); 
        final RentalAgency parentAgency = (RentalAgency)editPart.getModel();
                
        Command command = UnexecutableCommand.INSTANCE;
        
        if (parentAgency != null)
        {
        	if (newObject instanceof Customer)
        	{
        		command = new CreateCustomerCommand((Customer) newObject,  parentAgency, constraint);
        	}
        	else if (newObject instanceof RentalObject)
        	{
        		command = new CreateRentalObjectCommand((RentalObject) newObject,  parentAgency, constraint);
        	}
        }
        
        return command;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#getResizeChildrenCommand(org.eclipse.gef.requests.ChangeBoundsRequest)
	 */
	@Override
	protected Command getResizeChildrenCommand(ChangeBoundsRequest request)
	{
		// TODO Auto-generated method stub
		return super.getResizeChildrenCommand(request);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#getMoveChildrenCommand(org.eclipse.gef.Request)
	 */
	@Override
	protected Command getMoveChildrenCommand(Request request)
	{
		// TODO Auto-generated method stub
		return super.getMoveChildrenCommand(request);
	}


	
}

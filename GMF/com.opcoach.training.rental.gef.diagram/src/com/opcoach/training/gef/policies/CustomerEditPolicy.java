package com.opcoach.training.gef.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.opcoach.training.diagram.editor.DiagramElementEditPart;
import com.opcoach.training.gef.commands.DeleteCustomerCommand;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.gef.parts.CustomerEditPart;

public class CustomerEditPolicy extends  ComponentEditPolicy
{
	protected Command createDeleteCommand(final GroupRequest request)
	    {
		DiagramElementEditPart part = (DiagramElementEditPart) getHost().getParent();
		  MyRentalAgency parent = (MyRentalAgency) part.getModelObject();
	        Customer child = ((CustomerEditPart) getHost()).getCustomer();
	        DeleteCustomerCommand deleteCmd = new DeleteCustomerCommand(child, parent);
	        return deleteCmd;
	    }
	
}

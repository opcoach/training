package com.opcoach.training.gef.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.opcoach.training.gef.commands.DeleteCustomerCommand;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.gef.parts.CustomerEditPart;

public class CustomerEditPolicy extends  ComponentEditPolicy
{
	

	protected Command createDeleteCommand(final GroupRequest request)
	    {
		  System.out.println(" Create DeleteCommand, Host is : " + getHost().getClass().getName());
		  RentalAgency parent = (RentalAgency) getHost().getParent().getModel();
	        Customer child = ((CustomerEditPart) getHost()).getCustomer();
	        DeleteCustomerCommand deleteCmd = new DeleteCustomerCommand(child, parent);
	        return deleteCmd;
	    }

	

	
}

package com.opcoach.training.gef.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;

public class CreateCustomerCommand extends Command
{
	private Customer customer = null;
	private RentalAgency agency = null;

	public CreateCustomerCommand(Customer c, RentalAgency parentAgency, Rectangle constraint)
	{
		super("Create Customer");
		agency = parentAgency;
		customer = c;
	}

	@Override
	public void execute()  {  redo(); 	}

	@Override
	public void redo() 	   { agency.addCustomer(customer); 	}

	@Override
	public void undo() 	   { agency.removeCustomer(customer); }

}

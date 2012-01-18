package com.opcoach.training.gef.commands;

import org.eclipse.gef.commands.Command;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.MyRentalAgency;

public class DeleteCustomerCommand extends Command
{
	private Customer customer = null;
	private MyRentalAgency agency = null;

	public DeleteCustomerCommand(Customer c, MyRentalAgency parentAgency)
	{
		super("Delete Customer");
		agency = parentAgency;
		customer = c;
	}

	@Override
	public void execute() { redo(); }

	@Override
	public void redo()  { agency.removeCustomer(customer); }

	@Override
	public void undo() 	{ agency.addCustomer(customer); }
}

package com.opcoach.training.gef.commands;

import org.eclipse.gef.commands.Command;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;

public class DeleteCustomerCommand extends Command
{
	private Customer customer = null;
	private RentalAgency agency = null;

	public DeleteCustomerCommand(Customer c, RentalAgency parentAgency)
	{
		super("Delete Customer");
		agency = parentAgency;
		customer = c;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute()
	{
		System.out.println("Enter in Delete Customer");
		redo();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	@Override
	public void redo()
	{
		// Add customer in agency.
		agency.removeCustomer(customer);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo()
	{
		agency.addCustomer(customer);
	}

}

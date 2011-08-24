package com.opcoach.training.gef.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

public class CreateRentalObjectCommand extends Command
{
	private RentalObject ro = null;
	private RentalAgency agency = null;
	private Rectangle customerBox = null;

	public CreateRentalObjectCommand(RentalObject r, RentalAgency parentAgency, Rectangle constraint)
	{
		super("Create Rental Object");
		agency = parentAgency;
		ro = r;
		customerBox = constraint;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute()
	{
		System.out.println("Enter in Create Rental Object");
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
		agency.addObject(ro);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo()
	{
		agency.removeObject(ro);
	}

}

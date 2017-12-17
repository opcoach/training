package com.opcoach.training.gef.commands;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.RentalPackage;

public class CreateCustomerEMFCommand extends EMFWrapCommand
{
	public CreateCustomerEMFCommand(Customer c, MyRentalAgency parentAgency, Rectangle constraint)
	{
		super();
		
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(parentAgency);
		Collection<Customer> children = new ArrayList<Customer>();
		children.add(c);
		CommandParameter cp = new CommandParameter(parentAgency, RentalPackage.eINSTANCE.getRental_Customer(), c);
		Command cmd = CreateChildCommand.create(domain, parentAgency, cp, children );
		setEmfCommand(domain, cmd);
	}
	
	
	

}

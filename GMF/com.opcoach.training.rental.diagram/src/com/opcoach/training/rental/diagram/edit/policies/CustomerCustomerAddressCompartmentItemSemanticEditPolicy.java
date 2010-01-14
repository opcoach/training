package com.opcoach.training.rental.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.opcoach.training.rental.diagram.edit.commands.Address2CreateCommand;
import com.opcoach.training.rental.diagram.providers.RentalElementTypes;

/**
 * @generated
 */
public class CustomerCustomerAddressCompartmentItemSemanticEditPolicy extends RentalBaseItemSemanticEditPolicy
{

	/**
	 * @generated
	 */
	public CustomerCustomerAddressCompartmentItemSemanticEditPolicy()
	{
		super(RentalElementTypes.Customer_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req)
	{
		if (RentalElementTypes.Address_3001 == req.getElementType())
		{
			return getGEFWrapper(new Address2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

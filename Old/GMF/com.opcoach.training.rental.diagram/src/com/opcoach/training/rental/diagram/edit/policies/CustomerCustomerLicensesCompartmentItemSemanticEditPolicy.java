package com.opcoach.training.rental.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.opcoach.training.rental.diagram.edit.commands.LicenseCreateCommand;
import com.opcoach.training.rental.diagram.providers.RentalElementTypes;

/**
 * @generated
 */
public class CustomerCustomerLicensesCompartmentItemSemanticEditPolicy extends RentalBaseItemSemanticEditPolicy
{

	/**
	 * @generated
	 */
	public CustomerCustomerLicensesCompartmentItemSemanticEditPolicy()
	{
		super(RentalElementTypes.Customer_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req)
	{
		if (RentalElementTypes.License_3002 == req.getElementType())
		{
			return getGEFWrapper(new LicenseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

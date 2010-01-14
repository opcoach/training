package com.opcoach.training.rental.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import com.opcoach.training.rental.diagram.providers.RentalElementTypes;

/**
 * @generated
 */
public class RentalRentedObjectItemSemanticEditPolicy extends RentalBaseItemSemanticEditPolicy
{

	/**
	 * @generated
	 */
	public RentalRentedObjectItemSemanticEditPolicy()
	{
		super(RentalElementTypes.RentalRentedObject_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req)
	{
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}

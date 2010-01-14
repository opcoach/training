package com.opcoach.training.rental.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import com.opcoach.training.rental.diagram.edit.commands.AddressCreateCommand;
import com.opcoach.training.rental.diagram.edit.commands.CustomerCreateCommand;
import com.opcoach.training.rental.diagram.edit.commands.RentalCreateCommand;
import com.opcoach.training.rental.diagram.edit.commands.RentalObjectCreateCommand;
import com.opcoach.training.rental.diagram.providers.RentalElementTypes;

/**
 * @generated
 */
public class RentalAgencyItemSemanticEditPolicy extends RentalBaseItemSemanticEditPolicy
{

	/**
	 * @generated
	 */
	public RentalAgencyItemSemanticEditPolicy()
	{
		super(RentalElementTypes.RentalAgency_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req)
	{
		if (RentalElementTypes.Address_2001 == req.getElementType())
		{
			return getGEFWrapper(new AddressCreateCommand(req));
		}
		if (RentalElementTypes.RentalObject_2002 == req.getElementType())
		{
			return getGEFWrapper(new RentalObjectCreateCommand(req));
		}
		if (RentalElementTypes.Customer_2003 == req.getElementType())
		{
			return getGEFWrapper(new CustomerCreateCommand(req));
		}
		if (RentalElementTypes.Rental_2004 == req.getElementType())
		{
			return getGEFWrapper(new RentalCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req)
	{
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand
	{

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req)
		{
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}

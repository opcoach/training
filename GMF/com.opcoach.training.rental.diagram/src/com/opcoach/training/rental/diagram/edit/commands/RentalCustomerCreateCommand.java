package com.opcoach.training.rental.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.diagram.edit.policies.RentalBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RentalCustomerCreateCommand extends EditElementCommand
{

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	public RentalCustomerCreateCommand(CreateRelationshipRequest request, EObject source, EObject target)
	{
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	 * @generated
	 */
	public boolean canExecute()
	{
		if (source == null && target == null)
		{
			return false;
		}
		if (source != null && false == source instanceof Rental)
		{
			return false;
		}
		if (target != null && false == target instanceof Customer)
		{
			return false;
		}
		if (getSource() == null)
		{
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return RentalBaseItemSemanticEditPolicy.LinkConstraints.canCreateRentalCustomer_4001(getSource(), getTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException
	{
		if (!canExecute())
		{
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		if (getSource() != null && getTarget() != null)
		{
			getSource().setCustomer(getTarget());
		}
		return CommandResult.newOKCommandResult();

	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element)
	{
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected Rental getSource()
	{
		return (Rental) source;
	}

	/**
	 * @generated
	 */
	protected Customer getTarget()
	{
		return (Customer) target;
	}
}

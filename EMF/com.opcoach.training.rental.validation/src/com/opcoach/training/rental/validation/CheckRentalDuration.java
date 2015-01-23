package com.opcoach.training.rental.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.opcoach.training.rental.Rental;

public class CheckRentalDuration extends AbstractModelConstraint
{

	public CheckRentalDuration()
	{
		System.out.println("Instantiate the CheckRentalDuration " );
	}

	@Override
	/** Validate the rental duration */
	public IStatus validate(IValidationContext ctx)
	{
		System.out.println("Enter in CheckRentalDuration :  " + ctx.getTarget());

		if (ctx.getTarget() instanceof Rental)
		{
			Rental r = (Rental) ctx.getTarget();
			System.out.println("Checking the rental :  " + r);

			long duration = r.getEndDate().getTime() - r.getStartDate().getTime();

			// return a failure with the expected parameters in the constraint
			// message
			// The {0} has a to short duration.
			if (duration < 3600000L)
				return ctx.createFailureStatus(new Object[] { r.toString() });
		}

		return ctx.createFailureStatus(new Object[] { ctx.getTarget().toString() });

		//return ctx.createSuccessStatus();
	}
	
	
	
	
}

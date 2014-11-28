package com.opcoach.training.rental.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.opcoach.training.rental.Rental;

public class CheckRentalDuration extends AbstractModelConstraint {

	public CheckRentalDuration() {
		// TODO Auto-generated constructor stub
	}

	@Override
	/** Validate the rental duration */
	public IStatus validate(IValidationContext ctx) {

		Rental r = (Rental) ctx.getTarget();
		System.out.println("Checking the rental :  " + r);
		
		long duration = r.getEndDate().getTime() - r.getStartDate().getTime();

		// return a failure with the expected parameters in the constraint message
		// The {0} has a to short duration.
		if (duration < 3600000L)
			ctx.createFailureStatus(new Object[] { r.toString() });
		
		return ctx.createSuccessStatus();
	}
}

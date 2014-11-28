package com.opcoach.training.rental.xtext.validation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.xtext.validation.Check;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalPackage;
 

public class RentalDslJavaValidator extends AbstractRentalDslJavaValidator {

	public static final String START_DATE_BEFORE = "Invalid start Date";  // Use for the quick fixes
	
	
	@Check 
	public void checkStartBeforeEnd(Rental r)
	{
		EAttribute rentalStartDate = RentalPackage.Literals.RENTAL__START_DATE;

		if (r.getStartDate().after(r.getEndDate())) {
			warning("The start date must be before the end date", rentalStartDate, START_DATE_BEFORE);
		}
	}

	
}

package com.opcoach.training.rental.xtext.validation

import com.opcoach.training.rental.Rental
import com.opcoach.training.rental.RentalPackage
import org.eclipse.xtext.validation.Check

class RentalDslJavaValidatorXt extends AbstractRentalDslJavaValidator {
		
	public static val String START_DATE_BEFORE = "Invalid start Date";  // Use for the quick fixes
	
	@Check 
	def checkStartBeforeEnd(Rental r)
	{
		val rentalStartDate = RentalPackage.Literals.RENTAL__START_DATE;
		if (r.getStartDate().after(r.getEndDate())) {
			warning("The start date must be before the end date", rentalStartDate, START_DATE_BEFORE);
		}
	}
	
}
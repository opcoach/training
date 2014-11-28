/**
 *
 * $Id$
 */
package com.opcoach.training.rental.validation;

import com.opcoach.training.rental.Address;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link com.opcoach.training.rental.RentalAgency}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RentalAgencyValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateAddress(Address value);
	boolean validateObjectsToRent(EList<RentalObject> value);
	boolean validateCustomers(EList<Customer> value);
	boolean validateRentals(EList<Rental> value);
}

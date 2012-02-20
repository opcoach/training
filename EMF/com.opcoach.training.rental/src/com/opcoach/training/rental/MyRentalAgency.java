/**
 * OPCoach @ 2012
 *
 * $Id$
 */
package com.opcoach.training.rental;

/**
 * This code overrides the generated RentalAgency interface and adds some
 * convenients methods not defined in model
 */
public interface MyRentalAgency extends RentalAgency
{
	void addRental(Rental object);
	
	void removeRental(Rental object);
	
} // MyRentalAgency

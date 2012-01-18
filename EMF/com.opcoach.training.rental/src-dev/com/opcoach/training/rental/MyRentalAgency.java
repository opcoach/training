/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental;


/** This code override the generated RentalAgency interface and add some convenients methods not defined in model
 */
public interface MyRentalAgency extends RentalAgency
{
	
	void addCustomer(Customer customer);

	
	void addObject(RentalObject object);

	
	void removeCustomer(Customer customer);

	
	void removeObject(RentalObject object);

	

} // MyRentalAgency

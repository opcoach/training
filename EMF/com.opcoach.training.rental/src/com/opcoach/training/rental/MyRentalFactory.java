/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental;

/**
 * Override the rental Factory to get extended interfaces for objects
 */
public interface MyRentalFactory extends RentalFactory
{

	/**
	 * Override the created rental agency -> returns now a MyRentalAgency
	 * instance
	 */
	MyRentalAgency createRentalAgency();

} // MyRentalFactory

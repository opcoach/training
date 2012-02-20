/**
 * OPCoach @ 2012
 *
 * $Id$
 */
package com.opcoach.training.rental.impl;

import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.MyRentalFactory;


/**
 * This is the new Factory to be used to create rental instances.
 * It inherits from the generated factory and this factory is bound in the factory_override extension.
 * All overriden code should be defined in this package and instanciated by this factory
 */
public class MyRentalFactoryImpl extends RentalFactoryImpl implements MyRentalFactory
{

	public MyRentalFactoryImpl()
	{
		super();
	}
	
	@Override
	public MyRentalAgency createRentalAgency()
	{
		// Instanciate the overriden rentalAgency
		MyRentalAgencyImpl rentalAgency = new MyRentalAgencyImpl();
		return rentalAgency;
	}



} // MyRentalFactoryImpl

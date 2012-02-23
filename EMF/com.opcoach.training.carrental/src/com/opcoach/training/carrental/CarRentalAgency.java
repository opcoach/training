/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental;

import com.opcoach.training.rental.MyRentalAgency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car Rental Agency</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.opcoach.training.carrental.CarrentalPackage#getCarRentalAgency()
 * @model
 * @generated
 */
public interface CarRentalAgency extends MyRentalAgency
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void disable(Car car);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enable(Car car);

} // CarRentalAgency

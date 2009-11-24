/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental;

import com.opcoach.training.rental.RentalObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.carrental.Vehicle#getPlateNumber <em>Plate Number</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.Vehicle#getHorsePower <em>Horse Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.carrental.CarrentalPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends RentalObject
{
	/**
	 * Returns the value of the '<em><b>Plate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plate Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plate Number</em>' attribute.
	 * @see #setPlateNumber(String)
	 * @see com.opcoach.training.carrental.CarrentalPackage#getVehicle_PlateNumber()
	 * @model
	 * @generated
	 */
	String getPlateNumber();

	/**
	 * Sets the value of the '{@link com.opcoach.training.carrental.Vehicle#getPlateNumber <em>Plate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plate Number</em>' attribute.
	 * @see #getPlateNumber()
	 * @generated
	 */
	void setPlateNumber(String value);

	/**
	 * Returns the value of the '<em><b>Horse Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horse Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horse Power</em>' attribute.
	 * @see #setHorsePower(float)
	 * @see com.opcoach.training.carrental.CarrentalPackage#getVehicle_HorsePower()
	 * @model
	 * @generated
	 */
	float getHorsePower();

	/**
	 * Sets the value of the '{@link com.opcoach.training.carrental.Vehicle#getHorsePower <em>Horse Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horse Power</em>' attribute.
	 * @see #getHorsePower()
	 * @generated
	 */
	void setHorsePower(float value);

} // Vehicle

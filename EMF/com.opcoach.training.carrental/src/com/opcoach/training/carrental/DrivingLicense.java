/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental;

import com.opcoach.training.rental.License;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driving License</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.carrental.DrivingLicense#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.DrivingLicense#getDeliveryLocation <em>Delivery Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.carrental.CarrentalPackage#getDrivingLicense()
 * @model
 * @generated
 */
public interface DrivingLicense extends License
{
	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #setDeliveryDate(Date)
	 * @see com.opcoach.training.carrental.CarrentalPackage#getDrivingLicense_DeliveryDate()
	 * @model
	 * @generated
	 */
	Date getDeliveryDate();

	/**
	 * Sets the value of the '{@link com.opcoach.training.carrental.DrivingLicense#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Delivery Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Location</em>' attribute.
	 * @see #setDeliveryLocation(String)
	 * @see com.opcoach.training.carrental.CarrentalPackage#getDrivingLicense_DeliveryLocation()
	 * @model
	 * @generated
	 */
	String getDeliveryLocation();

	/**
	 * Sets the value of the '{@link com.opcoach.training.carrental.DrivingLicense#getDeliveryLocation <em>Delivery Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Location</em>' attribute.
	 * @see #getDeliveryLocation()
	 * @generated
	 */
	void setDeliveryLocation(String value);

} // DrivingLicense

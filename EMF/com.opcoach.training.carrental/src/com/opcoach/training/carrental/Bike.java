/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bike</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.carrental.Bike#getFrontTireSize <em>Front Tire Size</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.Bike#getBackTireSize <em>Back Tire Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.carrental.CarrentalPackage#getBike()
 * @model
 * @generated
 */
public interface Bike extends Vehicle
{
	/**
	 * Returns the value of the '<em><b>Front Tire Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front Tire Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Tire Size</em>' attribute.
	 * @see #setFrontTireSize(int)
	 * @see com.opcoach.training.carrental.CarrentalPackage#getBike_FrontTireSize()
	 * @model
	 * @generated
	 */
	int getFrontTireSize();

	/**
	 * Sets the value of the '{@link com.opcoach.training.carrental.Bike#getFrontTireSize <em>Front Tire Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Tire Size</em>' attribute.
	 * @see #getFrontTireSize()
	 * @generated
	 */
	void setFrontTireSize(int value);

	/**
	 * Returns the value of the '<em><b>Back Tire Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Back Tire Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Tire Size</em>' attribute.
	 * @see #setBackTireSize(int)
	 * @see com.opcoach.training.carrental.CarrentalPackage#getBike_BackTireSize()
	 * @model
	 * @generated
	 */
	int getBackTireSize();

	/**
	 * Sets the value of the '{@link com.opcoach.training.carrental.Bike#getBackTireSize <em>Back Tire Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Tire Size</em>' attribute.
	 * @see #getBackTireSize()
	 * @generated
	 */
	void setBackTireSize(int value);

} // Bike

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.carrental.Car#getRegistration <em>Registration</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.Car#getBrand <em>Brand</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.Car#isAirConditionning <em>Air Conditionning</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.Car#isRadioCD <em>Radio CD</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.carrental.CarrentalPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends Vehicle
{
	/**
	 * Returns the value of the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration</em>' attribute.
	 * @see #setRegistration(String)
	 * @see com.opcoach.training.carrental.CarrentalPackage#getCar_Registration()
	 * @model
	 * @generated
	 */
	String getRegistration();

	/**
	 * Sets the value of the '{@link com.opcoach.training.carrental.Car#getRegistration <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration</em>' attribute.
	 * @see #getRegistration()
	 * @generated
	 */
	void setRegistration(String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' attribute.
	 * The literals are from the enumeration {@link com.opcoach.training.carrental.CarBrand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' attribute.
	 * @see com.opcoach.training.carrental.CarBrand
	 * @see #setBrand(CarBrand)
	 * @see com.opcoach.training.carrental.CarrentalPackage#getCar_Brand()
	 * @model
	 * @generated
	 */
	CarBrand getBrand();

	/**
	 * Sets the value of the '{@link com.opcoach.training.carrental.Car#getBrand <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' attribute.
	 * @see com.opcoach.training.carrental.CarBrand
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(CarBrand value);

	/**
	 * Returns the value of the '<em><b>Air Conditionning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air Conditionning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Conditionning</em>' attribute.
	 * @see #setAirConditionning(boolean)
	 * @see com.opcoach.training.carrental.CarrentalPackage#getCar_AirConditionning()
	 * @model
	 * @generated
	 */
	boolean isAirConditionning();

	/**
	 * Sets the value of the '{@link com.opcoach.training.carrental.Car#isAirConditionning <em>Air Conditionning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Conditionning</em>' attribute.
	 * @see #isAirConditionning()
	 * @generated
	 */
	void setAirConditionning(boolean value);

	/**
	 * Returns the value of the '<em><b>Radio CD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio CD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio CD</em>' attribute.
	 * @see #setRadioCD(boolean)
	 * @see com.opcoach.training.carrental.CarrentalPackage#getCar_RadioCD()
	 * @model
	 * @generated
	 */
	boolean isRadioCD();

	/**
	 * Sets the value of the '{@link com.opcoach.training.carrental.Car#isRadioCD <em>Radio CD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio CD</em>' attribute.
	 * @see #isRadioCD()
	 * @generated
	 */
	void setRadioCD(boolean value);

} // Car

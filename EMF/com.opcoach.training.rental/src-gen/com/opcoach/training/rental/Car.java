/**
 * OPCoach @ 2012
 */
package com.opcoach.training.rental;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.Car#getLicensePlate <em>License Plate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.rental.RentalPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends RentalObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "OPCoach @ 2012";

	/**
	 * Returns the value of the '<em><b>License Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License Plate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Plate</em>' attribute.
	 * @see #setLicensePlate(String)
	 * @see com.opcoach.training.rental.RentalPackage#getCar_LicensePlate()
	 * @model
	 * @generated
	 */
	String getLicensePlate();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.Car#getLicensePlate <em>License Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Plate</em>' attribute.
	 * @see #getLicensePlate()
	 * @generated
	 */
	void setLicensePlate(String value);

} // Car

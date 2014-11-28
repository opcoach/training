/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.Address#getStreetType <em>Street Type</em>}</li>
 *   <li>{@link com.opcoach.training.rental.Address#getNumber <em>Number</em>}</li>
 *   <li>{@link com.opcoach.training.rental.Address#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link com.opcoach.training.rental.Address#getCity <em>City</em>}</li>
 *   <li>{@link com.opcoach.training.rental.Address#getStreetName <em>Street Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.rental.RentalPackage#getAddress()
 * @model annotation="gmf.node label='city'"
 * @generated
 */
public interface Address extends EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "OPCoach @ 2012";

	/**
	 * Returns the value of the '<em><b>Street Type</b></em>' attribute.
	 * The default value is <code>"Street"</code>.
	 * The literals are from the enumeration {@link com.opcoach.training.rental.StreetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Type</em>' attribute.
	 * @see com.opcoach.training.rental.StreetType
	 * @see #setStreetType(StreetType)
	 * @see com.opcoach.training.rental.RentalPackage#getAddress_StreetType()
	 * @model default="Street"
	 * @generated
	 */
	StreetType getStreetType();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.Address#getStreetType <em>Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Type</em>' attribute.
	 * @see com.opcoach.training.rental.StreetType
	 * @see #getStreetType()
	 * @generated
	 */
	void setStreetType(StreetType value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see com.opcoach.training.rental.RentalPackage#getAddress_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.Address#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip Code</em>' attribute.
	 * @see #setZipCode(String)
	 * @see com.opcoach.training.rental.RentalPackage#getAddress_ZipCode()
	 * @model
	 * @generated
	 */
	String getZipCode();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.Address#getZipCode <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Code</em>' attribute.
	 * @see #getZipCode()
	 * @generated
	 */
	void setZipCode(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see com.opcoach.training.rental.RentalPackage#getAddress_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.Address#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Name</em>' attribute.
	 * @see #setStreetName(String)
	 * @see com.opcoach.training.rental.RentalPackage#getAddress_StreetName()
	 * @model
	 * @generated
	 */
	String getStreetName();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.Address#getStreetName <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Name</em>' attribute.
	 * @see #getStreetName()
	 * @generated
	 */
	void setStreetName(String value);

} // Address

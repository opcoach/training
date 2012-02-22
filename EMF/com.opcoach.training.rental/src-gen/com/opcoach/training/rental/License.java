/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.License#getNumber <em>Number</em>}</li>
 *   <li>{@link com.opcoach.training.rental.License#getValidityDate <em>Validity Date</em>}</li>
 *   <li>{@link com.opcoach.training.rental.License#getOwner <em>Owner</em>}</li>
 *   <li>{@link com.opcoach.training.rental.License#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.rental.RentalPackage#getLicense()
 * @model annotation="gmf.node label='number'"
 * @generated
 */
public interface License extends EObject
{
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String copyright = "OPCoach @ 2012";

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
   * @see com.opcoach.training.rental.RentalPackage#getLicense_Number()
   * @model
   * @generated
   */
	int getNumber();

	/**
   * Sets the value of the '{@link com.opcoach.training.rental.License#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
	void setNumber(int value);

	/**
   * Returns the value of the '<em><b>Validity Date</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Validity Date</em>' attribute.
   * @see #setValidityDate(Date)
   * @see com.opcoach.training.rental.RentalPackage#getLicense_ValidityDate()
   * @model
   * @generated
   */
	Date getValidityDate();

	/**
   * Sets the value of the '{@link com.opcoach.training.rental.License#getValidityDate <em>Validity Date</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validity Date</em>' attribute.
   * @see #getValidityDate()
   * @generated
   */
	void setValidityDate(Date value);

	/**
   * Returns the value of the '<em><b>Owner</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.opcoach.training.rental.Customer#getLicenses <em>Licenses</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' container reference.
   * @see #setOwner(Customer)
   * @see com.opcoach.training.rental.RentalPackage#getLicense_Owner()
   * @see com.opcoach.training.rental.Customer#getLicenses
   * @model opposite="licenses" transient="false"
   * @generated
   */
	Customer getOwner();

	/**
   * Sets the value of the '{@link com.opcoach.training.rental.License#getOwner <em>Owner</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' container reference.
   * @see #getOwner()
   * @generated
   */
	void setOwner(Customer value);

	/**
   * Returns the value of the '<em><b>EReference0</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>EReference0</em>' reference.
   * @see #setEReference0(Customer)
   * @see com.opcoach.training.rental.RentalPackage#getLicense_EReference0()
   * @model
   * @generated
   */
	Customer getEReference0();

	/**
   * Sets the value of the '{@link com.opcoach.training.rental.License#getEReference0 <em>EReference0</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>EReference0</em>' reference.
   * @see #getEReference0()
   * @generated
   */
	void setEReference0(Customer value);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
	boolean isValid();

} // License

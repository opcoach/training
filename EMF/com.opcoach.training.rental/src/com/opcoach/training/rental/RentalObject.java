/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.swt.graphics.Image;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.RentalObject#getID <em>ID</em>}</li>
 *   <li>{@link com.opcoach.training.rental.RentalObject#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.training.rental.RentalObject#getPicture <em>Picture</em>}</li>
 *   <li>{@link com.opcoach.training.rental.RentalObject#getParentAgency <em>Parent Agency</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.rental.RentalPackage#getRentalObject()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface RentalObject extends EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "OPCoach @ 2009";

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(long)
	 * @see com.opcoach.training.rental.RentalPackage#getRentalObject_ID()
	 * @model id="true"
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.RentalObject#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.opcoach.training.rental.RentalPackage#getRentalObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.RentalObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' attribute.
	 * @see #setPicture(Image)
	 * @see com.opcoach.training.rental.RentalPackage#getRentalObject_Picture()
	 * @model dataType="com.opcoach.training.rental.Image"
	 * @generated
	 */
	Image getPicture();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.RentalObject#getPicture <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture</em>' attribute.
	 * @see #getPicture()
	 * @generated
	 */
	void setPicture(Image value);

	/**
	 * Returns the value of the '<em><b>Parent Agency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.opcoach.training.rental.RentalAgency#getObjectsToRent <em>Objects To Rent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Agency</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Agency</em>' container reference.
	 * @see #setParentAgency(RentalAgency)
	 * @see com.opcoach.training.rental.RentalPackage#getRentalObject_ParentAgency()
	 * @see com.opcoach.training.rental.RentalAgency#getObjectsToRent
	 * @model opposite="objectsToRent" required="true" transient="false"
	 * @generated
	 */
	RentalAgency getParentAgency();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.RentalObject#getParentAgency <em>Parent Agency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Agency</em>' container reference.
	 * @see #getParentAgency()
	 * @generated
	 */
	void setParentAgency(RentalAgency value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Rental rent(Customer customer);

} // RentalObject

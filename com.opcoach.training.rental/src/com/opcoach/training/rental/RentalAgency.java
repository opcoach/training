/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.RentalAgency#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.training.rental.RentalAgency#getAddress <em>Address</em>}</li>
 *   <li>{@link com.opcoach.training.rental.RentalAgency#getObjectsToRent <em>Objects To Rent</em>}</li>
 *   <li>{@link com.opcoach.training.rental.RentalAgency#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.opcoach.training.rental.RentalAgency#getRentals <em>Rentals</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.rental.RentalPackage#getRentalAgency()
 * @model
 * @generated
 */
public interface RentalAgency extends EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "OPCoach @ 2009";

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
	 * @see com.opcoach.training.rental.RentalPackage#getRentalAgency_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.RentalAgency#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see com.opcoach.training.rental.RentalPackage#getRentalAgency_Address()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link com.opcoach.training.rental.RentalAgency#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Objects To Rent</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.training.rental.RentalObject}.
	 * It is bidirectional and its opposite is '{@link com.opcoach.training.rental.RentalObject#getParentAgency <em>Parent Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects To Rent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects To Rent</em>' containment reference list.
	 * @see com.opcoach.training.rental.RentalPackage#getRentalAgency_ObjectsToRent()
	 * @see com.opcoach.training.rental.RentalObject#getParentAgency
	 * @model opposite="parentAgency" containment="true"
	 * @generated
	 */
	EList<RentalObject> getObjectsToRent();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.training.rental.Customer}.
	 * It is bidirectional and its opposite is '{@link com.opcoach.training.rental.Customer#getParentAgency <em>Parent Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see com.opcoach.training.rental.RentalPackage#getRentalAgency_Customers()
	 * @see com.opcoach.training.rental.Customer#getParentAgency
	 * @model opposite="parentAgency" containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Rentals</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.training.rental.Rental}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rentals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rentals</em>' containment reference list.
	 * @see com.opcoach.training.rental.RentalPackage#getRentalAgency_Rentals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rental> getRentals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Rental book(Customer customer, RentalObject rentedObject, Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCustomer(Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addObject(RentalObject object);

} // RentalAgency

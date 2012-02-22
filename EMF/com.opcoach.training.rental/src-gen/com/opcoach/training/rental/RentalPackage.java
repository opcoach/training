/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.opcoach.training.rental.RentalFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface RentalPackage extends EPackage
{
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String copyright = "OPCoach @ 2012";

	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "rental";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://com.opcoach.training/rental/1.0";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "rental";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	RentalPackage eINSTANCE = com.opcoach.training.rental.impl.RentalPackageImpl.init();

	/**
   * The meta object id for the '{@link com.opcoach.training.rental.impl.CustomerImpl <em>Customer</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see com.opcoach.training.rental.impl.CustomerImpl
   * @see com.opcoach.training.rental.impl.RentalPackageImpl#getCustomer()
   * @generated
   */
	int CUSTOMER = 1;

	/**
   * The meta object id for the '{@link com.opcoach.training.rental.impl.RentalAgencyImpl <em>Agency</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see com.opcoach.training.rental.impl.RentalAgencyImpl
   * @see com.opcoach.training.rental.impl.RentalPackageImpl#getRentalAgency()
   * @generated
   */
	int RENTAL_AGENCY = 0;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_AGENCY__NAME = 0;

	/**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_AGENCY__ADDRESS = 1;

	/**
   * The feature id for the '<em><b>Objects To Rent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_AGENCY__OBJECTS_TO_RENT = 2;

	/**
   * The feature id for the '<em><b>Customers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_AGENCY__CUSTOMERS = 3;

	/**
   * The feature id for the '<em><b>Rentals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_AGENCY__RENTALS = 4;

	/**
   * The number of structural features of the '<em>Agency</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_AGENCY_FEATURE_COUNT = 5;

	/**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CUSTOMER__FIRST_NAME = 0;

	/**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CUSTOMER__LAST_NAME = 1;

	/**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CUSTOMER__ADDRESS = 2;

	/**
   * The feature id for the '<em><b>Licenses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CUSTOMER__LICENSES = 3;

	/**
   * The feature id for the '<em><b>Parent Agency</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CUSTOMER__PARENT_AGENCY = 4;

	/**
   * The number of structural features of the '<em>Customer</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CUSTOMER_FEATURE_COUNT = 5;

	/**
   * The meta object id for the '{@link com.opcoach.training.rental.impl.AddressImpl <em>Address</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see com.opcoach.training.rental.impl.AddressImpl
   * @see com.opcoach.training.rental.impl.RentalPackageImpl#getAddress()
   * @generated
   */
	int ADDRESS = 2;

	/**
   * The feature id for the '<em><b>Street Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDRESS__STREET_TYPE = 0;

	/**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDRESS__NUMBER = 1;

	/**
   * The feature id for the '<em><b>Zip Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDRESS__ZIP_CODE = 2;

	/**
   * The feature id for the '<em><b>City</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDRESS__CITY = 3;

	/**
   * The feature id for the '<em><b>Street Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDRESS__STREET_NAME = 4;

	/**
   * The number of structural features of the '<em>Address</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDRESS_FEATURE_COUNT = 5;

	/**
   * The meta object id for the '{@link com.opcoach.training.rental.impl.RentalObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see com.opcoach.training.rental.impl.RentalObjectImpl
   * @see com.opcoach.training.rental.impl.RentalPackageImpl#getRentalObject()
   * @generated
   */
	int RENTAL_OBJECT = 3;

	/**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_OBJECT__ID = 0;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_OBJECT__NAME = 1;

	/**
   * The feature id for the '<em><b>Parent Agency</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_OBJECT__PARENT_AGENCY = 2;

	/**
   * The feature id for the '<em><b>Dispo</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_OBJECT__DISPO = 3;

	/**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_OBJECT_FEATURE_COUNT = 4;

	/**
   * The meta object id for the '{@link com.opcoach.training.rental.impl.LicenseImpl <em>License</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see com.opcoach.training.rental.impl.LicenseImpl
   * @see com.opcoach.training.rental.impl.RentalPackageImpl#getLicense()
   * @generated
   */
	int LICENSE = 4;

	/**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LICENSE__NUMBER = 0;

	/**
   * The feature id for the '<em><b>Validity Date</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LICENSE__VALIDITY_DATE = 1;

	/**
   * The feature id for the '<em><b>Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LICENSE__OWNER = 2;

	/**
   * The feature id for the '<em><b>EReference0</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LICENSE__EREFERENCE0 = 3;

	/**
   * The number of structural features of the '<em>License</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LICENSE_FEATURE_COUNT = 4;

	/**
   * The meta object id for the '{@link com.opcoach.training.rental.impl.RentalImpl <em>Rental</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see com.opcoach.training.rental.impl.RentalImpl
   * @see com.opcoach.training.rental.impl.RentalPackageImpl#getRental()
   * @generated
   */
	int RENTAL = 5;

	/**
   * The feature id for the '<em><b>Customer</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL__CUSTOMER = 0;

	/**
   * The feature id for the '<em><b>Rented Object</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL__RENTED_OBJECT = 1;

	/**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL__START_DATE = 2;

	/**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL__END_DATE = 3;

	/**
   * The feature id for the '<em><b>Parent Agency</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL__PARENT_AGENCY = 4;

	/**
   * The number of structural features of the '<em>Rental</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RENTAL_FEATURE_COUNT = 5;

	/**
   * The meta object id for the '{@link com.opcoach.training.rental.StreetType <em>Street Type</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see com.opcoach.training.rental.StreetType
   * @see com.opcoach.training.rental.impl.RentalPackageImpl#getStreetType()
   * @generated
   */
	int STREET_TYPE = 6;

	/**
   * Returns the meta object for class '{@link com.opcoach.training.rental.Customer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Customer</em>'.
   * @see com.opcoach.training.rental.Customer
   * @generated
   */
	EClass getCustomer();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.Customer#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see com.opcoach.training.rental.Customer#getFirstName()
   * @see #getCustomer()
   * @generated
   */
	EAttribute getCustomer_FirstName();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.Customer#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see com.opcoach.training.rental.Customer#getLastName()
   * @see #getCustomer()
   * @generated
   */
	EAttribute getCustomer_LastName();

	/**
   * Returns the meta object for the containment reference '{@link com.opcoach.training.rental.Customer#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see com.opcoach.training.rental.Customer#getAddress()
   * @see #getCustomer()
   * @generated
   */
	EReference getCustomer_Address();

	/**
   * Returns the meta object for the containment reference list '{@link com.opcoach.training.rental.Customer#getLicenses <em>Licenses</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Licenses</em>'.
   * @see com.opcoach.training.rental.Customer#getLicenses()
   * @see #getCustomer()
   * @generated
   */
	EReference getCustomer_Licenses();

	/**
   * Returns the meta object for the container reference '{@link com.opcoach.training.rental.Customer#getParentAgency <em>Parent Agency</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Agency</em>'.
   * @see com.opcoach.training.rental.Customer#getParentAgency()
   * @see #getCustomer()
   * @generated
   */
	EReference getCustomer_ParentAgency();

	/**
   * Returns the meta object for class '{@link com.opcoach.training.rental.RentalAgency <em>Agency</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agency</em>'.
   * @see com.opcoach.training.rental.RentalAgency
   * @generated
   */
	EClass getRentalAgency();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.RentalAgency#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.opcoach.training.rental.RentalAgency#getName()
   * @see #getRentalAgency()
   * @generated
   */
	EAttribute getRentalAgency_Name();

	/**
   * Returns the meta object for the containment reference '{@link com.opcoach.training.rental.RentalAgency#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see com.opcoach.training.rental.RentalAgency#getAddress()
   * @see #getRentalAgency()
   * @generated
   */
	EReference getRentalAgency_Address();

	/**
   * Returns the meta object for the containment reference list '{@link com.opcoach.training.rental.RentalAgency#getObjectsToRent <em>Objects To Rent</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objects To Rent</em>'.
   * @see com.opcoach.training.rental.RentalAgency#getObjectsToRent()
   * @see #getRentalAgency()
   * @generated
   */
	EReference getRentalAgency_ObjectsToRent();

	/**
   * Returns the meta object for the containment reference list '{@link com.opcoach.training.rental.RentalAgency#getCustomers <em>Customers</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Customers</em>'.
   * @see com.opcoach.training.rental.RentalAgency#getCustomers()
   * @see #getRentalAgency()
   * @generated
   */
	EReference getRentalAgency_Customers();

	/**
   * Returns the meta object for the containment reference list '{@link com.opcoach.training.rental.RentalAgency#getRentals <em>Rentals</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rentals</em>'.
   * @see com.opcoach.training.rental.RentalAgency#getRentals()
   * @see #getRentalAgency()
   * @generated
   */
	EReference getRentalAgency_Rentals();

	/**
   * Returns the meta object for class '{@link com.opcoach.training.rental.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address</em>'.
   * @see com.opcoach.training.rental.Address
   * @generated
   */
	EClass getAddress();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.Address#getStreetType <em>Street Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Street Type</em>'.
   * @see com.opcoach.training.rental.Address#getStreetType()
   * @see #getAddress()
   * @generated
   */
	EAttribute getAddress_StreetType();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.Address#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see com.opcoach.training.rental.Address#getNumber()
   * @see #getAddress()
   * @generated
   */
	EAttribute getAddress_Number();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.Address#getZipCode <em>Zip Code</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zip Code</em>'.
   * @see com.opcoach.training.rental.Address#getZipCode()
   * @see #getAddress()
   * @generated
   */
	EAttribute getAddress_ZipCode();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.Address#getCity <em>City</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>City</em>'.
   * @see com.opcoach.training.rental.Address#getCity()
   * @see #getAddress()
   * @generated
   */
	EAttribute getAddress_City();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.Address#getStreetName <em>Street Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Street Name</em>'.
   * @see com.opcoach.training.rental.Address#getStreetName()
   * @see #getAddress()
   * @generated
   */
	EAttribute getAddress_StreetName();

	/**
   * Returns the meta object for class '{@link com.opcoach.training.rental.RentalObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see com.opcoach.training.rental.RentalObject
   * @generated
   */
	EClass getRentalObject();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.RentalObject#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see com.opcoach.training.rental.RentalObject#getID()
   * @see #getRentalObject()
   * @generated
   */
	EAttribute getRentalObject_ID();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.RentalObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.opcoach.training.rental.RentalObject#getName()
   * @see #getRentalObject()
   * @generated
   */
	EAttribute getRentalObject_Name();

	/**
   * Returns the meta object for the container reference '{@link com.opcoach.training.rental.RentalObject#getParentAgency <em>Parent Agency</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Agency</em>'.
   * @see com.opcoach.training.rental.RentalObject#getParentAgency()
   * @see #getRentalObject()
   * @generated
   */
	EReference getRentalObject_ParentAgency();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.RentalObject#isDispo <em>Dispo</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dispo</em>'.
   * @see com.opcoach.training.rental.RentalObject#isDispo()
   * @see #getRentalObject()
   * @generated
   */
	EAttribute getRentalObject_Dispo();

	/**
   * Returns the meta object for class '{@link com.opcoach.training.rental.License <em>License</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>License</em>'.
   * @see com.opcoach.training.rental.License
   * @generated
   */
	EClass getLicense();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.License#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see com.opcoach.training.rental.License#getNumber()
   * @see #getLicense()
   * @generated
   */
	EAttribute getLicense_Number();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.License#getValidityDate <em>Validity Date</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Validity Date</em>'.
   * @see com.opcoach.training.rental.License#getValidityDate()
   * @see #getLicense()
   * @generated
   */
	EAttribute getLicense_ValidityDate();

	/**
   * Returns the meta object for the container reference '{@link com.opcoach.training.rental.License#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner</em>'.
   * @see com.opcoach.training.rental.License#getOwner()
   * @see #getLicense()
   * @generated
   */
	EReference getLicense_Owner();

	/**
   * Returns the meta object for the reference '{@link com.opcoach.training.rental.License#getEReference0 <em>EReference0</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EReference0</em>'.
   * @see com.opcoach.training.rental.License#getEReference0()
   * @see #getLicense()
   * @generated
   */
	EReference getLicense_EReference0();

	/**
   * Returns the meta object for class '{@link com.opcoach.training.rental.Rental <em>Rental</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rental</em>'.
   * @see com.opcoach.training.rental.Rental
   * @generated
   */
	EClass getRental();

	/**
   * Returns the meta object for the reference '{@link com.opcoach.training.rental.Rental#getCustomer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Customer</em>'.
   * @see com.opcoach.training.rental.Rental#getCustomer()
   * @see #getRental()
   * @generated
   */
	EReference getRental_Customer();

	/**
   * Returns the meta object for the reference '{@link com.opcoach.training.rental.Rental#getRentedObject <em>Rented Object</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rented Object</em>'.
   * @see com.opcoach.training.rental.Rental#getRentedObject()
   * @see #getRental()
   * @generated
   */
	EReference getRental_RentedObject();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.Rental#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see com.opcoach.training.rental.Rental#getStartDate()
   * @see #getRental()
   * @generated
   */
	EAttribute getRental_StartDate();

	/**
   * Returns the meta object for the attribute '{@link com.opcoach.training.rental.Rental#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see com.opcoach.training.rental.Rental#getEndDate()
   * @see #getRental()
   * @generated
   */
	EAttribute getRental_EndDate();

	/**
   * Returns the meta object for the container reference '{@link com.opcoach.training.rental.Rental#getParentAgency <em>Parent Agency</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Agency</em>'.
   * @see com.opcoach.training.rental.Rental#getParentAgency()
   * @see #getRental()
   * @generated
   */
	EReference getRental_ParentAgency();

	/**
   * Returns the meta object for enum '{@link com.opcoach.training.rental.StreetType <em>Street Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Street Type</em>'.
   * @see com.opcoach.training.rental.StreetType
   * @generated
   */
	EEnum getStreetType();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	RentalFactory getRentalFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals
	{
		/**
     * The meta object literal for the '{@link com.opcoach.training.rental.impl.CustomerImpl <em>Customer</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see com.opcoach.training.rental.impl.CustomerImpl
     * @see com.opcoach.training.rental.impl.RentalPackageImpl#getCustomer()
     * @generated
     */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_FirstName();

		/**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CUSTOMER__LAST_NAME = eINSTANCE.getCustomer_LastName();

		/**
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CUSTOMER__ADDRESS = eINSTANCE.getCustomer_Address();

		/**
     * The meta object literal for the '<em><b>Licenses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CUSTOMER__LICENSES = eINSTANCE.getCustomer_Licenses();

		/**
     * The meta object literal for the '<em><b>Parent Agency</b></em>' container reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CUSTOMER__PARENT_AGENCY = eINSTANCE.getCustomer_ParentAgency();

		/**
     * The meta object literal for the '{@link com.opcoach.training.rental.impl.RentalAgencyImpl <em>Agency</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see com.opcoach.training.rental.impl.RentalAgencyImpl
     * @see com.opcoach.training.rental.impl.RentalPackageImpl#getRentalAgency()
     * @generated
     */
		EClass RENTAL_AGENCY = eINSTANCE.getRentalAgency();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RENTAL_AGENCY__NAME = eINSTANCE.getRentalAgency_Name();

		/**
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RENTAL_AGENCY__ADDRESS = eINSTANCE.getRentalAgency_Address();

		/**
     * The meta object literal for the '<em><b>Objects To Rent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RENTAL_AGENCY__OBJECTS_TO_RENT = eINSTANCE.getRentalAgency_ObjectsToRent();

		/**
     * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RENTAL_AGENCY__CUSTOMERS = eINSTANCE.getRentalAgency_Customers();

		/**
     * The meta object literal for the '<em><b>Rentals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RENTAL_AGENCY__RENTALS = eINSTANCE.getRentalAgency_Rentals();

		/**
     * The meta object literal for the '{@link com.opcoach.training.rental.impl.AddressImpl <em>Address</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see com.opcoach.training.rental.impl.AddressImpl
     * @see com.opcoach.training.rental.impl.RentalPackageImpl#getAddress()
     * @generated
     */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
     * The meta object literal for the '<em><b>Street Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ADDRESS__STREET_TYPE = eINSTANCE.getAddress_StreetType();

		/**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ADDRESS__NUMBER = eINSTANCE.getAddress_Number();

		/**
     * The meta object literal for the '<em><b>Zip Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ADDRESS__ZIP_CODE = eINSTANCE.getAddress_ZipCode();

		/**
     * The meta object literal for the '<em><b>City</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
     * The meta object literal for the '<em><b>Street Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ADDRESS__STREET_NAME = eINSTANCE.getAddress_StreetName();

		/**
     * The meta object literal for the '{@link com.opcoach.training.rental.impl.RentalObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see com.opcoach.training.rental.impl.RentalObjectImpl
     * @see com.opcoach.training.rental.impl.RentalPackageImpl#getRentalObject()
     * @generated
     */
		EClass RENTAL_OBJECT = eINSTANCE.getRentalObject();

		/**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RENTAL_OBJECT__ID = eINSTANCE.getRentalObject_ID();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RENTAL_OBJECT__NAME = eINSTANCE.getRentalObject_Name();

		/**
     * The meta object literal for the '<em><b>Parent Agency</b></em>' container reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RENTAL_OBJECT__PARENT_AGENCY = eINSTANCE.getRentalObject_ParentAgency();

		/**
     * The meta object literal for the '<em><b>Dispo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RENTAL_OBJECT__DISPO = eINSTANCE.getRentalObject_Dispo();

		/**
     * The meta object literal for the '{@link com.opcoach.training.rental.impl.LicenseImpl <em>License</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see com.opcoach.training.rental.impl.LicenseImpl
     * @see com.opcoach.training.rental.impl.RentalPackageImpl#getLicense()
     * @generated
     */
		EClass LICENSE = eINSTANCE.getLicense();

		/**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute LICENSE__NUMBER = eINSTANCE.getLicense_Number();

		/**
     * The meta object literal for the '<em><b>Validity Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute LICENSE__VALIDITY_DATE = eINSTANCE.getLicense_ValidityDate();

		/**
     * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference LICENSE__OWNER = eINSTANCE.getLicense_Owner();

		/**
     * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference LICENSE__EREFERENCE0 = eINSTANCE.getLicense_EReference0();

		/**
     * The meta object literal for the '{@link com.opcoach.training.rental.impl.RentalImpl <em>Rental</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see com.opcoach.training.rental.impl.RentalImpl
     * @see com.opcoach.training.rental.impl.RentalPackageImpl#getRental()
     * @generated
     */
		EClass RENTAL = eINSTANCE.getRental();

		/**
     * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RENTAL__CUSTOMER = eINSTANCE.getRental_Customer();

		/**
     * The meta object literal for the '<em><b>Rented Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RENTAL__RENTED_OBJECT = eINSTANCE.getRental_RentedObject();

		/**
     * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RENTAL__START_DATE = eINSTANCE.getRental_StartDate();

		/**
     * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RENTAL__END_DATE = eINSTANCE.getRental_EndDate();

		/**
     * The meta object literal for the '<em><b>Parent Agency</b></em>' container reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RENTAL__PARENT_AGENCY = eINSTANCE.getRental_ParentAgency();

		/**
     * The meta object literal for the '{@link com.opcoach.training.rental.StreetType <em>Street Type</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see com.opcoach.training.rental.StreetType
     * @see com.opcoach.training.rental.impl.RentalPackageImpl#getStreetType()
     * @generated
     */
		EEnum STREET_TYPE = eINSTANCE.getStreetType();

	}

} //RentalPackage

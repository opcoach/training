/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.opcoach.training.rental.Address;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.License;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalFactory;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.RentalPackage;
import com.opcoach.training.rental.StreetType;
import com.opcoach.training.rental.util.RentalValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RentalPackageImpl extends EPackageImpl implements RentalPackage
{
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final String copyright = "OPCoach @ 2012";

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass customerEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass rentalAgencyEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass addressEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass rentalObjectEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass licenseEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass rentalEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum streetTypeEEnum = null;

	/**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.opcoach.training.rental.RentalPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private RentalPackageImpl()
	{
    super(eNS_URI, RentalFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RentalPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static RentalPackage init()
	{
    if (isInited) return (RentalPackage)EPackage.Registry.INSTANCE.getEPackage(RentalPackage.eNS_URI);

    // Obtain or create and register package
    RentalPackageImpl theRentalPackage = (RentalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RentalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RentalPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRentalPackage.createPackageContents();

    // Initialize created meta-data
    theRentalPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theRentalPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return RentalValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theRentalPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RentalPackage.eNS_URI, theRentalPackage);
    return theRentalPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCustomer()
	{
    return customerEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getCustomer_FirstName()
	{
    return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getCustomer_LastName()
	{
    return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getCustomer_Address()
	{
    return (EReference)customerEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getCustomer_Licenses()
	{
    return (EReference)customerEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getCustomer_ParentAgency()
	{
    return (EReference)customerEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getRentalAgency()
	{
    return rentalAgencyEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRentalAgency_Name()
	{
    return (EAttribute)rentalAgencyEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRentalAgency_Address()
	{
    return (EReference)rentalAgencyEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRentalAgency_ObjectsToRent()
	{
    return (EReference)rentalAgencyEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRentalAgency_Customers()
	{
    return (EReference)rentalAgencyEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRentalAgency_Rentals()
	{
    return (EReference)rentalAgencyEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAddress()
	{
    return addressEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAddress_StreetType()
	{
    return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAddress_Number()
	{
    return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAddress_ZipCode()
	{
    return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAddress_City()
	{
    return (EAttribute)addressEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAddress_StreetName()
	{
    return (EAttribute)addressEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getRentalObject()
	{
    return rentalObjectEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRentalObject_ID()
	{
    return (EAttribute)rentalObjectEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRentalObject_Name()
	{
    return (EAttribute)rentalObjectEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRentalObject_ParentAgency()
	{
    return (EReference)rentalObjectEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRentalObject_Dispo()
	{
    return (EAttribute)rentalObjectEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getLicense()
	{
    return licenseEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getLicense_Number()
	{
    return (EAttribute)licenseEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getLicense_ValidityDate()
	{
    return (EAttribute)licenseEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getLicense_Owner()
	{
    return (EReference)licenseEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getLicense_EReference0()
	{
    return (EReference)licenseEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getRental()
	{
    return rentalEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRental_Customer()
	{
    return (EReference)rentalEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRental_RentedObject()
	{
    return (EReference)rentalEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRental_StartDate()
	{
    return (EAttribute)rentalEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRental_EndDate()
	{
    return (EAttribute)rentalEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRental_ParentAgency()
	{
    return (EReference)rentalEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getStreetType()
	{
    return streetTypeEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RentalFactory getRentalFactory()
	{
    return (RentalFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents()
	{
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rentalAgencyEClass = createEClass(RENTAL_AGENCY);
    createEAttribute(rentalAgencyEClass, RENTAL_AGENCY__NAME);
    createEReference(rentalAgencyEClass, RENTAL_AGENCY__ADDRESS);
    createEReference(rentalAgencyEClass, RENTAL_AGENCY__OBJECTS_TO_RENT);
    createEReference(rentalAgencyEClass, RENTAL_AGENCY__CUSTOMERS);
    createEReference(rentalAgencyEClass, RENTAL_AGENCY__RENTALS);

    customerEClass = createEClass(CUSTOMER);
    createEAttribute(customerEClass, CUSTOMER__FIRST_NAME);
    createEAttribute(customerEClass, CUSTOMER__LAST_NAME);
    createEReference(customerEClass, CUSTOMER__ADDRESS);
    createEReference(customerEClass, CUSTOMER__LICENSES);
    createEReference(customerEClass, CUSTOMER__PARENT_AGENCY);

    addressEClass = createEClass(ADDRESS);
    createEAttribute(addressEClass, ADDRESS__STREET_TYPE);
    createEAttribute(addressEClass, ADDRESS__NUMBER);
    createEAttribute(addressEClass, ADDRESS__ZIP_CODE);
    createEAttribute(addressEClass, ADDRESS__CITY);
    createEAttribute(addressEClass, ADDRESS__STREET_NAME);

    rentalObjectEClass = createEClass(RENTAL_OBJECT);
    createEAttribute(rentalObjectEClass, RENTAL_OBJECT__ID);
    createEAttribute(rentalObjectEClass, RENTAL_OBJECT__NAME);
    createEReference(rentalObjectEClass, RENTAL_OBJECT__PARENT_AGENCY);
    createEAttribute(rentalObjectEClass, RENTAL_OBJECT__DISPO);

    licenseEClass = createEClass(LICENSE);
    createEAttribute(licenseEClass, LICENSE__NUMBER);
    createEAttribute(licenseEClass, LICENSE__VALIDITY_DATE);
    createEReference(licenseEClass, LICENSE__OWNER);
    createEReference(licenseEClass, LICENSE__EREFERENCE0);

    rentalEClass = createEClass(RENTAL);
    createEReference(rentalEClass, RENTAL__CUSTOMER);
    createEReference(rentalEClass, RENTAL__RENTED_OBJECT);
    createEAttribute(rentalEClass, RENTAL__START_DATE);
    createEAttribute(rentalEClass, RENTAL__END_DATE);
    createEReference(rentalEClass, RENTAL__PARENT_AGENCY);

    // Create enums
    streetTypeEEnum = createEEnum(STREET_TYPE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void initializePackageContents()
	{
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(rentalAgencyEClass, RentalAgency.class, "RentalAgency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRentalAgency_Name(), ecorePackage.getEString(), "name", null, 0, 1, RentalAgency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRentalAgency_Address(), this.getAddress(), null, "address", null, 1, 1, RentalAgency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRentalAgency_ObjectsToRent(), this.getRentalObject(), this.getRentalObject_ParentAgency(), "objectsToRent", null, 0, -1, RentalAgency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRentalAgency_Customers(), this.getCustomer(), this.getCustomer_ParentAgency(), "customers", null, 0, -1, RentalAgency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRentalAgency_Rentals(), this.getRental(), this.getRental_ParentAgency(), "rentals", null, 0, -1, RentalAgency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = addEOperation(rentalAgencyEClass, this.getRental(), "book", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getCustomer(), "customer", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getRentalObject(), "rentedObject", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(rentalAgencyEClass, ecorePackage.getEBoolean(), "isAvailable", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getRentalObject(), "rentedObject", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDate(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDate(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomer_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomer_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomer_Address(), this.getAddress(), null, "address", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomer_Licenses(), this.getLicense(), this.getLicense_Owner(), "licenses", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomer_ParentAgency(), this.getRentalAgency(), this.getRentalAgency_Customers(), "parentAgency", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(customerEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(customerEClass, null, "addLicense", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getLicense(), "license", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddress_StreetType(), this.getStreetType(), "streetType", "0", 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_ZipCode(), ecorePackage.getEString(), "zipCode", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_City(), ecorePackage.getEString(), "city", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_StreetName(), ecorePackage.getEString(), "streetName", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rentalObjectEClass, RentalObject.class, "RentalObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRentalObject_ID(), ecorePackage.getELong(), "ID", null, 0, 1, RentalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRentalObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, RentalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRentalObject_ParentAgency(), this.getRentalAgency(), this.getRentalAgency_ObjectsToRent(), "parentAgency", null, 1, 1, RentalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRentalObject_Dispo(), ecorePackage.getEBoolean(), "dispo", null, 0, 1, RentalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = addEOperation(rentalObjectEClass, this.getRental(), "rent", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getCustomer(), "customer", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(licenseEClass, License.class, "License", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLicense_Number(), ecorePackage.getEInt(), "number", null, 0, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLicense_ValidityDate(), ecorePackage.getEDate(), "validityDate", null, 0, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLicense_Owner(), this.getCustomer(), this.getCustomer_Licenses(), "owner", null, 0, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLicense_EReference0(), this.getCustomer(), null, "EReference0", null, 0, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(licenseEClass, ecorePackage.getEBoolean(), "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(rentalEClass, Rental.class, "Rental", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRental_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Rental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRental_RentedObject(), this.getRentalObject(), null, "rentedObject", null, 1, 1, Rental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRental_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Rental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRental_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Rental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRental_ParentAgency(), this.getRentalAgency(), this.getRentalAgency_Rentals(), "parentAgency", null, 1, 1, Rental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(rentalEClass, ecorePackage.getEInt(), "nbDaysBooked", 0, 1, IS_UNIQUE, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(streetTypeEEnum, StreetType.class, "StreetType");
    addEEnumLiteral(streetTypeEEnum, StreetType.STREET);
    addEEnumLiteral(streetTypeEEnum, StreetType.ROAD);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.compartment
    createGmf_2Annotations();
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // gmf.node
    createGmf_3Annotations();
    // gmf.link
    createGmf_4Annotations();
  }

	/**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createGmfAnnotations()
	{
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });															
  }

	/**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createGmf_1Annotations()
	{
    String source = "gmf.diagram";			
    addAnnotation
      (rentalAgencyEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });														
  }

	/**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createGmf_2Annotations()
	{
    String source = "gmf.compartment";				
    addAnnotation
      (getRentalAgency_Address(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });						
    addAnnotation
      (getCustomer_Address(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getCustomer_Licenses(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });							
  }

	/**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEcoreAnnotations()
	{
    String source = "http://www.eclipse.org/emf/2002/Ecore";					
    addAnnotation
      (customerEClass, 
       source, 
       new String[] 
       {
       "constraints", "consistentName"
       });										
    addAnnotation
      (rentalEClass, 
       source, 
       new String[] 
       {
       "constraints", "startDateBeforeEndDate"
       });			
  }

	/**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createGmf_3Annotations()
	{
    String source = "gmf.node";						
    addAnnotation
      (customerEClass, 
       source, 
       new String[] 
       {
       "label", "firstName,lastName"
       });		
    addAnnotation
      (customerEClass, 
       source, 
       new String[] 
       {
       "label.pattern", "{0}:{1}"
       });		
    addAnnotation
      (customerEClass, 
       source, 
       new String[] 
       {
       "figure", "com.opcoach.training.rental.gef.figures"
       });				
    addAnnotation
      (addressEClass, 
       source, 
       new String[] 
       {
       "label", "city"
       });		
    addAnnotation
      (rentalObjectEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (licenseEClass, 
       source, 
       new String[] 
       {
       "label", "number"
       });			
    addAnnotation
      (rentalEClass, 
       source, 
       new String[] 
       {
       "label", "startDate"
       });		
  }

	/**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createGmf_4Annotations()
	{
    String source = "gmf.link";																
    addAnnotation
      (getRental_Customer(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash"
       });		
    addAnnotation
      (getRental_RentedObject(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "solid"
       });
  }

} //RentalPackageImpl

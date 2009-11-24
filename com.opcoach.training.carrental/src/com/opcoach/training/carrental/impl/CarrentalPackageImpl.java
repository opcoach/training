/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental.impl;

import com.opcoach.training.carrental.Bike;
import com.opcoach.training.carrental.Car;
import com.opcoach.training.carrental.CarBrand;
import com.opcoach.training.carrental.CarRentalAgency;
import com.opcoach.training.carrental.CarrentalFactory;
import com.opcoach.training.carrental.CarrentalPackage;
import com.opcoach.training.carrental.DrivingLicense;
import com.opcoach.training.carrental.Vehicle;

import com.opcoach.training.rental.RentalPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarrentalPackageImpl extends EPackageImpl implements CarrentalPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carRentalAgencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bikeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drivingLicenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carBrandEEnum = null;

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
	 * @see com.opcoach.training.carrental.CarrentalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CarrentalPackageImpl()
	{
		super(eNS_URI, CarrentalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CarrentalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CarrentalPackage init()
	{
		if (isInited) return (CarrentalPackage)EPackage.Registry.INSTANCE.getEPackage(CarrentalPackage.eNS_URI);

		// Obtain or create and register package
		CarrentalPackageImpl theCarrentalPackage = (CarrentalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CarrentalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CarrentalPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RentalPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCarrentalPackage.createPackageContents();

		// Initialize created meta-data
		theCarrentalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCarrentalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CarrentalPackage.eNS_URI, theCarrentalPackage);
		return theCarrentalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCar()
	{
		return carEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCar_Registration()
	{
		return (EAttribute)carEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCar_Brand()
	{
		return (EAttribute)carEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCar_AirConditionning()
	{
		return (EAttribute)carEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCar_RadioCD()
	{
		return (EAttribute)carEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarRentalAgency()
	{
		return carRentalAgencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBike()
	{
		return bikeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBike_FrontTireSize()
	{
		return (EAttribute)bikeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBike_BackTireSize()
	{
		return (EAttribute)bikeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrivingLicense()
	{
		return drivingLicenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrivingLicense_DeliveryDate()
	{
		return (EAttribute)drivingLicenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrivingLicense_DeliveryLocation()
	{
		return (EAttribute)drivingLicenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicle()
	{
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_PlateNumber()
	{
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_HorsePower()
	{
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarBrand()
	{
		return carBrandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrentalFactory getCarrentalFactory()
	{
		return (CarrentalFactory)getEFactoryInstance();
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
		carEClass = createEClass(CAR);
		createEAttribute(carEClass, CAR__REGISTRATION);
		createEAttribute(carEClass, CAR__BRAND);
		createEAttribute(carEClass, CAR__AIR_CONDITIONNING);
		createEAttribute(carEClass, CAR__RADIO_CD);

		carRentalAgencyEClass = createEClass(CAR_RENTAL_AGENCY);

		bikeEClass = createEClass(BIKE);
		createEAttribute(bikeEClass, BIKE__FRONT_TIRE_SIZE);
		createEAttribute(bikeEClass, BIKE__BACK_TIRE_SIZE);

		drivingLicenseEClass = createEClass(DRIVING_LICENSE);
		createEAttribute(drivingLicenseEClass, DRIVING_LICENSE__DELIVERY_DATE);
		createEAttribute(drivingLicenseEClass, DRIVING_LICENSE__DELIVERY_LOCATION);

		vehicleEClass = createEClass(VEHICLE);
		createEAttribute(vehicleEClass, VEHICLE__PLATE_NUMBER);
		createEAttribute(vehicleEClass, VEHICLE__HORSE_POWER);

		// Create enums
		carBrandEEnum = createEEnum(CAR_BRAND);
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

		// Obtain other dependent packages
		RentalPackage theRentalPackage = (RentalPackage)EPackage.Registry.INSTANCE.getEPackage(RentalPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		carEClass.getESuperTypes().add(this.getVehicle());
		carRentalAgencyEClass.getESuperTypes().add(theRentalPackage.getRentalAgency());
		bikeEClass.getESuperTypes().add(this.getVehicle());
		drivingLicenseEClass.getESuperTypes().add(theRentalPackage.getLicense());
		vehicleEClass.getESuperTypes().add(theRentalPackage.getRentalObject());

		// Initialize classes and features; add operations and parameters
		initEClass(carEClass, Car.class, "Car", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCar_Registration(), ecorePackage.getEString(), "registration", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCar_Brand(), this.getCarBrand(), "brand", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCar_AirConditionning(), ecorePackage.getEBoolean(), "airConditionning", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCar_RadioCD(), ecorePackage.getEBoolean(), "radioCD", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carRentalAgencyEClass, CarRentalAgency.class, "CarRentalAgency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(carRentalAgencyEClass, null, "disable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCar(), "car", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(carRentalAgencyEClass, null, "enable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCar(), "car", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bikeEClass, Bike.class, "Bike", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBike_FrontTireSize(), ecorePackage.getEInt(), "frontTireSize", null, 0, 1, Bike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBike_BackTireSize(), ecorePackage.getEInt(), "backTireSize", null, 0, 1, Bike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drivingLicenseEClass, DrivingLicense.class, "DrivingLicense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDrivingLicense_DeliveryDate(), ecorePackage.getEDate(), "deliveryDate", null, 0, 1, DrivingLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrivingLicense_DeliveryLocation(), ecorePackage.getEString(), "deliveryLocation", null, 0, 1, DrivingLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicle_PlateNumber(), ecorePackage.getEString(), "plateNumber", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_HorsePower(), ecorePackage.getEFloat(), "horsePower", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(carBrandEEnum, CarBrand.class, "CarBrand");
		addEEnumLiteral(carBrandEEnum, CarBrand.AUDI);
		addEEnumLiteral(carBrandEEnum, CarBrand.ALPHA_ROMEO);
		addEEnumLiteral(carBrandEEnum, CarBrand.BMW);
		addEEnumLiteral(carBrandEEnum, CarBrand.PEUGEOT);
		addEEnumLiteral(carBrandEEnum, CarBrand.RENAULT);

		// Create resource
		createResource(eNS_URI);
	}

} //CarrentalPackageImpl

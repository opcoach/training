/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental;

import com.opcoach.training.rental.RentalPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.opcoach.training.carrental.CarrentalFactory
 * @model kind="package"
 * @generated
 */
public interface CarrentalPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "carrental";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.opcoach.training.rental.car/carRental/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "carrental";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CarrentalPackage eINSTANCE = com.opcoach.training.carrental.impl.CarrentalPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.training.carrental.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.carrental.impl.VehicleImpl
	 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ID = RentalPackage.RENTAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = RentalPackage.RENTAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Agency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__PARENT_AGENCY = RentalPackage.RENTAL_OBJECT__PARENT_AGENCY;

	/**
	 * The feature id for the '<em><b>Dispo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__DISPO = RentalPackage.RENTAL_OBJECT__AVAILABLE;

	/**
	 * The feature id for the '<em><b>Plate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__PLATE_NUMBER = RentalPackage.RENTAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horse Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__HORSE_POWER = RentalPackage.RENTAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = RentalPackage.RENTAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.opcoach.training.carrental.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.carrental.impl.CarImpl
	 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__ID = VEHICLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Agency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__PARENT_AGENCY = VEHICLE__PARENT_AGENCY;

	/**
	 * The feature id for the '<em><b>Dispo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__DISPO = VEHICLE__DISPO;

	/**
	 * The feature id for the '<em><b>Plate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__PLATE_NUMBER = VEHICLE__PLATE_NUMBER;

	/**
	 * The feature id for the '<em><b>Horse Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__HORSE_POWER = VEHICLE__HORSE_POWER;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__REGISTRATION = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__BRAND = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Air Conditionning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__AIR_CONDITIONNING = VEHICLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Radio CD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__RADIO_CD = VEHICLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.opcoach.training.carrental.impl.CarRentalAgencyImpl <em>Car Rental Agency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.carrental.impl.CarRentalAgencyImpl
	 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getCarRentalAgency()
	 * @generated
	 */
	int CAR_RENTAL_AGENCY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RENTAL_AGENCY__NAME = RentalPackage.RENTAL_AGENCY__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RENTAL_AGENCY__ADDRESS = RentalPackage.RENTAL_AGENCY__ADDRESS;

	/**
	 * The feature id for the '<em><b>Objects To Rent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RENTAL_AGENCY__OBJECTS_TO_RENT = RentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RENTAL_AGENCY__CUSTOMERS = RentalPackage.RENTAL_AGENCY__CUSTOMERS;

	/**
	 * The feature id for the '<em><b>Rentals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RENTAL_AGENCY__RENTALS = RentalPackage.RENTAL_AGENCY__RENTALS;

	/**
	 * The number of structural features of the '<em>Car Rental Agency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RENTAL_AGENCY_FEATURE_COUNT = RentalPackage.RENTAL_AGENCY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.training.carrental.impl.BikeImpl <em>Bike</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.carrental.impl.BikeImpl
	 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getBike()
	 * @generated
	 */
	int BIKE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__ID = VEHICLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Agency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__PARENT_AGENCY = VEHICLE__PARENT_AGENCY;

	/**
	 * The feature id for the '<em><b>Dispo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__DISPO = VEHICLE__DISPO;

	/**
	 * The feature id for the '<em><b>Plate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__PLATE_NUMBER = VEHICLE__PLATE_NUMBER;

	/**
	 * The feature id for the '<em><b>Horse Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__HORSE_POWER = VEHICLE__HORSE_POWER;

	/**
	 * The feature id for the '<em><b>Front Tire Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__FRONT_TIRE_SIZE = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Back Tire Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__BACK_TIRE_SIZE = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.opcoach.training.carrental.impl.DrivingLicenseImpl <em>Driving License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.carrental.impl.DrivingLicenseImpl
	 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getDrivingLicense()
	 * @generated
	 */
	int DRIVING_LICENSE = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_LICENSE__NUMBER = RentalPackage.LICENSE__NUMBER;

	/**
	 * The feature id for the '<em><b>Validity Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_LICENSE__VALIDITY_DATE = RentalPackage.LICENSE__VALIDITY_DATE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_LICENSE__OWNER = RentalPackage.LICENSE__OWNER;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_LICENSE__EREFERENCE0 = RentalPackage.LICENSE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_LICENSE__DELIVERY_DATE = RentalPackage.LICENSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delivery Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_LICENSE__DELIVERY_LOCATION = RentalPackage.LICENSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Driving License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_LICENSE_FEATURE_COUNT = RentalPackage.LICENSE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.opcoach.training.carrental.CarBrand <em>Car Brand</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.carrental.CarBrand
	 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getCarBrand()
	 * @generated
	 */
	int CAR_BRAND = 5;


	/**
	 * Returns the meta object for class '{@link com.opcoach.training.carrental.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see com.opcoach.training.carrental.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.carrental.Car#getRegistration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration</em>'.
	 * @see com.opcoach.training.carrental.Car#getRegistration()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Registration();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.carrental.Car#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see com.opcoach.training.carrental.Car#getBrand()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Brand();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.carrental.Car#isAirConditionning <em>Air Conditionning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Conditionning</em>'.
	 * @see com.opcoach.training.carrental.Car#isAirConditionning()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_AirConditionning();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.carrental.Car#isRadioCD <em>Radio CD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio CD</em>'.
	 * @see com.opcoach.training.carrental.Car#isRadioCD()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_RadioCD();

	/**
	 * Returns the meta object for class '{@link com.opcoach.training.carrental.CarRentalAgency <em>Car Rental Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car Rental Agency</em>'.
	 * @see com.opcoach.training.carrental.CarRentalAgency
	 * @generated
	 */
	EClass getCarRentalAgency();

	/**
	 * Returns the meta object for class '{@link com.opcoach.training.carrental.Bike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bike</em>'.
	 * @see com.opcoach.training.carrental.Bike
	 * @generated
	 */
	EClass getBike();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.carrental.Bike#getFrontTireSize <em>Front Tire Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front Tire Size</em>'.
	 * @see com.opcoach.training.carrental.Bike#getFrontTireSize()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_FrontTireSize();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.carrental.Bike#getBackTireSize <em>Back Tire Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Back Tire Size</em>'.
	 * @see com.opcoach.training.carrental.Bike#getBackTireSize()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_BackTireSize();

	/**
	 * Returns the meta object for class '{@link com.opcoach.training.carrental.DrivingLicense <em>Driving License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driving License</em>'.
	 * @see com.opcoach.training.carrental.DrivingLicense
	 * @generated
	 */
	EClass getDrivingLicense();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.carrental.DrivingLicense#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see com.opcoach.training.carrental.DrivingLicense#getDeliveryDate()
	 * @see #getDrivingLicense()
	 * @generated
	 */
	EAttribute getDrivingLicense_DeliveryDate();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.carrental.DrivingLicense#getDeliveryLocation <em>Delivery Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Location</em>'.
	 * @see com.opcoach.training.carrental.DrivingLicense#getDeliveryLocation()
	 * @see #getDrivingLicense()
	 * @generated
	 */
	EAttribute getDrivingLicense_DeliveryLocation();

	/**
	 * Returns the meta object for class '{@link com.opcoach.training.carrental.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see com.opcoach.training.carrental.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.carrental.Vehicle#getPlateNumber <em>Plate Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plate Number</em>'.
	 * @see com.opcoach.training.carrental.Vehicle#getPlateNumber()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_PlateNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.carrental.Vehicle#getHorsePower <em>Horse Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horse Power</em>'.
	 * @see com.opcoach.training.carrental.Vehicle#getHorsePower()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_HorsePower();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.training.carrental.CarBrand <em>Car Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Car Brand</em>'.
	 * @see com.opcoach.training.carrental.CarBrand
	 * @generated
	 */
	EEnum getCarBrand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CarrentalFactory getCarrentalFactory();

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
		 * The meta object literal for the '{@link com.opcoach.training.carrental.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.training.carrental.impl.CarImpl
		 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__REGISTRATION = eINSTANCE.getCar_Registration();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__BRAND = eINSTANCE.getCar_Brand();

		/**
		 * The meta object literal for the '<em><b>Air Conditionning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__AIR_CONDITIONNING = eINSTANCE.getCar_AirConditionning();

		/**
		 * The meta object literal for the '<em><b>Radio CD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__RADIO_CD = eINSTANCE.getCar_RadioCD();

		/**
		 * The meta object literal for the '{@link com.opcoach.training.carrental.impl.CarRentalAgencyImpl <em>Car Rental Agency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.training.carrental.impl.CarRentalAgencyImpl
		 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getCarRentalAgency()
		 * @generated
		 */
		EClass CAR_RENTAL_AGENCY = eINSTANCE.getCarRentalAgency();

		/**
		 * The meta object literal for the '{@link com.opcoach.training.carrental.impl.BikeImpl <em>Bike</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.training.carrental.impl.BikeImpl
		 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getBike()
		 * @generated
		 */
		EClass BIKE = eINSTANCE.getBike();

		/**
		 * The meta object literal for the '<em><b>Front Tire Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__FRONT_TIRE_SIZE = eINSTANCE.getBike_FrontTireSize();

		/**
		 * The meta object literal for the '<em><b>Back Tire Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__BACK_TIRE_SIZE = eINSTANCE.getBike_BackTireSize();

		/**
		 * The meta object literal for the '{@link com.opcoach.training.carrental.impl.DrivingLicenseImpl <em>Driving License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.training.carrental.impl.DrivingLicenseImpl
		 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getDrivingLicense()
		 * @generated
		 */
		EClass DRIVING_LICENSE = eINSTANCE.getDrivingLicense();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVING_LICENSE__DELIVERY_DATE = eINSTANCE.getDrivingLicense_DeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Delivery Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVING_LICENSE__DELIVERY_LOCATION = eINSTANCE.getDrivingLicense_DeliveryLocation();

		/**
		 * The meta object literal for the '{@link com.opcoach.training.carrental.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.training.carrental.impl.VehicleImpl
		 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Plate Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__PLATE_NUMBER = eINSTANCE.getVehicle_PlateNumber();

		/**
		 * The meta object literal for the '<em><b>Horse Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__HORSE_POWER = eINSTANCE.getVehicle_HorsePower();

		/**
		 * The meta object literal for the '{@link com.opcoach.training.carrental.CarBrand <em>Car Brand</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.training.carrental.CarBrand
		 * @see com.opcoach.training.carrental.impl.CarrentalPackageImpl#getCarBrand()
		 * @generated
		 */
		EEnum CAR_BRAND = eINSTANCE.getCarBrand();

	}

} //CarrentalPackage

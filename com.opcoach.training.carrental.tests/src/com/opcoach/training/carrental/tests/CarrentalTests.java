/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>carrental</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarrentalTests extends TestSuite
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite()
	{
		TestSuite suite = new CarrentalTests("carrental Tests");
		suite.addTestSuite(CarTest.class);
		suite.addTestSuite(CarRentalAgencyTest.class);
		suite.addTestSuite(BikeTest.class);
		suite.addTestSuite(DrivingLicenseTest.class);
		suite.addTestSuite(VehicleTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrentalTests(String name)
	{
		super(name);
	}

} //CarrentalTests

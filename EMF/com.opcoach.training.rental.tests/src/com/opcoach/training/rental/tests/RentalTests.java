/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>rental</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RentalTests extends TestSuite
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "OPCoach @ 2009";

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
		TestSuite suite = new RentalTests("rental Tests");
		suite.addTestSuite(RentalAgencyTest.class);
		suite.addTestSuite(CustomerTest.class);
		suite.addTestSuite(RentalObjectTest.class);
		suite.addTestSuite(LicenseTest.class);
		suite.addTestSuite(RentalTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalTests(String name)
	{
		super(name);
	}

} //RentalTests

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
 * A test suite for the '<em><b>Rental</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class RentalAllTests extends TestSuite
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
		TestSuite suite = new RentalAllTests("Rental Tests");
		suite.addTest(RentalTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalAllTests(String name)
	{
		super(name);
	}

} //RentalAllTests

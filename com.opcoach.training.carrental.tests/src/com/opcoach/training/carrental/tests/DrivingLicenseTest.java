/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental.tests;

import com.opcoach.training.carrental.CarrentalFactory;
import com.opcoach.training.carrental.DrivingLicense;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Driving License</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DrivingLicenseTest extends TestCase
{

	/**
	 * The fixture for this Driving License test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrivingLicense fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(DrivingLicenseTest.class);
	}

	/**
	 * Constructs a new Driving License test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrivingLicenseTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this Driving License test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DrivingLicense fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Driving License test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrivingLicense getFixture()
	{
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception
	{
		setFixture(CarrentalFactory.eINSTANCE.createDrivingLicense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception
	{
		setFixture(null);
	}

} //DrivingLicenseTest

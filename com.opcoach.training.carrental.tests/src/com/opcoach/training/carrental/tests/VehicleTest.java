/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental.tests;

import com.opcoach.training.carrental.CarrentalFactory;
import com.opcoach.training.carrental.Vehicle;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VehicleTest extends TestCase
{

	/**
	 * The fixture for this Vehicle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vehicle fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(VehicleTest.class);
	}

	/**
	 * Constructs a new Vehicle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this Vehicle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Vehicle fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vehicle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vehicle getFixture()
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
		setFixture(CarrentalFactory.eINSTANCE.createVehicle());
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

} //VehicleTest

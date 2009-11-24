/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental.tests;

import com.opcoach.training.carrental.Car;
import com.opcoach.training.carrental.CarrentalFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarTest extends VehicleTest
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(CarTest.class);
	}

	/**
	 * Constructs a new Car test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarTest(String name)
	{
		super(name);
	}

	/**
	 * Returns the fixture for this Car test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Car getFixture()
	{
		return (Car)fixture;
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
		setFixture(CarrentalFactory.eINSTANCE.createCar());
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

} //CarTest

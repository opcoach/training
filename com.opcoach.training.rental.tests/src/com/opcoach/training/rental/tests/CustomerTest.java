/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental.tests;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.Customer#getDisplayName() <em>Get Display Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CustomerTest extends TestCase
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "OPCoach @ 2009";

	/**
	 * The fixture for this Customer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Customer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(CustomerTest.class);
	}

	/**
	 * Constructs a new Customer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this Customer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Customer fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Customer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Customer getFixture()
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
		setFixture(RentalFactory.eINSTANCE.createCustomer());
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

	/**
	 * Tests the '{@link com.opcoach.training.rental.Customer#getDisplayName() <em>Get Display Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.rental.Customer#getDisplayName()
	 * @generated
	 */
	public void testGetDisplayName()
	{
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //CustomerTest

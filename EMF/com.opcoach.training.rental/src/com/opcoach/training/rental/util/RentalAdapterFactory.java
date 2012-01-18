/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental.util;

import com.opcoach.training.rental.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.opcoach.training.rental.Address;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.License;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.RentalPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.training.rental.RentalPackage
 * @generated
 */
public class RentalAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "OPCoach @ 2012";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RentalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = RentalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalSwitch<Adapter> modelSwitch =
		new RentalSwitch<Adapter>()
		{
			@Override
			public Adapter caseRentalAgency(RentalAgency object)
			{
				return createRentalAgencyAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object)
			{
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseAddress(Address object)
			{
				return createAddressAdapter();
			}
			@Override
			public Adapter caseRentalObject(RentalObject object)
			{
				return createRentalObjectAdapter();
			}
			@Override
			public Adapter caseLicense(License object)
			{
				return createLicenseAdapter();
			}
			@Override
			public Adapter caseRental(Rental object)
			{
				return createRentalAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.training.rental.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.training.rental.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.training.rental.RentalAgency <em>Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.training.rental.RentalAgency
	 * @generated
	 */
	public Adapter createRentalAgencyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.training.rental.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.training.rental.Address
	 * @generated
	 */
	public Adapter createAddressAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.training.rental.RentalObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.training.rental.RentalObject
	 * @generated
	 */
	public Adapter createRentalObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.training.rental.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.training.rental.License
	 * @generated
	 */
	public Adapter createLicenseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.training.rental.Rental <em>Rental</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.training.rental.Rental
	 * @generated
	 */
	public Adapter createRentalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //RentalAdapterFactory

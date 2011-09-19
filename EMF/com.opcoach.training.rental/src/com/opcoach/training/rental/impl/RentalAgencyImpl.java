/**
 * OPCoach @ 2009 $Id$
 */
package com.opcoach.training.rental.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.opcoach.training.rental.Address;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalFactory;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.RentalPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Agency</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.impl.RentalAgencyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalAgencyImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalAgencyImpl#getObjectsToRent <em>Objects To Rent</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalAgencyImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalAgencyImpl#getRentals <em>Rentals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RentalAgencyImpl extends EObjectImpl implements RentalAgency
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "OPCoach @ 2011";

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * The cached value of the '{@link #getObjectsToRent() <em>Objects To Rent</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getObjectsToRent()
	 * @generated
	 * @ordered
	 */
	protected EList<RentalObject> objectsToRent;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * The cached value of the '{@link #getRentals() <em>Rentals</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRentals()
	 * @generated
	 * @ordered
	 */
	protected EList<Rental> rentals;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalAgencyImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return RentalPackage.Literals.RENTAL_AGENCY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_AGENCY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress()
	{
		return address;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs)
	{
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_AGENCY__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Address newAddress)
	{
		if (newAddress != address)
		{
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RentalPackage.RENTAL_AGENCY__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RentalPackage.RENTAL_AGENCY__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_AGENCY__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RentalObject> getObjectsToRent()
	{
		if (objectsToRent == null)
		{
			objectsToRent = new EObjectContainmentWithInverseEList<RentalObject>(RentalObject.class, this, RentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT, RentalPackage.RENTAL_OBJECT__PARENT_AGENCY);
		}
		return objectsToRent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers()
	{
		if (customers == null)
		{
			customers = new EObjectContainmentWithInverseEList<Customer>(Customer.class, this, RentalPackage.RENTAL_AGENCY__CUSTOMERS, RentalPackage.CUSTOMER__PARENT_AGENCY);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rental> getRentals()
	{
		if (rentals == null)
		{
			rentals = new EObjectContainmentWithInverseEList<Rental>(Rental.class, this, RentalPackage.RENTAL_AGENCY__RENTALS, RentalPackage.RENTAL__PARENT_AGENCY);
		}
		return rentals;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Rental book(Customer customer, RentalObject rentedObject, Date from, Date to)
	{
		Rental r = RentalFactory.eINSTANCE.createRental();
		r.setStartDate(from);
		r.setEndDate(to);
		r.setCustomer(customer);
		r.setRentedObject(rentedObject);
		getRentals().add(r);
		return r;
	}
	
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void addCustomer(Customer customer)

	{
		getCustomers().add(customer);
		customer.setParentAgency(this);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.ADD, RentalPackage.RENTAL_AGENCY__CUSTOMERS, null, customer));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void addObject(RentalObject object)
	{
		getObjectsToRent().add(object);
		object.setParentAgency(this);
	}

	
	public void addRental(Rental r)
	{
		r.setParentAgency(this);
		getRentals().add(r);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeCustomer(Customer customer)
	{
		customer.setParentAgency(null);
		getCustomers().remove(customer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeObject(RentalObject object)
	{
		object.setParentAgency(null);
		getObjectsToRent().remove(object);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isAvailable(RentalObject rentedObject, Date startDate, Date endDate)
	{
		if (rentedObject == null)
			return false;
		
		if (endDate.before(startDate))
			throw new IllegalArgumentException("isAvailable : endDate before startDate");
		
		boolean result = true;
		for (Rental r : getRentals())
		{
		   if (rentedObject.equals(r.getRentedObject()))
		   {
			   Date sd = r.getStartDate();
			   Date ed = r.getEndDate();
			   if  (! (isOutside(startDate,sd,ed)) && (isOutside(endDate,sd,ed)) )
				   return false;
			   
		   }
		}
		return result;
	}
	
	/** Check if a date is outside bounds
	 * @return true if the date is outside the [start,end] bounds
	 * @generated NOT
	 */
	private static boolean isOutside(Date d, Date start, Date end)
	{
		return d.before(start) && d.after(end);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectsToRent()).basicAdd(otherEnd, msgs);
			case RentalPackage.RENTAL_AGENCY__CUSTOMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomers()).basicAdd(otherEnd, msgs);
			case RentalPackage.RENTAL_AGENCY__RENTALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRentals()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_AGENCY__ADDRESS:
				return basicSetAddress(null, msgs);
			case RentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
				return ((InternalEList<?>)getObjectsToRent()).basicRemove(otherEnd, msgs);
			case RentalPackage.RENTAL_AGENCY__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case RentalPackage.RENTAL_AGENCY__RENTALS:
				return ((InternalEList<?>)getRentals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_AGENCY__NAME:
				return getName();
			case RentalPackage.RENTAL_AGENCY__ADDRESS:
				return getAddress();
			case RentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
				return getObjectsToRent();
			case RentalPackage.RENTAL_AGENCY__CUSTOMERS:
				return getCustomers();
			case RentalPackage.RENTAL_AGENCY__RENTALS:
				return getRentals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_AGENCY__NAME:
				setName((String)newValue);
				return;
			case RentalPackage.RENTAL_AGENCY__ADDRESS:
				setAddress((Address)newValue);
				return;
			case RentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
				getObjectsToRent().clear();
				getObjectsToRent().addAll((Collection<? extends RentalObject>)newValue);
				return;
			case RentalPackage.RENTAL_AGENCY__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
			case RentalPackage.RENTAL_AGENCY__RENTALS:
				getRentals().clear();
				getRentals().addAll((Collection<? extends Rental>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_AGENCY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RentalPackage.RENTAL_AGENCY__ADDRESS:
				setAddress((Address)null);
				return;
			case RentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
				getObjectsToRent().clear();
				return;
			case RentalPackage.RENTAL_AGENCY__CUSTOMERS:
				getCustomers().clear();
				return;
			case RentalPackage.RENTAL_AGENCY__RENTALS:
				getRentals().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_AGENCY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RentalPackage.RENTAL_AGENCY__ADDRESS:
				return address != null;
			case RentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
				return objectsToRent != null && !objectsToRent.isEmpty();
			case RentalPackage.RENTAL_AGENCY__CUSTOMERS:
				return customers != null && !customers.isEmpty();
			case RentalPackage.RENTAL_AGENCY__RENTALS:
				return rentals != null && !rentals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RentalAgencyImpl

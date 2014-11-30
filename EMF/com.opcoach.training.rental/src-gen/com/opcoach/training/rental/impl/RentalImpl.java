/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.RentalPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Rental</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.impl.RentalImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalImpl#getRentedObject <em>Rented Object</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalImpl#getParentAgency <em>Parent Agency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RentalImpl extends EObjectImpl implements Rental
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "OPCoach @ 2012";

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getRentedObject() <em>Rented Object</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRentedObject()
	 * @generated
	 * @ordered
	 */
	protected RentalObject rentedObject;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalImpl()
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
		return RentalPackage.Literals.RENTAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer()
	{
		if (customer != null && customer.eIsProxy())
		{
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalPackage.RENTAL__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer()
	{
		return customer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer)
	{
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RentalObject getRentedObject()
	{
		if (rentedObject != null && rentedObject.eIsProxy())
		{
			InternalEObject oldRentedObject = (InternalEObject)rentedObject;
			rentedObject = (RentalObject)eResolveProxy(oldRentedObject);
			if (rentedObject != oldRentedObject)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalPackage.RENTAL__RENTED_OBJECT, oldRentedObject, rentedObject));
			}
		}
		return rentedObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RentalObject basicGetRentedObject()
	{
		return rentedObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRentedObject(RentalObject newRentedObject)
	{
		RentalObject oldRentedObject = rentedObject;
		rentedObject = newRentedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL__RENTED_OBJECT, oldRentedObject, rentedObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate()
	{
		return startDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate)
	{
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate()
	{
		return endDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate)
	{
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RentalAgency getParentAgency()
	{
		if (eContainerFeatureID() != RentalPackage.RENTAL__PARENT_AGENCY) return null;
		return (RentalAgency)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAgency(RentalAgency newParentAgency, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newParentAgency, RentalPackage.RENTAL__PARENT_AGENCY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAgency(RentalAgency newParentAgency)
	{
		if (newParentAgency != eInternalContainer() || (eContainerFeatureID() != RentalPackage.RENTAL__PARENT_AGENCY && newParentAgency != null))
		{
			if (EcoreUtil.isAncestor(this, newParentAgency))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentAgency != null)
				msgs = ((InternalEObject)newParentAgency).eInverseAdd(this, RentalPackage.RENTAL_AGENCY__RENTALS, RentalAgency.class, msgs);
			msgs = basicSetParentAgency(newParentAgency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL__PARENT_AGENCY, newParentAgency, newParentAgency));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int nbDaysBooked()
	{
		final long NBMSINDAY = 24 * 3600000L;
		long duration = getEndDate().getTime() - getStartDate().getTime();
		int nbDays = (int) (duration / NBMSINDAY);
		return nbDays;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL__PARENT_AGENCY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentAgency((RentalAgency)otherEnd, msgs);
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
			case RentalPackage.RENTAL__PARENT_AGENCY:
				return basicSetParentAgency(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RentalPackage.RENTAL__PARENT_AGENCY:
				return eInternalContainer().eInverseRemove(this, RentalPackage.RENTAL_AGENCY__RENTALS, RentalAgency.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RentalPackage.RENTAL__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case RentalPackage.RENTAL__RENTED_OBJECT:
				if (resolve) return getRentedObject();
				return basicGetRentedObject();
			case RentalPackage.RENTAL__START_DATE:
				return getStartDate();
			case RentalPackage.RENTAL__END_DATE:
				return getEndDate();
			case RentalPackage.RENTAL__PARENT_AGENCY:
				return getParentAgency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case RentalPackage.RENTAL__RENTED_OBJECT:
				setRentedObject((RentalObject)newValue);
				return;
			case RentalPackage.RENTAL__START_DATE:
				setStartDate((Date)newValue);
				return;
			case RentalPackage.RENTAL__END_DATE:
				setEndDate((Date)newValue);
				return;
			case RentalPackage.RENTAL__PARENT_AGENCY:
				setParentAgency((RentalAgency)newValue);
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
			case RentalPackage.RENTAL__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case RentalPackage.RENTAL__RENTED_OBJECT:
				setRentedObject((RentalObject)null);
				return;
			case RentalPackage.RENTAL__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case RentalPackage.RENTAL__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case RentalPackage.RENTAL__PARENT_AGENCY:
				setParentAgency((RentalAgency)null);
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
			case RentalPackage.RENTAL__CUSTOMER:
				return customer != null;
			case RentalPackage.RENTAL__RENTED_OBJECT:
				return rentedObject != null;
			case RentalPackage.RENTAL__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case RentalPackage.RENTAL__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case RentalPackage.RENTAL__PARENT_AGENCY:
				return getParentAgency() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString()
	{
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		RentalObject o = getRentedObject();
		StringBuffer buf = new StringBuffer((o == null) ? "?" : o.getName());
		Customer c = getCustomer();
		buf.append(" rented by ").append((c == null) ? "?" : c.getName());
		buf.append(" from ").append((getStartDate() == null) ? " ?" : df.format(getStartDate())).append(" to ");
		buf.append((getEndDate() == null) ? " ? " : df.format(getEndDate()));
		return buf.toString();
	}

} // RentalImpl

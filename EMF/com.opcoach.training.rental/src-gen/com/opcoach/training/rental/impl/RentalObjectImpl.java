/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental.impl;

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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.impl.RentalObjectImpl#getID <em>ID</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalObjectImpl#getParentAgency <em>Parent Agency</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.RentalObjectImpl#isAvailable <em>Available</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RentalObjectImpl extends EObjectImpl implements RentalObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "OPCoach @ 2012";

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected boolean available = AVAILABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalObjectImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return RentalPackage.Literals.RENTAL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getID()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(long newID)
	{
		long oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_OBJECT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalAgency getParentAgency()
	{
		if (eContainerFeatureID() != RentalPackage.RENTAL_OBJECT__PARENT_AGENCY) return null;
		return (RentalAgency)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAgency(RentalAgency newParentAgency, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newParentAgency, RentalPackage.RENTAL_OBJECT__PARENT_AGENCY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAgency(RentalAgency newParentAgency)
	{
		if (newParentAgency != eInternalContainer() || (eContainerFeatureID() != RentalPackage.RENTAL_OBJECT__PARENT_AGENCY && newParentAgency != null))
		{
			if (EcoreUtil.isAncestor(this, newParentAgency))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentAgency != null)
				msgs = ((InternalEObject)newParentAgency).eInverseAdd(this, RentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT, RentalAgency.class, msgs);
			msgs = basicSetParentAgency(newParentAgency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_OBJECT__PARENT_AGENCY, newParentAgency, newParentAgency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvailable()
	{
		return available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailable(boolean newAvailable)
	{
		boolean oldAvailable = available;
		available = newAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_OBJECT__AVAILABLE, oldAvailable, available));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rental rent(Customer customer)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentAgency((RentalAgency)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
				return basicSetParentAgency(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
				return eInternalContainer().eInverseRemove(this, RentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT, RentalAgency.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_OBJECT__ID:
				return getID();
			case RentalPackage.RENTAL_OBJECT__NAME:
				return getName();
			case RentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
				return getParentAgency();
			case RentalPackage.RENTAL_OBJECT__AVAILABLE:
				return isAvailable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_OBJECT__ID:
				setID((Long)newValue);
				return;
			case RentalPackage.RENTAL_OBJECT__NAME:
				setName((String)newValue);
				return;
			case RentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
				setParentAgency((RentalAgency)newValue);
				return;
			case RentalPackage.RENTAL_OBJECT__AVAILABLE:
				setAvailable((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_OBJECT__ID:
				setID(ID_EDEFAULT);
				return;
			case RentalPackage.RENTAL_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
				setParentAgency((RentalAgency)null);
				return;
			case RentalPackage.RENTAL_OBJECT__AVAILABLE:
				setAvailable(AVAILABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case RentalPackage.RENTAL_OBJECT__ID:
				return id != ID_EDEFAULT;
			case RentalPackage.RENTAL_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
				return getParentAgency() != null;
			case RentalPackage.RENTAL_OBJECT__AVAILABLE:
				return available != AVAILABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", available: ");
		result.append(available);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */ 
	@Override
	public boolean equals(Object obj)
	{
		if (obj == null)
			return false;
		
		return (obj instanceof RentalObject) ? getID() == ((RentalObject) obj).getID() : false;
		
	}
	
	

} //RentalObjectImpl

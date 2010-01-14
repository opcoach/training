/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental.impl;

import com.opcoach.training.carrental.Bike;
import com.opcoach.training.carrental.CarrentalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bike</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.training.carrental.impl.BikeImpl#getFrontTireSize <em>Front Tire Size</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.impl.BikeImpl#getBackTireSize <em>Back Tire Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BikeImpl extends VehicleImpl implements Bike
{
	/**
	 * The default value of the '{@link #getFrontTireSize() <em>Front Tire Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontTireSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FRONT_TIRE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrontTireSize() <em>Front Tire Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontTireSize()
	 * @generated
	 * @ordered
	 */
	protected int frontTireSize = FRONT_TIRE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackTireSize() <em>Back Tire Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackTireSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BACK_TIRE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBackTireSize() <em>Back Tire Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackTireSize()
	 * @generated
	 * @ordered
	 */
	protected int backTireSize = BACK_TIRE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BikeImpl()
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
		return CarrentalPackage.Literals.BIKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrontTireSize()
	{
		return frontTireSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontTireSize(int newFrontTireSize)
	{
		int oldFrontTireSize = frontTireSize;
		frontTireSize = newFrontTireSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarrentalPackage.BIKE__FRONT_TIRE_SIZE, oldFrontTireSize, frontTireSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBackTireSize()
	{
		return backTireSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackTireSize(int newBackTireSize)
	{
		int oldBackTireSize = backTireSize;
		backTireSize = newBackTireSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarrentalPackage.BIKE__BACK_TIRE_SIZE, oldBackTireSize, backTireSize));
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
			case CarrentalPackage.BIKE__FRONT_TIRE_SIZE:
				return getFrontTireSize();
			case CarrentalPackage.BIKE__BACK_TIRE_SIZE:
				return getBackTireSize();
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
			case CarrentalPackage.BIKE__FRONT_TIRE_SIZE:
				setFrontTireSize((Integer)newValue);
				return;
			case CarrentalPackage.BIKE__BACK_TIRE_SIZE:
				setBackTireSize((Integer)newValue);
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
			case CarrentalPackage.BIKE__FRONT_TIRE_SIZE:
				setFrontTireSize(FRONT_TIRE_SIZE_EDEFAULT);
				return;
			case CarrentalPackage.BIKE__BACK_TIRE_SIZE:
				setBackTireSize(BACK_TIRE_SIZE_EDEFAULT);
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
			case CarrentalPackage.BIKE__FRONT_TIRE_SIZE:
				return frontTireSize != FRONT_TIRE_SIZE_EDEFAULT;
			case CarrentalPackage.BIKE__BACK_TIRE_SIZE:
				return backTireSize != BACK_TIRE_SIZE_EDEFAULT;
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
		result.append(" (frontTireSize: ");
		result.append(frontTireSize);
		result.append(", backTireSize: ");
		result.append(backTireSize);
		result.append(')');
		return result.toString();
	}

} //BikeImpl

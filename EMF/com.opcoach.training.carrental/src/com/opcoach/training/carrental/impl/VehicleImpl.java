/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental.impl;

import com.opcoach.training.carrental.CarrentalPackage;
import com.opcoach.training.carrental.Vehicle;

import com.opcoach.training.rental.impl.RentalObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.training.carrental.impl.VehicleImpl#getPlateNumber <em>Plate Number</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.impl.VehicleImpl#getHorsePower <em>Horse Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleImpl extends RentalObjectImpl implements Vehicle
{
	/**
	 * The default value of the '{@link #getPlateNumber() <em>Plate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlateNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlateNumber() <em>Plate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlateNumber()
	 * @generated
	 * @ordered
	 */
	protected String plateNumber = PLATE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorsePower() <em>Horse Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorsePower()
	 * @generated
	 * @ordered
	 */
	protected static final float HORSE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHorsePower() <em>Horse Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorsePower()
	 * @generated
	 * @ordered
	 */
	protected float horsePower = HORSE_POWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpl()
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
		return CarrentalPackage.Literals.VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlateNumber()
	{
		return plateNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlateNumber(String newPlateNumber)
	{
		String oldPlateNumber = plateNumber;
		plateNumber = newPlateNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarrentalPackage.VEHICLE__PLATE_NUMBER, oldPlateNumber, plateNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHorsePower()
	{
		return horsePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorsePower(float newHorsePower)
	{
		float oldHorsePower = horsePower;
		horsePower = newHorsePower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarrentalPackage.VEHICLE__HORSE_POWER, oldHorsePower, horsePower));
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
			case CarrentalPackage.VEHICLE__PLATE_NUMBER:
				return getPlateNumber();
			case CarrentalPackage.VEHICLE__HORSE_POWER:
				return getHorsePower();
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
			case CarrentalPackage.VEHICLE__PLATE_NUMBER:
				setPlateNumber((String)newValue);
				return;
			case CarrentalPackage.VEHICLE__HORSE_POWER:
				setHorsePower((Float)newValue);
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
			case CarrentalPackage.VEHICLE__PLATE_NUMBER:
				setPlateNumber(PLATE_NUMBER_EDEFAULT);
				return;
			case CarrentalPackage.VEHICLE__HORSE_POWER:
				setHorsePower(HORSE_POWER_EDEFAULT);
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
			case CarrentalPackage.VEHICLE__PLATE_NUMBER:
				return PLATE_NUMBER_EDEFAULT == null ? plateNumber != null : !PLATE_NUMBER_EDEFAULT.equals(plateNumber);
			case CarrentalPackage.VEHICLE__HORSE_POWER:
				return horsePower != HORSE_POWER_EDEFAULT;
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
		result.append(" (plateNumber: ");
		result.append(plateNumber);
		result.append(", horsePower: ");
		result.append(horsePower);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl

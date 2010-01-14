/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental.impl;

import com.opcoach.training.carrental.Car;
import com.opcoach.training.carrental.CarBrand;
import com.opcoach.training.carrental.CarrentalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.training.carrental.impl.CarImpl#getRegistration <em>Registration</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.impl.CarImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.impl.CarImpl#isAirConditionning <em>Air Conditionning</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.impl.CarImpl#isRadioCD <em>Radio CD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarImpl extends VehicleImpl implements Car
{
	/**
	 * The default value of the '{@link #getRegistration() <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistration() <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistration()
	 * @generated
	 * @ordered
	 */
	protected String registration = REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected static final CarBrand BRAND_EDEFAULT = CarBrand.AUDI;

	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected CarBrand brand = BRAND_EDEFAULT;

	/**
	 * The default value of the '{@link #isAirConditionning() <em>Air Conditionning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAirConditionning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AIR_CONDITIONNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAirConditionning() <em>Air Conditionning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAirConditionning()
	 * @generated
	 * @ordered
	 */
	protected boolean airConditionning = AIR_CONDITIONNING_EDEFAULT;

	/**
	 * The default value of the '{@link #isRadioCD() <em>Radio CD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRadioCD()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RADIO_CD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRadioCD() <em>Radio CD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRadioCD()
	 * @generated
	 * @ordered
	 */
	protected boolean radioCD = RADIO_CD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarImpl()
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
		return CarrentalPackage.Literals.CAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistration()
	{
		return registration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistration(String newRegistration)
	{
		String oldRegistration = registration;
		registration = newRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarrentalPackage.CAR__REGISTRATION, oldRegistration, registration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarBrand getBrand()
	{
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(CarBrand newBrand)
	{
		CarBrand oldBrand = brand;
		brand = newBrand == null ? BRAND_EDEFAULT : newBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarrentalPackage.CAR__BRAND, oldBrand, brand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAirConditionning()
	{
		return airConditionning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAirConditionning(boolean newAirConditionning)
	{
		boolean oldAirConditionning = airConditionning;
		airConditionning = newAirConditionning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarrentalPackage.CAR__AIR_CONDITIONNING, oldAirConditionning, airConditionning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRadioCD()
	{
		return radioCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadioCD(boolean newRadioCD)
	{
		boolean oldRadioCD = radioCD;
		radioCD = newRadioCD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarrentalPackage.CAR__RADIO_CD, oldRadioCD, radioCD));
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
			case CarrentalPackage.CAR__REGISTRATION:
				return getRegistration();
			case CarrentalPackage.CAR__BRAND:
				return getBrand();
			case CarrentalPackage.CAR__AIR_CONDITIONNING:
				return isAirConditionning();
			case CarrentalPackage.CAR__RADIO_CD:
				return isRadioCD();
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
			case CarrentalPackage.CAR__REGISTRATION:
				setRegistration((String)newValue);
				return;
			case CarrentalPackage.CAR__BRAND:
				setBrand((CarBrand)newValue);
				return;
			case CarrentalPackage.CAR__AIR_CONDITIONNING:
				setAirConditionning((Boolean)newValue);
				return;
			case CarrentalPackage.CAR__RADIO_CD:
				setRadioCD((Boolean)newValue);
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
			case CarrentalPackage.CAR__REGISTRATION:
				setRegistration(REGISTRATION_EDEFAULT);
				return;
			case CarrentalPackage.CAR__BRAND:
				setBrand(BRAND_EDEFAULT);
				return;
			case CarrentalPackage.CAR__AIR_CONDITIONNING:
				setAirConditionning(AIR_CONDITIONNING_EDEFAULT);
				return;
			case CarrentalPackage.CAR__RADIO_CD:
				setRadioCD(RADIO_CD_EDEFAULT);
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
			case CarrentalPackage.CAR__REGISTRATION:
				return REGISTRATION_EDEFAULT == null ? registration != null : !REGISTRATION_EDEFAULT.equals(registration);
			case CarrentalPackage.CAR__BRAND:
				return brand != BRAND_EDEFAULT;
			case CarrentalPackage.CAR__AIR_CONDITIONNING:
				return airConditionning != AIR_CONDITIONNING_EDEFAULT;
			case CarrentalPackage.CAR__RADIO_CD:
				return radioCD != RADIO_CD_EDEFAULT;
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
		result.append(" (registration: ");
		result.append(registration);
		result.append(", brand: ");
		result.append(brand);
		result.append(", airConditionning: ");
		result.append(airConditionning);
		result.append(", radioCD: ");
		result.append(radioCD);
		result.append(')');
		return result.toString();
	}

} //CarImpl

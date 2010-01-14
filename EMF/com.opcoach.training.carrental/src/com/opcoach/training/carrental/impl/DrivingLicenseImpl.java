/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental.impl;

import com.opcoach.training.carrental.CarrentalPackage;
import com.opcoach.training.carrental.DrivingLicense;

import com.opcoach.training.rental.impl.LicenseImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driving License</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.training.carrental.impl.DrivingLicenseImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link com.opcoach.training.carrental.impl.DrivingLicenseImpl#getDeliveryLocation <em>Delivery Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrivingLicenseImpl extends LicenseImpl implements DrivingLicense
{
	/**
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryLocation() <em>Delivery Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryLocation() <em>Delivery Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryLocation()
	 * @generated
	 * @ordered
	 */
	protected String deliveryLocation = DELIVERY_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrivingLicenseImpl()
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
		return CarrentalPackage.Literals.DRIVING_LICENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeliveryDate()
	{
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(Date newDeliveryDate)
	{
		Date oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarrentalPackage.DRIVING_LICENSE__DELIVERY_DATE, oldDeliveryDate, deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeliveryLocation()
	{
		return deliveryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryLocation(String newDeliveryLocation)
	{
		String oldDeliveryLocation = deliveryLocation;
		deliveryLocation = newDeliveryLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarrentalPackage.DRIVING_LICENSE__DELIVERY_LOCATION, oldDeliveryLocation, deliveryLocation));
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
			case CarrentalPackage.DRIVING_LICENSE__DELIVERY_DATE:
				return getDeliveryDate();
			case CarrentalPackage.DRIVING_LICENSE__DELIVERY_LOCATION:
				return getDeliveryLocation();
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
			case CarrentalPackage.DRIVING_LICENSE__DELIVERY_DATE:
				setDeliveryDate((Date)newValue);
				return;
			case CarrentalPackage.DRIVING_LICENSE__DELIVERY_LOCATION:
				setDeliveryLocation((String)newValue);
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
			case CarrentalPackage.DRIVING_LICENSE__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
			case CarrentalPackage.DRIVING_LICENSE__DELIVERY_LOCATION:
				setDeliveryLocation(DELIVERY_LOCATION_EDEFAULT);
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
			case CarrentalPackage.DRIVING_LICENSE__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
			case CarrentalPackage.DRIVING_LICENSE__DELIVERY_LOCATION:
				return DELIVERY_LOCATION_EDEFAULT == null ? deliveryLocation != null : !DELIVERY_LOCATION_EDEFAULT.equals(deliveryLocation);
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
		result.append(" (deliveryDate: ");
		result.append(deliveryDate);
		result.append(", deliveryLocation: ");
		result.append(deliveryLocation);
		result.append(')');
		return result.toString();
	}

} //DrivingLicenseImpl

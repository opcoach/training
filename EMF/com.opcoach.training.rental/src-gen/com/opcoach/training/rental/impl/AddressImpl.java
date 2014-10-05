/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.opcoach.training.rental.Address;
import com.opcoach.training.rental.RentalPackage;
import com.opcoach.training.rental.StreetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.impl.AddressImpl#getStreetType <em>Street Type</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.AddressImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.AddressImpl#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.AddressImpl#getStreetName <em>Street Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressImpl extends EObjectImpl implements Address
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "OPCoach @ 2012";

	/**
	 * The default value of the '{@link #getStreetType() <em>Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetType()
	 * @generated
	 * @ordered
	 */
	protected static final StreetType STREET_TYPE_EDEFAULT = StreetType.STREET;

	/**
	 * The cached value of the '{@link #getStreetType() <em>Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetType()
	 * @generated
	 * @ordered
	 */
	protected StreetType streetType = STREET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected String zipCode = ZIP_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreetName() <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetName()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreetName() <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetName()
	 * @generated
	 * @ordered
	 */
	protected String streetName = STREET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl()
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
		return RentalPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetType getStreetType()
	{
		return streetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetType(StreetType newStreetType)
	{
		StreetType oldStreetType = streetType;
		streetType = newStreetType == null ? STREET_TYPE_EDEFAULT : newStreetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.ADDRESS__STREET_TYPE, oldStreetType, streetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber)
	{
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.ADDRESS__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZipCode()
	{
		return zipCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZipCode(String newZipCode)
	{
		String oldZipCode = zipCode;
		zipCode = newZipCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.ADDRESS__ZIP_CODE, oldZipCode, zipCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity)
	{
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreetName()
	{
		return streetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetName(String newStreetName)
	{
		String oldStreetName = streetName;
		streetName = newStreetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.ADDRESS__STREET_NAME, oldStreetName, streetName));
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
			case RentalPackage.ADDRESS__STREET_TYPE:
				return getStreetType();
			case RentalPackage.ADDRESS__NUMBER:
				return getNumber();
			case RentalPackage.ADDRESS__ZIP_CODE:
				return getZipCode();
			case RentalPackage.ADDRESS__CITY:
				return getCity();
			case RentalPackage.ADDRESS__STREET_NAME:
				return getStreetName();
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
			case RentalPackage.ADDRESS__STREET_TYPE:
				setStreetType((StreetType)newValue);
				return;
			case RentalPackage.ADDRESS__NUMBER:
				setNumber((Integer)newValue);
				return;
			case RentalPackage.ADDRESS__ZIP_CODE:
				setZipCode((String)newValue);
				return;
			case RentalPackage.ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case RentalPackage.ADDRESS__STREET_NAME:
				setStreetName((String)newValue);
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
			case RentalPackage.ADDRESS__STREET_TYPE:
				setStreetType(STREET_TYPE_EDEFAULT);
				return;
			case RentalPackage.ADDRESS__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case RentalPackage.ADDRESS__ZIP_CODE:
				setZipCode(ZIP_CODE_EDEFAULT);
				return;
			case RentalPackage.ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case RentalPackage.ADDRESS__STREET_NAME:
				setStreetName(STREET_NAME_EDEFAULT);
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
			case RentalPackage.ADDRESS__STREET_TYPE:
				return streetType != STREET_TYPE_EDEFAULT;
			case RentalPackage.ADDRESS__NUMBER:
				return number != NUMBER_EDEFAULT;
			case RentalPackage.ADDRESS__ZIP_CODE:
				return ZIP_CODE_EDEFAULT == null ? zipCode != null : !ZIP_CODE_EDEFAULT.equals(zipCode);
			case RentalPackage.ADDRESS__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case RentalPackage.ADDRESS__STREET_NAME:
				return STREET_NAME_EDEFAULT == null ? streetName != null : !STREET_NAME_EDEFAULT.equals(streetName);
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
		result.append(" (streetType: ");
		result.append(streetType);
		result.append(", number: ");
		result.append(number);
		result.append(", zipCode: ");
		result.append(zipCode);
		result.append(", city: ");
		result.append(city);
		result.append(", streetName: ");
		result.append(streetName);
		result.append(')');
		return result.toString();
	}

} //AddressImpl

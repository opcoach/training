/**
 * OPCoach @ 2012
 */
package com.opcoach.training.rental.impl;

import com.opcoach.training.rental.Device;
import com.opcoach.training.rental.RentalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.training.rental.impl.DeviceImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.DeviceImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.DeviceImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link com.opcoach.training.rental.impl.DeviceImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends RentalObjectImpl implements Device
{
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final String copyright = "OPCoach @ 2012";

	/**
   * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSerialNumber()
   * @generated
   * @ordered
   */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSerialNumber()
   * @generated
   * @ordered
   */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
	protected int width = WIDTH_EDEFAULT;

	/**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
	protected int height = HEIGHT_EDEFAULT;

	/**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
	protected int length = LENGTH_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DeviceImpl()
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
    return RentalPackage.Literals.DEVICE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSerialNumber()
	{
    return serialNumber;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSerialNumber(String newSerialNumber)
	{
    String oldSerialNumber = serialNumber;
    serialNumber = newSerialNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.DEVICE__SERIAL_NUMBER, oldSerialNumber, serialNumber));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getWidth()
	{
    return width;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setWidth(int newWidth)
	{
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.DEVICE__WIDTH, oldWidth, width));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getHeight()
	{
    return height;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHeight(int newHeight)
	{
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.DEVICE__HEIGHT, oldHeight, height));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getLength()
	{
    return length;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLength(int newLength)
	{
    int oldLength = length;
    length = newLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.DEVICE__LENGTH, oldLength, length));
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
      case RentalPackage.DEVICE__SERIAL_NUMBER:
        return getSerialNumber();
      case RentalPackage.DEVICE__WIDTH:
        return getWidth();
      case RentalPackage.DEVICE__HEIGHT:
        return getHeight();
      case RentalPackage.DEVICE__LENGTH:
        return getLength();
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
      case RentalPackage.DEVICE__SERIAL_NUMBER:
        setSerialNumber((String)newValue);
        return;
      case RentalPackage.DEVICE__WIDTH:
        setWidth((Integer)newValue);
        return;
      case RentalPackage.DEVICE__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case RentalPackage.DEVICE__LENGTH:
        setLength((Integer)newValue);
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
      case RentalPackage.DEVICE__SERIAL_NUMBER:
        setSerialNumber(SERIAL_NUMBER_EDEFAULT);
        return;
      case RentalPackage.DEVICE__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case RentalPackage.DEVICE__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case RentalPackage.DEVICE__LENGTH:
        setLength(LENGTH_EDEFAULT);
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
      case RentalPackage.DEVICE__SERIAL_NUMBER:
        return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
      case RentalPackage.DEVICE__WIDTH:
        return width != WIDTH_EDEFAULT;
      case RentalPackage.DEVICE__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case RentalPackage.DEVICE__LENGTH:
        return length != LENGTH_EDEFAULT;
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
    result.append(" (serialNumber: ");
    result.append(serialNumber);
    result.append(", width: ");
    result.append(width);
    result.append(", height: ");
    result.append(height);
    result.append(", length: ");
    result.append(length);
    result.append(')');
    return result.toString();
  }

} //DeviceImpl

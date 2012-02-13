/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.diagram.impl;

import com.opcoach.training.diagram.DiagramElement;
import com.opcoach.training.diagram.DiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.training.diagram.impl.DiagramElementImpl#getX <em>X</em>}</li>
 *   <li>{@link com.opcoach.training.diagram.impl.DiagramElementImpl#getY <em>Y</em>}</li>
 *   <li>{@link com.opcoach.training.diagram.impl.DiagramElementImpl#getW <em>W</em>}</li>
 *   <li>{@link com.opcoach.training.diagram.impl.DiagramElementImpl#getH <em>H</em>}</li>
 *   <li>{@link com.opcoach.training.diagram.impl.DiagramElementImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramElementImpl extends EObjectImpl implements DiagramElement
{
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected static final int W_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected int w = W_EDEFAULT;

	/**
	 * The default value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected static final int H_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected int h = H_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EObject model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl()
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
		return DiagramPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX()
	{
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX)
	{
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY()
	{
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY)
	{
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getW()
	{
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW(int newW)
	{
		int oldW = w;
		w = newW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__W, oldW, w));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getH()
	{
		return h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH(int newH)
	{
		int oldH = h;
		h = newH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__H, oldH, h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getModel()
	{
		if (model != null && model.eIsProxy())
		{
			InternalEObject oldModel = (InternalEObject)model;
			model = eResolveProxy(oldModel);
			if (model != oldModel)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramPackage.DIAGRAM_ELEMENT__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetModel()
	{
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(EObject newModel)
	{
		EObject oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__MODEL, oldModel, model));
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
			case DiagramPackage.DIAGRAM_ELEMENT__X:
				return getX();
			case DiagramPackage.DIAGRAM_ELEMENT__Y:
				return getY();
			case DiagramPackage.DIAGRAM_ELEMENT__W:
				return getW();
			case DiagramPackage.DIAGRAM_ELEMENT__H:
				return getH();
			case DiagramPackage.DIAGRAM_ELEMENT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case DiagramPackage.DIAGRAM_ELEMENT__X:
				setX((Integer)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__Y:
				setY((Integer)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__W:
				setW((Integer)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__H:
				setH((Integer)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__MODEL:
				setModel((EObject)newValue);
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
			case DiagramPackage.DIAGRAM_ELEMENT__X:
				setX(X_EDEFAULT);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__Y:
				setY(Y_EDEFAULT);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__W:
				setW(W_EDEFAULT);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__H:
				setH(H_EDEFAULT);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__MODEL:
				setModel((EObject)null);
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
			case DiagramPackage.DIAGRAM_ELEMENT__X:
				return x != X_EDEFAULT;
			case DiagramPackage.DIAGRAM_ELEMENT__Y:
				return y != Y_EDEFAULT;
			case DiagramPackage.DIAGRAM_ELEMENT__W:
				return w != W_EDEFAULT;
			case DiagramPackage.DIAGRAM_ELEMENT__H:
				return h != H_EDEFAULT;
			case DiagramPackage.DIAGRAM_ELEMENT__MODEL:
				return model != null;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", w: ");
		result.append(w);
		result.append(", h: ");
		result.append(h);
		result.append(')');
		return result.toString();
	}

} //DiagramElementImpl

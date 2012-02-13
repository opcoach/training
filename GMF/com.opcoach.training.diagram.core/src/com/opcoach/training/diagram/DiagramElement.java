/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.diagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.diagram.DiagramElement#getX <em>X</em>}</li>
 *   <li>{@link com.opcoach.training.diagram.DiagramElement#getY <em>Y</em>}</li>
 *   <li>{@link com.opcoach.training.diagram.DiagramElement#getW <em>W</em>}</li>
 *   <li>{@link com.opcoach.training.diagram.DiagramElement#getH <em>H</em>}</li>
 *   <li>{@link com.opcoach.training.diagram.DiagramElement#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.diagram.DiagramPackage#getDiagramElement()
 * @model
 * @generated
 */
public interface DiagramElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see com.opcoach.training.diagram.DiagramPackage#getDiagramElement_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link com.opcoach.training.diagram.DiagramElement#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see com.opcoach.training.diagram.DiagramPackage#getDiagramElement_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link com.opcoach.training.diagram.DiagramElement#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' attribute.
	 * @see #setW(int)
	 * @see com.opcoach.training.diagram.DiagramPackage#getDiagramElement_W()
	 * @model
	 * @generated
	 */
	int getW();

	/**
	 * Sets the value of the '{@link com.opcoach.training.diagram.DiagramElement#getW <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' attribute.
	 * @see #getW()
	 * @generated
	 */
	void setW(int value);

	/**
	 * Returns the value of the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' attribute.
	 * @see #setH(int)
	 * @see com.opcoach.training.diagram.DiagramPackage#getDiagramElement_H()
	 * @model
	 * @generated
	 */
	int getH();

	/**
	 * Sets the value of the '{@link com.opcoach.training.diagram.DiagramElement#getH <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H</em>' attribute.
	 * @see #getH()
	 * @generated
	 */
	void setH(int value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(EObject)
	 * @see com.opcoach.training.diagram.DiagramPackage#getDiagramElement_Model()
	 * @model required="true"
	 * @generated
	 */
	EObject getModel();

	/**
	 * Sets the value of the '{@link com.opcoach.training.diagram.DiagramElement#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EObject value);

} // DiagramElement

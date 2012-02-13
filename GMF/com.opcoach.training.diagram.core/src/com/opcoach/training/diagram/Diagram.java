/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.training.diagram.Diagram#getElements <em>Elements</em>}</li>
 *   <li>{@link com.opcoach.training.diagram.Diagram#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.training.diagram.DiagramPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject
{
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.training.diagram.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.opcoach.training.diagram.DiagramPackage#getDiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiagramElement> getElements();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(EObject)
	 * @see com.opcoach.training.diagram.DiagramPackage#getDiagram_Content()
	 * @model required="true"
	 * @generated
	 */
	EObject getContent();

	/**
	 * Sets the value of the '{@link com.opcoach.training.diagram.Diagram#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(EObject value);

} // Diagram

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.diagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.opcoach.training.diagram.DiagramFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opcoach.com/diagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "d";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramPackage eINSTANCE = com.opcoach.training.diagram.impl.DiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.training.diagram.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.diagram.impl.DiagramImpl
	 * @see com.opcoach.training.diagram.impl.DiagramPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.opcoach.training.diagram.impl.DiagramElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.diagram.impl.DiagramElementImpl
	 * @see com.opcoach.training.diagram.impl.DiagramPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__Y = 1;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__W = 2;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__H = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__MODEL = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.opcoach.training.diagram.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.diagram.impl.NodeImpl
	 * @see com.opcoach.training.diagram.impl.DiagramPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__X = DIAGRAM_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__Y = DIAGRAM_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__W = DIAGRAM_ELEMENT__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__H = DIAGRAM_ELEMENT__H;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MODEL = DIAGRAM_ELEMENT__MODEL;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.training.diagram.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.training.diagram.impl.ConnectionImpl
	 * @see com.opcoach.training.diagram.impl.DiagramPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__X = DIAGRAM_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__Y = DIAGRAM_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__W = DIAGRAM_ELEMENT__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__H = DIAGRAM_ELEMENT__H;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MODEL = DIAGRAM_ELEMENT__MODEL;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.opcoach.training.diagram.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see com.opcoach.training.diagram.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.training.diagram.Diagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.opcoach.training.diagram.Diagram#getElements()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Elements();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.training.diagram.Diagram#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see com.opcoach.training.diagram.Diagram#getContent()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Content();

	/**
	 * Returns the meta object for class '{@link com.opcoach.training.diagram.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see com.opcoach.training.diagram.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link com.opcoach.training.diagram.DiagramElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see com.opcoach.training.diagram.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.diagram.DiagramElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.opcoach.training.diagram.DiagramElement#getX()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_X();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.diagram.DiagramElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.opcoach.training.diagram.DiagramElement#getY()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.diagram.DiagramElement#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see com.opcoach.training.diagram.DiagramElement#getW()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_W();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.training.diagram.DiagramElement#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see com.opcoach.training.diagram.DiagramElement#getH()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_H();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.training.diagram.DiagramElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see com.opcoach.training.diagram.DiagramElement#getModel()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Model();

	/**
	 * Returns the meta object for class '{@link com.opcoach.training.diagram.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see com.opcoach.training.diagram.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramFactory getDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.opcoach.training.diagram.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.training.diagram.impl.DiagramImpl
		 * @see com.opcoach.training.diagram.impl.DiagramPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__ELEMENTS = eINSTANCE.getDiagram_Elements();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__CONTENT = eINSTANCE.getDiagram_Content();

		/**
		 * The meta object literal for the '{@link com.opcoach.training.diagram.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.training.diagram.impl.NodeImpl
		 * @see com.opcoach.training.diagram.impl.DiagramPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link com.opcoach.training.diagram.impl.DiagramElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.training.diagram.impl.DiagramElementImpl
		 * @see com.opcoach.training.diagram.impl.DiagramPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__X = eINSTANCE.getDiagramElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__Y = eINSTANCE.getDiagramElement_Y();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__W = eINSTANCE.getDiagramElement_W();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__H = eINSTANCE.getDiagramElement_H();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__MODEL = eINSTANCE.getDiagramElement_Model();

		/**
		 * The meta object literal for the '{@link com.opcoach.training.diagram.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.training.diagram.impl.ConnectionImpl
		 * @see com.opcoach.training.diagram.impl.DiagramPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

	}

} //DiagramPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.diagram.util;

import com.opcoach.training.diagram.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.training.diagram.DiagramPackage
 * @generated
 */
public class DiagramAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = DiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramSwitch<Adapter> modelSwitch =
		new DiagramSwitch<Adapter>()
		{
			@Override
			public Adapter caseDiagram(Diagram object)
			{
				return createDiagramAdapter();
			}
			@Override
			public Adapter caseNode(Node object)
			{
				return createNodeAdapter();
			}
			@Override
			public Adapter caseDiagramElement(DiagramElement object)
			{
				return createDiagramElementAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object)
			{
				return createConnectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.training.diagram.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.training.diagram.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.training.diagram.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.training.diagram.Node
	 * @generated
	 */
	public Adapter createNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.training.diagram.DiagramElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.training.diagram.DiagramElement
	 * @generated
	 */
	public Adapter createDiagramElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.opcoach.training.diagram.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.opcoach.training.diagram.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //DiagramAdapterFactory

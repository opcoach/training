package com.opcoach.training.rental.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RentalNavigatorItem extends RentalAbstractNavigatorItem
{

	/**
	 * @generated
	 */
	static
	{
		final Class[] supportedTypes = new Class[]
		{ View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory()
		{

			public Object getAdapter(Object adaptableObject, Class adapterType)
			{
				if (adaptableObject instanceof com.opcoach.training.rental.diagram.navigator.RentalNavigatorItem && (adapterType == View.class || adapterType == EObject.class))
				{
					return ((com.opcoach.training.rental.diagram.navigator.RentalNavigatorItem) adaptableObject).getView();
				}
				return null;
			}

			public Class[] getAdapterList()
			{
				return supportedTypes;
			}
		}, com.opcoach.training.rental.diagram.navigator.RentalNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public RentalNavigatorItem(View view, Object parent, boolean isLeaf)
	{
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView()
	{
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf()
	{
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj)
	{
		if (obj instanceof com.opcoach.training.rental.diagram.navigator.RentalNavigatorItem)
		{
			return EcoreUtil.getURI(getView()).equals(EcoreUtil.getURI(((com.opcoach.training.rental.diagram.navigator.RentalNavigatorItem) obj).getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode()
	{
		return EcoreUtil.getURI(getView()).hashCode();
	}

}

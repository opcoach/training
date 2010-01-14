package com.opcoach.training.rental.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * @generated
 */
public abstract class RentalAbstractNavigatorItem extends PlatformObject
{

	/**
	 * @generated
	 */
	static
	{
		final Class[] supportedTypes = new Class[]
		{ ITabbedPropertySheetPageContributor.class };
		final ITabbedPropertySheetPageContributor propertySheetPageContributor = new ITabbedPropertySheetPageContributor()
		{
			public String getContributorId()
			{
				return "com.opcoach.training.rental.diagram"; //$NON-NLS-1$
			}
		};
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory()
		{

			public Object getAdapter(Object adaptableObject, Class adapterType)
			{
				if (adaptableObject instanceof com.opcoach.training.rental.diagram.navigator.RentalAbstractNavigatorItem && adapterType == ITabbedPropertySheetPageContributor.class)
				{
					return propertySheetPageContributor;
				}
				return null;
			}

			public Class[] getAdapterList()
			{
				return supportedTypes;
			}
		}, com.opcoach.training.rental.diagram.navigator.RentalAbstractNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private Object myParent;

	/**
	 * @generated
	 */
	protected RentalAbstractNavigatorItem(Object parent)
	{
		myParent = parent;
	}

	/**
	 * @generated
	 */
	public Object getParent()
	{
		return myParent;
	}

}

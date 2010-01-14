package com.opcoach.training.rental.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry;

/**
 * @generated
 */
public class RentalNavigatorSorter extends ViewerSorter
{

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element)
	{
		if (element instanceof RentalNavigatorItem)
		{
			RentalNavigatorItem item = (RentalNavigatorItem) element;
			return RentalVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}

// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.e4.rental.ui.views;

import java.util.Collection;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.RentalAgency;

/**
 * ElectriqueMonte
 * 
 * @author olivier
 */
public class AgencyContentProvider implements ITreeContentProvider, RentalUIConstants
{

	private static final Object[] EMPTY_RESULT = new Object[0];

	public AgencyContentProvider()
	{

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose()
	{
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface
	 * .viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{
		/*
		 * if (newInput instanceof RentalAgency) agency = (RentalAgency)
		 * newInput; else agency = null;
		 */

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.
	 * Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement)
	{
		Object[] result = null;

		if (parentElement instanceof TNode)
		{
			return ((TNode) parentElement).getChildren();

		} else if (parentElement instanceof RentalAgency)
		{
			RentalAgency a = (RentalAgency) parentElement;
			return new TNode[] { new TNode(CUSTOMERS_NODE, a), new TNode(RENTALS_NODE, a), new TNode(OBJECTS_NODE, a) };
		} 

		return (result == null) ? EMPTY_RESULT : result;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object
	 * )
	 */
	@Override
	public Object getParent(Object element)
	{
		Object result = null;

		if (element instanceof TNode)
		{
			result = ((TNode) element).agency;
		}
		return result;

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.
	 * Object)
	 */
	@Override
	public boolean hasChildren(Object element)
	{
		return ((element instanceof RentalAgency) || (element instanceof TNode));
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java
	 * .lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement)
	{
		if (inputElement instanceof Collection<?>)
		{
			return ((Collection<?>) inputElement).toArray();
		}

		return EMPTY_RESULT;
	}

	/** A private class to manage the logical nodes in tree */
	class TNode
	{
		public String name;
		public RentalAgency agency;

		public TNode(String n, RentalAgency a)
		{
			name = n;
			agency = a;
		}

		public Object[] getChildren()
		{

			if (CUSTOMERS_NODE == name)
			{
				return agency.getCustomers().toArray();
			} else if (RENTALS_NODE == name)
			{
				return agency.getRentals().toArray();
			} else if (OBJECTS_NODE == name)
			{
				return agency.getObjectsToRent().toArray();
			}
			return EMPTY_RESULT;

		}
		
		public String getText(boolean displayCount)
		{

			
			if (CUSTOMERS_NODE == name)
			{
				return  CUSTOMERS_NODE + (displayCount ? "(" + agency.getCustomers().size() + ")" : "");
			} else if (RENTALS_NODE == name)
			{
				return RENTALS_NODE + (displayCount ? "(" + agency.getRentals().size() + ")" : "");
			} else if (OBJECTS_NODE == name)
			{
				return OBJECTS_NODE + (displayCount ? "(" + agency.getObjectsToRent().size() + ")" : "");
			}
			return "No Text for TNode";
		
		}

	}
}

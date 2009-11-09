// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.ui.views;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

/**
 * @author olivier
 */
public class AgencyContentProvider implements ITreeContentProvider
{

	/**
	 * 
	 */
	public static final String ROOT_AGENCY_NODE = "Agences";
	public static final String CUSTOMERS_NODE = "Customers";
	public static final String RENTALS_NODE = "Locations";
	public static final String OBJECTS_NODE = "Objets ˆ louer";

	private RentalAgency agency = null;

	
	public AgencyContentProvider(RentalAgency pagency)
	
	{
		agency = pagency;
		
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
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{
		/*if (newInput instanceof RentalAgency)
			agency = (RentalAgency) newInput;
		else
			agency = null;*/

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement)
	{
		Object[] result = null;

		if (parentElement instanceof String)
		{
			// This is one of the logical nodes
			if (CUSTOMERS_NODE.equals(parentElement))
			{
				result = agency.getCustomers().toArray();
			}
			else if (RENTALS_NODE.equals(parentElement))
			{
				result = agency.getRentals().toArray();
			}
			else if (OBJECTS_NODE.equals(parentElement))
			{
				result = agency.getObjectsToRent().toArray();
			}
			
		}
		else if (parentElement instanceof RentalAgency)
		{
			return new String[]
			{ CUSTOMERS_NODE, RENTALS_NODE, OBJECTS_NODE };
		}

		return (result == null) ? new Object[0] : result;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object element)
	{
		Object result = null;

		if (element instanceof Customer)
		{
			result = CUSTOMERS_NODE;
		}
		else if (element instanceof RentalObject)
		{
			result = OBJECTS_NODE;
		}
		else if (element instanceof Rental)
		{
			result = RENTALS_NODE;
		}
		else if (element instanceof String)
		{
			result = (ROOT_AGENCY_NODE.equals(element)) ? null : agency;
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object element)
	{
		return ((element instanceof RentalAgency) || (element instanceof String));
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement)
	{
		return new Object[]
		{ agency };
	}
}

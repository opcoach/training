package com.opcoach.training.e4.rental.ui.parts;

import java.util.Collection;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.opcoach.training.e4.rental.ui.Palette;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class RentalProvider  implements ITreeContentProvider, ILabelProvider, IColorProvider,  RentalUIConstants
{
	@Inject
	private Palette currentPalette;
	
	@Inject @Named(RENTAL_UI_IMG_REGISTRY)
	private ImageRegistry registry;	
	
	@Inject @Named(RENTAL_UI_PREF_STORE)
	private IPreferenceStore prefStore;
		

	@Override
	public String getText(Object element)
	{
		String result = null;
		boolean displayCount = prefStore.getBoolean(PREF_DISPLAY_COUNT);

		if (element instanceof RentalAgency)
		{
			result = ((RentalAgency) element).getName();
		} else if (element instanceof TNode)
		{
			return ((TNode) element).getText(displayCount);
		}

		else if (element instanceof Customer)
		{
			result = ((Customer) element).getDisplayName();
		} else if (element instanceof RentalObject)
		{
			result = ((RentalObject) element).getName();
		} else if (element instanceof Rental)
		{
			result = element.toString();
		}

		return result;
	}


	@Override
	public Color getForeground(Object element)
	{
		return currentPalette == null ? null : currentPalette.getForeground(element);
		
	}
	

	
	@Override
	public Color getBackground(Object element)
	{
		return  currentPalette == null ? null :currentPalette.getBackground(element);

	}

	@Override
	public Image getImage(Object element)
	{
		Image result = null;


		if (element instanceof RentalAgency)
		{
			result = registry.get(IMG_AGENCY);
		} else if (element instanceof Rental)
		{
			result = registry.get(IMG_RENTAL);
		} else if (element instanceof Customer)
		{
			result = registry.get(IMG_CUSTOMER);
		} else if (element instanceof RentalObject)
		{
			result = registry.get(IMG_RENTAL_OBJECT);
		}

		return result;
	}
	
	



	private static final Object[] EMPTY_RESULT = new Object[0];

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose()
	{}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface
	 * .viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{}

	/*
	 * (non-Javadoc)
	 * 
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
	 * 
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
	 * 
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
	 * 
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
				return CUSTOMERS_NODE + (displayCount ? "(" + agency.getCustomers().size() + ")" : "");
			} else if (RENTALS_NODE == name)
			{
				return RENTALS_NODE + (displayCount ? "(" + agency.getRentals().size() + ")" : "");
			} else if (OBJECTS_NODE == name)
			{
				return OBJECTS_NODE + (displayCount ? "(" + agency.getObjectsToRent().size() + ")" : "");
			}
			return "No Text for TNode";

		}

		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((agency == null) ? 0 : agency.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TNode other = (TNode) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (agency == null)
			{
				if (other.agency != null)
					return false;
			} else if (!agency.equals(other.agency))
				return false;
			if (name == null)
			{
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		private RentalProvider getEnclosingInstance()
		{
			return RentalProvider.this;
		}

		

	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}







}

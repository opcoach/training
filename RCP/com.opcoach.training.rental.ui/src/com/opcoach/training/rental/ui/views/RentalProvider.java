package com.opcoach.training.rental.ui.views;

import java.util.Collection;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.ui.Palette;
import com.opcoach.training.rental.ui.RentalUIActivator;
import com.opcoach.training.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.ui.palette.NonePalette;

public class RentalProvider extends LabelProvider
		implements ITreeContentProvider, IColorProvider, RentalUIConstants, IFontProvider
{

	private static final Object[] EMPTY_RESULT = new Object[0];

	/** The choosen palette among the additional (may be null) */
	private Palette currentPalette;

	public RentalProvider()
	{
		initPalette();
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{

	}

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

		return EMPTY_RESULT;
	}

	@Override
	public boolean hasChildren(Object element)
	{
		return ((element instanceof RentalAgency) || (element instanceof TNode));
	}

	@Override
	public Object[] getElements(Object inputElement)
	{
		if (inputElement instanceof Collection<?>)
		{
			return ((Collection<?>) inputElement).toArray();
		}

		return EMPTY_RESULT;
	}

	@Override
	public Object getParent(Object element)
	{
		return (element instanceof TNode) ? ((TNode) element).agency : null;
	}

	@Override
	public String getText(Object element)
	{
		String result = null;
		boolean displayCount = RentalUIActivator.getDefault().getPreferenceStore().getBoolean(PREF_DISPLAY_COUNT);

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IColorProvider#getBackground(java.lang.Object)
	 */
	@Override
	public Color getBackground(Object element)
	{
		return (currentPalette == null) ? null : currentPalette.getBackground(element);

	}

	@Override
	public Image getImage(Object element)
	{
		Image result = null;
		ImageRegistry reg = RentalUIActivator.getDefault().getImageRegistry();

		if (element instanceof RentalAgency)
		{
			result = reg.get(IMG_AGENCY);
		} else if (element instanceof TNode)
		{
			result = ((TNode) element).getImage();
		}

		return result;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IColorProvider#getForeground(java.lang.Object)
	 */
	@Override
	public Color getForeground(Object element)
	{
		return (currentPalette != null) ? currentPalette.getForeground(element) : null;

	}

	public void initPalette()
	{
		// Get the selected palette in the preference parameters
		// (called by the preference store listener and the constructor of this
		// class)
		String val = RentalUIActivator.getDefault().getPreferenceStore().getString(PREF_PALETTE);
		if (val == null)
		{
			currentPalette = new Palette("defaultPalette");
			currentPalette.setName("default");
			currentPalette.setColorProvider(new NonePalette());
		} else
			currentPalette = RentalUIActivator.getDefault().getPaletteManager().get(val);

	}

	@Override
	public Font getFont(Object element)
	{
		if (element instanceof Customer)
		{
			return JFaceResources.getFontRegistry().get(FONT_CUSTOMER);
		} else if (element instanceof RentalObject)
			return JFaceResources.getFontRegistry().getBold(FONT_RENTAL_OBJECT);

		return null;
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

		public String getName()
		{
			return name;
		}

		public Image getImage()
		{
			ImageRegistry reg = RentalUIActivator.getDefault().getImageRegistry();

			if (name == RENTALS_NODE)
			{
				return reg.get(IMG_RENTAL);
			} else if (name == CUSTOMERS_NODE)
			{
				return reg.get(IMG_CUSTOMER);
			} else if (name == OBJECTS_NODE)
			{
				return reg.get(IMG_RENTAL_OBJECT);
			}
			return null;
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
			return name + (displayCount ? "(" + getChildren().length + ")" : "");

		}

		// To refresh the expanded nodes, this class must implement equals and
		// hascode
		@Override
		public int hashCode()
		{
			return name.hashCode();
		}

		@Override
		public boolean equals(Object arg0)
		{
			if (arg0 instanceof TNode)
			{
				TNode other = (TNode) arg0;
				return (other.name.equals(name)) && (other.agency == agency);
			}
			return false;
		}

	} // end TNode

}

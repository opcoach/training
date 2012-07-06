// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.e4.rental.ui.views;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.e4.rental.ui.RentalUIActivator;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.e4.rental.ui.views.AgencyContentProvider.TNode;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

/**
 * @author olivier
 */
public class AgencyLabelProvider extends LabelProvider implements IColorProvider, RentalUIConstants
{
	/** A local color registry to store the node colors */
	private ColorRegistry colorRegistry = new ColorRegistry();

	/** The choosen palette among the additional (may be null) */
	private IColorProvider currentPalette;

	public AgencyLabelProvider()
	{
		initPalette();
	}


	@Override
	public String getText(Object element)
	{
		String result = null;
		boolean displayCount = RentalUIActivator.getDefault().getPreferenceStore().getBoolean(DISPLAY_COUNT_PREF);

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
			result = reg.get(AGENCY_KEY);
		} else if (element instanceof Rental)
		{
			result = reg.get(RENTAL_KEY);
		} else if (element instanceof Customer)
		{
			result = reg.get(CUSTOMER_KEY);
		} else if (element instanceof RentalObject)
		{
			result = reg.get(RENTAL_OBJECT_KEY);
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
		if (currentPalette != null)
			return currentPalette.getForeground(element);
		else
		{
			if (element instanceof Customer)
				return getPrefColor(CUSTOMER_KEY);
			else if (element instanceof Rental)
				return getPrefColor(RENTAL_KEY);
			else if (element instanceof RentalObject)
				return getPrefColor(RENTAL_OBJECT_KEY);
			return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
		}
	}

	/**
	 * Get a color according to a key in the preference store
	 * @param key  the preference key to get the rgb value
	 */
	private Color getPrefColor(String key)
	{
		IPreferenceStore pref = RentalUIActivator.getDefault().getPreferenceStore();

		String rgbKey = pref.getString(key);
		Color result = colorRegistry.get(rgbKey);
		if (result == null)
		{
			// Get value in pref store
			colorRegistry.put(rgbKey, StringConverter.asRGB(rgbKey));
			result = colorRegistry.get(rgbKey);
		}

		return result;

	}

	/** Init the palette using the preference key */
	public void initPalette()
	{
		// Recupere la palette selectionnée dans les preferences
		// (appelé par le listener de preference store de l'agency view et par
		// le constructeur du label provider)
		String val = RentalUIActivator.getDefault().getPreferenceStore().getString(COLOR_PROVIDER);
		currentPalette = (val == null) ? null : RentalUIActivator.getDefault().getPaletteManager().get(val);
	}

}

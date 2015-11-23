package com.opcoach.training.rental.ui.palette;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Color;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.ui.RentalUIActivator;
import com.opcoach.training.rental.ui.RentalUIConstants;

public class NonePalette implements IColorProvider, RentalUIConstants
{

	public NonePalette()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getForeground(Object element)
	{
		if (element instanceof Customer)
			return getPrefColor(PREF_CUSTOMER_COLOR);
		else if (element instanceof Rental)
			return getPrefColor(PREF_RENTAL_COLOR);
		else if (element instanceof RentalObject)
			return getPrefColor(PREF_RENTAL_OBJECT_COLOR);

		return null;
	}

	@Override
	public Color getBackground(Object element)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * A private methode to get a color in the preference store
	 * 
	 * @param key
	 *            the preference key to get the rgb value
	 */
	private Color getPrefColor(String key)
	{
		ColorRegistry colorRegistry = JFaceResources.getColorRegistry();

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
}

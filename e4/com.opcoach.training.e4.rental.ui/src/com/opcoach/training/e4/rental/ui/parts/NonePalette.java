package com.opcoach.training.e4.rental.ui.parts;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Color;

import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;

public class NonePalette implements IColorProvider, RentalUIConstants
{

	/** A local color registry to store the node colors */
	private ColorRegistry colorRegistry = new ColorRegistry();
	
	@Inject @Named(RENTAL_UI_PREF_STORE)
	private IPreferenceStore prefStore;


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

	/**
	 * Get a color according to a key in the preference store
	 * 
	 * @param key
	 *            the preference key to get the rgb value
	 */
	private Color getPrefColor(String key)
	{
		String rgbKey = prefStore.getString(key);

		Color result = colorRegistry.get(rgbKey);
		if (result == null)
		{
			// Get value in pref store
			colorRegistry.put(rgbKey, StringConverter.asRGB(rgbKey));
			result = colorRegistry.get(rgbKey);
		}

		return result;

	}

	@Override
	public Color getBackground(Object element)
	{
		return null;
	}

}

package com.opcoach.training.rental.ui.pref;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.RGB;

import com.opcoach.training.rental.ui.RentalUIActivator;
import com.opcoach.training.rental.ui.RentalUIConstants;

public class RentalPrefInit extends AbstractPreferenceInitializer implements RentalUIConstants
{

	public RentalPrefInit()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences()
	{
		RentalUIActivator.getDefault().getPreferenceStore().setDefault(CUSTOMER_KEY, StringConverter.asString(new RGB(0,0,255)));
		RentalUIActivator.getDefault().getPreferenceStore().setDefault(RENTAL_KEY, StringConverter.asString(new RGB(255,0,0)));
		RentalUIActivator.getDefault().getPreferenceStore().setDefault(RENTAL_OBJECT_KEY, StringConverter.asString(new RGB(0,255,0)));
		
	}

}

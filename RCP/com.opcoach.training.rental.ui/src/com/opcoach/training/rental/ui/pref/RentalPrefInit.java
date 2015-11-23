package com.opcoach.training.rental.ui.pref;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

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
		IPreferenceStore ps = RentalUIActivator.getDefault().getPreferenceStore();
		
		Color c = Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
		
		ps.setDefault(PREF_CUSTOMER_COLOR, StringConverter.asString(c.getRGB()));
		ps.setDefault(PREF_RENTAL_COLOR, StringConverter.asString(new RGB(255,0,0)));
		ps.setDefault(PREF_RENTAL_OBJECT_COLOR, StringConverter.asString(new RGB(0,255,0)));
		ps.setDefault(PREF_DISPLAY_COUNT, StringConverter.asString(false));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Init the default palette with its ID
		ps.setDefault(PREF_PALETTE, "com.opcoach.training.rental.ui.nonePalette");

		
	}

}

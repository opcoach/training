package com.opcoach.training.e4.rental.ui.pref;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.e4.rental.ui.RentalUIActivator;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;

public class RentalPrefInit extends AbstractPreferenceInitializer implements RentalUIConstants
{

	public RentalPrefInit()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences()
	{
		System.out.println("Bonjour");
		IPreferenceStore ps = RentalUIActivator.getDefault().getPreferenceStore();

		Color c = Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);

		ps.setDefault(CUSTOMER_KEY, StringConverter.asString(c.getRGB()));

		ps.setDefault(RENTAL_KEY, StringConverter.asString(new RGB(255, 0, 0)));
		ps.setDefault(RENTAL_OBJECT_KEY, StringConverter.asString(new RGB(0, 255, 0)));
		ps.setDefault(DISPLAY_COUNT_PREF, StringConverter.asString(false));
	}

}

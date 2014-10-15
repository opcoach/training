package com.opcoach.training.e4.rental.ui.pref;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;

public class RentalPrefInit extends AbstractPreferenceInitializer implements RentalUIConstants
{

	public RentalPrefInit()
	{
	}

	@Override
	public void initializeDefaultPreferences()
	{
		IPreferenceStore ps = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID);

		Color c = Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);

		ps.setDefault(PREF_CUSTOMER_COLOR, StringConverter.asString(c.getRGB()));
		ps.setDefault(PREF_RENTAL_COLOR, StringConverter.asString(new RGB(255, 0, 0)));
		ps.setDefault(PREF_RENTAL_OBJECT_COLOR, StringConverter.asString(new RGB(0, 255, 0)));
		ps.setDefault(PREF_PALETTE, NONE_PALETTE);
		
		ps.setDefault(PREF_DISPLAY_COUNT, StringConverter.asString(false));
	}

}

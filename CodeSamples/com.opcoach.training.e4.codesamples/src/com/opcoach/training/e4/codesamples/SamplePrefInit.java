package com.opcoach.training.e4.codesamples;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class SamplePrefInit extends AbstractPreferenceInitializer implements FeatureConstants
{

	public SamplePrefInit() { 	}

	@Override
	public void initializeDefaultPreferences()
	{
		// Unfortunately, in Eclipse 4.2, injection is not done in Pref initializer :(
		// So must get it using a static method
		IPreferenceStore ps = FeatureAddon.getPreferenceStore();

		ps.setDefault(PREF_PATH, "/"); // Init as a string

		Color c = Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
		ps.setDefault(PREF_CUSTOMER_COLOR, StringConverter.asString(c.getRGB()));
	}

}

package com.opcoach.training;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceInitializer extends AbstractPreferenceInitializer
{

	public void initializeDefaultPreferences()
	{
		IPreferenceStore store = MyActivator.getDefault().getPreferenceStore();
		store.setDefault("P_BOOLEAN", true);
		store.setDefault("P_CHOICE", "choice2");
		store.setDefault("P_STRING", "Default value");
	}
}




package com.opcoach.training.e4.rental.ui.e3bridge;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import com.opcoach.training.e4.rental.ui.pref.RentalColorPreferences;

public class RentalColorPreferenceE3 extends RentalColorPreferences implements IWorkbenchPreferencePage
{
	

	public RentalColorPreferenceE3()
	{
		super();
		// Set the org.eclipse.ui preference store
		setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID));
	}

	@Override
	public void init(IWorkbench workbench)
	{
		// TODO Auto-generated method stub

	}

}

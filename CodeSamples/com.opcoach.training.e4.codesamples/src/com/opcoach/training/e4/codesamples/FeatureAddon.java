package com.opcoach.training.e4.codesamples;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class FeatureAddon implements FeatureConstants
{

	@PostConstruct
	void startFeature(IEclipseContext ctx)
	{
		// Create a preference store and store it in context
		ctx.set(PREF_STORE_ID, getPreferenceStore());

		// Other init of the context
	}

	// ----------------------------------------------------------------------
	// This part of the code is TEMPORARY
	// Publish a static method to get the preference store that is used by the
	// classes that are not created using ContextInjectionFactory
	// Other 'injected' classes can use the @Inject @Named(RENTAL_UI_PREF_STORE)
	// to get it !!
	// -----------------------------------------------------------------------
	private static IPreferenceStore prefStore;

	public static IPreferenceStore getPreferenceStore()
	{
		if (prefStore == null)
		{
			prefStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID);
		}
		return prefStore;
	}

}
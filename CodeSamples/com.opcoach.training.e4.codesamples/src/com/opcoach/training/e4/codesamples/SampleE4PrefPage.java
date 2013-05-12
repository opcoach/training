package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class SampleE4PrefPage extends    FieldEditorPreferencePage 
                              implements IWorkbenchPreferencePage, MyPrefConstants
{
	// Get the preference store with injection.
	@Inject @Named("a.constante.to.my.preferenceStore")
	private IPreferenceStore prefStore;

	// Build the preference page with a 'grid' layout
	public SampleE4PrefPage()
	{
		super(GRID);
	}

	@Override  // From IWorkbenchPreferencePage
	public void init(IWorkbench workbench)
	{
		// This method should definitively disappear in E4 
		// when extension point will be definitively defined !
		// Initialize the preference store here (because not available in constructor)
		setPreferenceStore(prefStore);
	}

	@Override
	protected void createFieldEditors()
	{
		// Create the fields here, using constants to identify the preferences

		addField(new DirectoryFieldEditor(PREF_PATH, "Storage Directory : ", getFieldEditorParent()));

		addField(new ColorFieldEditor(PREF_CUSTOMER_COLOR, "Customer color : ", getFieldEditorParent()));
	}

}

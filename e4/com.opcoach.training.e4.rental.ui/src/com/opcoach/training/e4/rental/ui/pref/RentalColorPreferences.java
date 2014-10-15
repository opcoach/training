package com.opcoach.training.e4.rental.ui.pref;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;

import com.opcoach.training.e4.rental.ui.RentalUIConstants;

/** This page manage the  preferences values for the default palette */
public class RentalColorPreferences extends FieldEditorPreferencePage implements RentalUIConstants

{
	@Inject @Named(RENTAL_UI_PREF_STORE)
	IPreferenceStore prefStore;
	
	
	public RentalColorPreferences()
	{
		super(GRID);
		// Init of preference store delegated in init (pstore not initialized
		// else)
	}

	@Override
	protected void createFieldEditors()
	{
	
		addField(new ColorFieldEditor(PREF_CUSTOMER_COLOR, "Customer : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_COLOR, "Rental : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_OBJECT_COLOR, "Objets : ", getFieldEditorParent()));

	}

}

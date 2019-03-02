package com.opcoach.training.e4.rental.ui.pref;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;

import com.opcoach.training.e4.rental.ui.RentalUIConstants;

/** This page manage the preferences values for the default palette */
public class RentalColorPreferences extends FieldEditorPreferencePage implements RentalUIConstants

{
	public RentalColorPreferences()
	{
		super(GRID);
		// With E4Preferences, preference store is managed
	}

	@Override
	protected void createFieldEditors()
	{

		addField(new ColorFieldEditor(PREF_CUSTOMER_COLOR, "Customer : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_COLOR, "Rental : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_OBJECT_COLOR, "Objets : ", getFieldEditorParent()));

	}

}

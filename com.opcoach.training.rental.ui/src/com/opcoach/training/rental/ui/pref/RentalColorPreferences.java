package com.opcoach.training.rental.ui.pref;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.opcoach.training.rental.ui.RentalUIActivator;

public class RentalColorPreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage, PrefRentalConstants

{

	public RentalColorPreferences()
	{
		super(GRID);
		setPreferenceStore(RentalUIActivator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors()
	{
		addField(new ColorFieldEditor(CUSTOMER_COLOR, "Customer : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(RENTAL_COLOR, "Rental : ", getFieldEditorParent()));

	}

	@Override
	public void init(IWorkbench workbench)
	{
		// TODO Auto-generated method stub

	}

}

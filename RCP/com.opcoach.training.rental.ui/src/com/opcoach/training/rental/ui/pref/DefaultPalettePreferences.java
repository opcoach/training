package com.opcoach.training.rental.ui.pref;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.opcoach.training.rental.ui.RentalUIActivator;
import com.opcoach.training.rental.ui.RentalUIConstants;

public class DefaultPalettePreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage, RentalUIConstants

{

	public DefaultPalettePreferences()
	{
		super(GRID);
		setPreferenceStore(RentalUIActivator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors()
	{
	
		addField(new ColorFieldEditor(PREF_CUSTOMER_COLOR, "Customer : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_COLOR, "Rental : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_OBJECT_COLOR, "Objects : ", getFieldEditorParent()));

	}

	@Override
	public void init(IWorkbench workbench)
	{
		// TODO Auto-generated method stub

	}

}

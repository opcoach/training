package com.opcoach.training.e4.rental.ui.pref;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.opcoach.training.e4.rental.ui.Palette;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;

public class RentalColorPreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage, RentalUIConstants

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
	public void init(IWorkbench workbench)
	{
		setPreferenceStore(prefStore);

	}
	
	@Inject @Named(RentalUIConstants.PALETTE_MANAGER)
	private Map<String, Palette> palettes;


	@Override
	protected void createFieldEditors()
	{
		// Extract the double String array for name and color provider (value is
		// the key)
		//Map<String, Palette> palettes = RentalUIActivator.getPaletteManager();

		String[][] comboValues = new String[palettes.size()][2];
		int i = 0;
		for (Palette p : palettes.values())
		{
			comboValues[i][0] = p.getName(); // Displayed name
			comboValues[i][1] = p.getId(); // Returned value if selected
			i++;
		}

		addField(new ComboFieldEditor(PREF_PALETTE, "Palette couleur :", comboValues, getFieldEditorParent()));

		addField(new ColorFieldEditor(PREF_CUSTOMER_COLOR, "Customer : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_COLOR, "Rental : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_OBJECT_COLOR, "Objets : ", getFieldEditorParent()));

	}

}

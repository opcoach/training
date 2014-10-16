package com.opcoach.training.e4.rental.ui.pref;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;

import com.opcoach.training.e4.rental.ui.Palette;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;

/** This preference page manage the palette value */
public class RentalPalettePreferences extends FieldEditorPreferencePage implements RentalUIConstants

{
	
	@Inject @Named(PALETTE_MANAGER)
	private Map<String, Palette> palettes;

	public RentalPalettePreferences()
	{
		super(GRID);
	}


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

	}

}

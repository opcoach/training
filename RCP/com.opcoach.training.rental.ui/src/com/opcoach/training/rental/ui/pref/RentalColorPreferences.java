package com.opcoach.training.rental.ui.pref;

import java.util.Map;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.opcoach.training.rental.ui.Palette;
import com.opcoach.training.rental.ui.RentalUIActivator;
import com.opcoach.training.rental.ui.RentalUIConstants;

public class RentalColorPreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage, RentalUIConstants

{

	public RentalColorPreferences()
	{
		super(GRID);
		setPreferenceStore(RentalUIActivator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors()
	{
		// Extract the double String array for name and color provider (value is
		// the key)
		Map<String, Palette> palettes = RentalUIActivator.getDefault().getPaletteManager();

		String[][] comboValues = new String[palettes.size()][2];
		int i = 0;
		for (Palette p : palettes.values())
		{
			comboValues[i][0] = p.getName(); // Displayed name
			comboValues[i][1] = p.getId(); // Returned value if selected
			i++;
		}

		addField(new ComboFieldEditor(PREF_PALETTE, "Palette :", comboValues, getFieldEditorParent()));

	}

	@Override
	public void init(IWorkbench workbench)
	{

	}

}

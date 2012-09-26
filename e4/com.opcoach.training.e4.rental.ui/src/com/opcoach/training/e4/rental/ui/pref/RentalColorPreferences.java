package com.opcoach.training.e4.rental.ui.pref;

import java.util.Map;

import javax.inject.Inject;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.opcoach.training.e4.rental.ui.RentalUIActivator;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;

public class RentalColorPreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage, RentalUIConstants

{
	@Inject
	IPreferenceStore prefStore;

	public RentalColorPreferences()
	{
		super(GRID);
		// Init of preference store delegated in init (pstore not initialized else)
	}
	
	@Override
	public void init(IWorkbench workbench)
	{
		setPreferenceStore(prefStore);

	}


	@Override
	protected void createFieldEditors()
	{
		// Extract the double String array for name and color provider (value is the key)
		Map<String, IColorProvider> addedProviders = RentalUIActivator.getPaletteManager();
		if (!addedProviders.isEmpty())
		{
		   String[][] comboValues = new String[addedProviders.size()+1][2];
		   comboValues[0][0] = "None";   // Displayed name
		   comboValues[0][1] = null;
		   int i = 1;
		   for (String key : addedProviders.keySet())
		   {
			   comboValues[i][0] = key;   // Displayed name
			   comboValues[i][1] = key;   // Returned value if selected
			   i++;
		   }
		   
		   addField(new ComboFieldEditor(COLOR_PROVIDER, "Palette couleur :",comboValues,getFieldEditorParent()));
		   
		}
		
		addField(new ColorFieldEditor(CUSTOMER_KEY, "Customer : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(RENTAL_KEY, "Rental : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(RENTAL_OBJECT_KEY, "Objets : ", getFieldEditorParent()));

	}


}

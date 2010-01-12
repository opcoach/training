package com.opcoach.training.rental.ui.pref;

import java.util.Map;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

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
		// Extract the double String array for name and color provider (value is the key)
		Map<String, IColorProvider> addedProviders = RentalUIActivator.getDefault().getAdditionalColorProviders();
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
		   
		   addField(new ComboFieldEditor(COLOR_PROVIDER, "Added Color Provider",comboValues,getFieldEditorParent()));
		   
		}
		
		addField(new ColorFieldEditor(CUSTOMER_COLOR, "Customer : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(RENTAL_COLOR, "Rental : ", getFieldEditorParent()));

	}

	@Override
	public void init(IWorkbench workbench)
	{
		// TODO Auto-generated method stub

	}

}

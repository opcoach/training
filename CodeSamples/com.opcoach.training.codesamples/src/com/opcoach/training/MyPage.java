package com.opcoach.training;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class MyPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage
{
	public MyPage()
	{
		super(GRID);
		setPreferenceStore(MyActivator.getDefault().getPreferenceStore());
		setDescription("A demonstration of a preference page implementation");
	}

	protected void createFieldEditors()
	{
		addField(new DirectoryFieldEditor("P_PATH", "Directory :", getFieldEditorParent()));
	}

	public void init(IWorkbench workbench)
	{
		// Do some initialization
	}
}



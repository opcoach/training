package com.opcoach.training.e4.codesamples;

import java.io.File;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SampleWizardPage extends WizardPage
{
	private Object selection;
	private Label filename;
	
	@Inject
	public SampleWizardPage(@Named(IServiceConstants.ACTIVE_SELECTION) Object currentSelection)
	{
		super("wizardPage");
		setTitle("Wizard Page title");
		setDescription("Wizard Page description");
		selection = currentSelection;
	}

	@Override
	public void createControl(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NULL);
		
		filename = new Label(container, SWT.BORDER);
		if (selection instanceof File)
		   filename.setText(((File)selection).getName());

		setControl(container);
	}
	
	@Override
	public boolean isPageComplete()
	{
		return filename.getText().length() > 0; 
	}

}

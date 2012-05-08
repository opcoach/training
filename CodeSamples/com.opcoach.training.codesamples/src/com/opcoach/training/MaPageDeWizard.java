package com.opcoach.training;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class MaPageDeWizard extends WizardPage
{

	/**
	 * Create the wizard.
	 */
	public MaPageDeWizard()
	{
		super("wizardPage");
		setTitle("Wizard Page title");
		setDescription("Wizard Page description");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		
		Label lblMaPage = new Label(container, SWT.NONE);
		lblMaPage.setBounds(60, 53, 59, 14);
		lblMaPage.setText("Ma Page");
	}
}

package com.opcoach.training;

import org.eclipse.jface.wizard.Wizard;

public class MonWizard extends Wizard
{

	public MonWizard()
	{
		setWindowTitle("New Wizard");
	}

	@Override
	public void addPages()
	{
		addPage(new MaPageDeWizard());
	}

	@Override
	public boolean performFinish()
	{
		return false;
	}

}

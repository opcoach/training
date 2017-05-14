package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.wizard.Wizard;

public class SampleWizard extends Wizard
{
	private SampleWizardPage firstPage = null;
	private IEclipseContext context; 
	
    @Inject 
	public SampleWizard(IEclipseContext ctx)
	{
		setWindowTitle("New Wizard");
		context = ctx;
	}

	@Override
	public void addPages()
	{
		firstPage = ContextInjectionFactory.make(SampleWizardPage.class, context);
		addPage(firstPage);
	}
	
	@Override
	public void dispose()
	{
		// Don't forget to uninject pages created with make ! 
		ContextInjectionFactory.uninject(firstPage, context);
		super.dispose();
	}

	@Override
	public boolean performFinish()
	{
		// Do your stuff here by asking the pages...
		// Use an AntRunner to create projects structures or to manipulate files !
		return true;
	}
}

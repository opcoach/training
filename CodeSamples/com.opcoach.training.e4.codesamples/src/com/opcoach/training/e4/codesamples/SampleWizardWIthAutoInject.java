package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.PlatformUI;

public class SampleWizardWIthAutoInject extends Wizard
{
	private SampleWizardPage firstPage = null;
		
	private IEclipseContext context;
	
	@Inject @Named(IServiceConstants.ACTIVE_SELECTION) Object selection;
	
	public SampleWizardWIthAutoInject()
	{
		setWindowTitle("New Wizard");
		context =  PlatformUI.getWorkbench().getService(IEclipseContext.class);
		ContextInjectionFactory.inject(this, context);
	}
	
	@Override
	public void dispose()
	{
		ContextInjectionFactory.uninject(this,  context);
		super.dispose();
	}

	@Override
	public void addPages()
	{
		firstPage = ContextInjectionFactory.make(SampleWizardPage.class, context);
		addPage(firstPage);
	}

	@Override
	public boolean performFinish()
	{
		// Do your stuff here by asking the pages...
		return true;
	}

}

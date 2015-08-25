package com.opcoach.training.e4.codesamples;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

public class OpenSampleWizard
{
	@Execute
	public void execute(IEclipseContext ctx, Shell s)
	{
		Wizard w = ContextInjectionFactory.make(SampleWizard.class, ctx);
		WizardDialog wd = new WizardDialog(s, w);
		wd.open();
	}
}

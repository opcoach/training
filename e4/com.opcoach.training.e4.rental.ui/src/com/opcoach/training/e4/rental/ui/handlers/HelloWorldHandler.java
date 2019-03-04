package com.opcoach.training.e4.rental.ui.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldHandler
{

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) 
	{
		MessageDialog.openInformation(shell, "Hello World", "hello");
	}
	
	

}

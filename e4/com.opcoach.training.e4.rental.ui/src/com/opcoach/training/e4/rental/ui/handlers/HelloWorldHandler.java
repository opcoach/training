package com.opcoach.training.e4.rental.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import jakarta.inject.Named;

public class HelloWorldHandler
{

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) 
	{
		MessageDialog.openInformation(shell, "Hello World", "hello");
	}
	
	

}

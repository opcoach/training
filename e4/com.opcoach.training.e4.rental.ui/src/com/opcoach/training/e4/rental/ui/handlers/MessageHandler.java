package com.opcoach.training.e4.rental.ui.handlers;

import javax.inject.Named;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class MessageHandler
{
	@Execute
	public Object execute(@Named("com.opcoach.training.e4.rental.ui.messageParam") String title,
			@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) throws ExecutionException
	{
		MessageDialog.openInformation(shell, "Message", "Title :" + title);
		return null;
	}
	
	@CanExecute
	public boolean canExecute() { return true; 	} 

}

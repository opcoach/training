package com.opcoach.training.e4.rental.eap.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class MessageHandler
{

	@Execute
	public void execute(@Named("com.opcoach.training.e4.rental.ui.messageParam") String title,
			            @Named(IServiceConstants.ACTIVE_SHELL) Shell shell) 
	{
		MessageDialog.openInformation(shell, "Message", "Title :" + title);
	}
	

}

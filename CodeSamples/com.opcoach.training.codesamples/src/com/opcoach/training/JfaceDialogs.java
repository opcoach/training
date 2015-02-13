package com.opcoach.training;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class JfaceDialogs
{
	
	
	public void displayConfirmationDialog()
	{
		Shell s = Display.getCurrent().getActiveShell();
		if (MessageDialog.openConfirm(s, "Confirm your choice", "Do you confirm the delete ? "))
		{
			System.out.println("Do the delete");
		}
	}

}

package com.opcoach.training.e4.rental.ui.handlers;

import javax.inject.Named;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.RTFTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.URLTransfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.training.rental.Customer;

public class CopyCustomerHandler
{

	@CanExecute
	public boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selectedObject)
	{
		return selectedObject instanceof Customer;
	}

	@Execute
	public Object execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selectedObject, @Named(IServiceConstants.ACTIVE_SHELL) Shell shell) throws ExecutionException
	{
		if (selectedObject instanceof Customer)
		{
			Customer c = (Customer) selectedObject;
			MessageDialog.openInformation(shell, "Copy Client", "On copie le client :" + (c.getDisplayName()));

			Clipboard clipboard = new Clipboard(Display.getCurrent());
			String textData = c.getDisplayName();
			String rtfData = "{\\rtf1\\b\\i " + textData + "}";
			Transfer[] transfers = new Transfer[] { RTFTransfer.getInstance(), TextTransfer.getInstance() };
			Object[] data = new Object[] { rtfData, textData };
			clipboard.setContents(data, transfers);
			clipboard.dispose();
		}

		return null;
	}

}

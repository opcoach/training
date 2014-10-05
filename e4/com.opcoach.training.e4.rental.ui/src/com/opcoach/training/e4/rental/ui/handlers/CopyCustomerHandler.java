package com.opcoach.training.e4.rental.ui.handlers;

import java.util.concurrent.ExecutionException;

import javax.inject.Named;

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

package com.opcoach.training.rental.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.training.rental.Customer;


public class CopyCustomer extends AbstractHandler implements IHandler
{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection)
		{ 
			Object selectedObject = ((IStructuredSelection) currentSelection).getFirstElement();
			if (selectedObject instanceof Customer)
			{
				IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
				MessageDialog.openInformation(window.getShell(),
						"Copy Client",
						"On copie le client :" + ((Customer)selectedObject).getDisplayName());
			}		

		}
		
		return null;
	}

}

package com.opcoach.training;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class ObjectListeningToSelection implements ISelectionListener
{
	public ObjectListeningToSelection()
	{
		IWorkbenchWindow w = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelectionService selService = w.getSelectionService();
		selService.addSelectionListener(this);
	}

	public void dispose() throws Throwable
	{
		IWorkbenchWindow w = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		w.getSelectionService().removeSelectionListener(this);
	}

	public void selectionChanged(IWorkbenchPart part, ISelection selection)
	{
		// Manage selection here...
		if (selection instanceof IStructuredSelection)
		{
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			System.out.println("Objet selection : " + selected);
		}
	}

}

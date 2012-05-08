package com.opcoach.training;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

public class ViewListeningToSelection extends ViewPart implements ISelectionListener
{
	public void init(IViewSite site) throws PartInitException
	{
		super.init(site);
		site.getPage().addSelectionListener(this);
	}

	public void dispose()
	{
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
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

	public void createPartControl(Composite parent) { }
	public void setFocus() 	{ 	}
}

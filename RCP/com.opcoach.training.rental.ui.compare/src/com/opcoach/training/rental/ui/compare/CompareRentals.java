package com.opcoach.training.rental.ui.compare;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.training.rental.Rental;

public class CompareRentals extends AbstractHandler implements IHandler
{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection)
		{
			IStructuredSelection iss = (IStructuredSelection) currentSelection;

			// On récupère la première et la seconde rental de la selection.
			Iterator<?> it = iss.iterator();
			Rental r1 = (Rental) it.next();
			Rental r2 = (Rental) it.next();
			String message = "";
			if ((r1.getStartDate().before(r2.getStartDate())))
			{
				message = " La location " + r1 + " est avant la location " + r2;

			} else
			{
				message = " La location " + r1 + " est après la location " + r2;

			}

			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MessageDialog.openInformation(window.getShell(), "Comparaison de locations", message);
		}

		return null;
	}

}

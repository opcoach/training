package com.opcoach.training.rental.ui.commands;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;



public class SampleCommandHandler extends AbstractHandler
{

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection)
		{ 
			IStructuredSelection isel = (IStructuredSelection) currentSelection;
			for (Iterator<?> it = isel.iterator(); it.hasNext(); )
			{
				System.out.println("Objet selectionné : " + it.next());
			}
		}
		return null;
	}

}

package com.opcoach.training.e4.rental.ui.handlers;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.State;
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
		
		// Manage the state
		Command c = event.getCommand();
		for (String st : c.getStateIds())
		{
			System.out.println("Etat de la commande : " + st);
			State s = c.getState(st);
			System.out.println("Etat de : " + st + " value = " + s.getValue());

			
		}
		State s = c.getState("com.opcoach.training.rental.ui.commands.state3");
		s.setValue(false);
		//HandlerUtil.updateRadioState(event.getCommand(), "Toto");
		
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.AbstractHandler#isEnabled()
	 */
	@Override
	public boolean isEnabled()
	{
		// TODO Auto-generated method stub
		return true;
	}
	
	

}

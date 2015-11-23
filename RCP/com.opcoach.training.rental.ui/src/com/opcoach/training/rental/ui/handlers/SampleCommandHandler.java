package com.opcoach.training.rental.ui.handlers;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.State;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.training.rental.ui.Messages;



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
				System.out.println(Messages.SampleCommandHandler_0 + it.next());
			}
		}
		
		// Manage the state
		Command c = event.getCommand();
		for (String st : c.getStateIds())
		{
			System.out.println(Messages.SampleCommandHandler_1 + st);
			State s = c.getState(st);
			System.out.println(Messages.SampleCommandHandler_2 + st + Messages.SampleCommandHandler_3 + s.getValue());

			
		}
		State s = c.getState("org.eclipse.ui.commands.toggleState");
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

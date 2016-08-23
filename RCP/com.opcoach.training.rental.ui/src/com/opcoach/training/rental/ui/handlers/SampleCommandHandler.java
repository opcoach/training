package com.opcoach.training.rental.ui.handlers;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;



public class SampleCommandHandler extends AbstractHandler
{

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		Shell s = HandlerUtil.getActiveShell(event);
		MessageDialog.openInformation(s, "Hello World", "This is a Hello World from an Eclipse Handler");
		
		return null;
	}

	

}

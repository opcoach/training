package com.opcoach.training;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class HelloworldClassAction implements IWorkbenchWindowActionDelegate
{

	@Override
	public void run(IAction action)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window)
	{
		// TODO Auto-generated method stub
		System.out.println(Messages.HelloworldClassAction_0 + "%d3"); //$NON-NLS-2$
	}

}

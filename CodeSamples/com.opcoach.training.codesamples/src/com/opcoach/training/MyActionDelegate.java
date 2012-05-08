package com.opcoach.training;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;

public class MyActionDelegate implements IActionDelegate
{

	public void run(IAction action)
	{
		// Do stuff
		// can change the source action
	}

	public void selectionChanged(IAction action, ISelection selection)
	{
		// Do something when selection changed
	}

}




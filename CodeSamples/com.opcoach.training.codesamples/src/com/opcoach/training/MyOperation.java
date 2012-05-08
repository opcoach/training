package com.opcoach.training;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.AbstractOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;

public class MyOperation extends AbstractOperation
{
	public MyOperation(String label)
	{
		super(label);
	}

	public IStatus execute(IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException
	{
		// your stuff
		return null;
	}

	public IStatus redo(IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException
	{
		// your stuff
		return null;
	}

	public IStatus undo(IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException
	{
		// your stuff
		return null;
	}

}

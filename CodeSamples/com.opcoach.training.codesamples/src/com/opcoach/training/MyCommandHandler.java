package com.opcoach.training;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.PlatformUI;

public class MyCommandHandler extends AbstractHandler
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		// Create an operation
		IUndoableOperation op = new SepiaFilterOperation(null, null);
		// Add it on history
		IProgressMonitor pm = new NullProgressMonitor();
		PlatformUI.getWorkbench().getOperationSupport().getOperationHistory().execute(op, pm, null);

		return null;
	}

}

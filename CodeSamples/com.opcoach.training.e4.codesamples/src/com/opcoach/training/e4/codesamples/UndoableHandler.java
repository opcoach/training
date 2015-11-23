package com.opcoach.training.e4.codesamples;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.ui.operations.IWorkbenchOperationSupport;

public class UndoableHandler
{
	@Execute
	public void execute(IWorkbenchOperationSupport wos, IProgressMonitor pm) throws ExecutionException
	{
		// Create an operation
		IUndoableOperation op = new SepiaFilterOperation(null, null);
		
		// Execute it using history
		wos.getOperationHistory().execute(op, pm, null);
	}
}

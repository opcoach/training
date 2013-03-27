package com.opcoach.training.e4.codesamples;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

public class UndoableHandler
{
	@Execute
	public void execute(IOperationHistory opHist) throws ExecutionException
	{
		// Create an operation
		IUndoableOperation op = new SepiaFilterOperation(null, null);
		// Execute it using history
		IProgressMonitor pm = new NullProgressMonitor();
		opHist.execute(op, pm, null);
	}

	@CanExecute
	public boolean canExecute()
	{
		return true;
	}

}

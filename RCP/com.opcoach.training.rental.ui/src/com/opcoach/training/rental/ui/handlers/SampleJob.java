package com.opcoach.training.rental.ui.handlers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;

public class SampleJob extends Job
{	
	public SampleJob()  	{  super("Computation Job");  	}

	@Override 
	protected IStatus run(IProgressMonitor monitor)
	{
		SubMonitor progress = SubMonitor.convert(monitor, 10000);
		
		// Compute 10000 steps
		progress.beginTask("Compute", 10000);
		
		for (int i = 0; i < 10000; i++)
		{
			progress.setTaskName("Computing the " + i + " th block");

			for (int j = 0; j < 10000; j++)
			{
				 Math.cos((double) j);
			}
			// One step done
			progress.worked(1);
			
			if (progress.isCanceled()) 
				return Status.CANCEL_STATUS;
		}

		return Status.OK_STATUS;
	}
}

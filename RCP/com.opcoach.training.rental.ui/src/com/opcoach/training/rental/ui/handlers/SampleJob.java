package com.opcoach.training.rental.ui.handlers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class SampleJob extends Job
{
	public SampleJob()
	{
		super("Computation Job");
	}

	@Override
	protected IStatus run(IProgressMonitor monitor)
	{
		// Compute 10000 steps
		monitor.beginTask("Compute", 10000);
		
		for (int i = 0; i < 10000; i++)
		{
			// Do Something...
			for (int j = 0; j < 10000; j++)
			{
				double acos = Math.cos((double) j);
			}
			
			// One step done
			monitor.worked(1);
		}

		return Status.OK_STATUS;
	}
}

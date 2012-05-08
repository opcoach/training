package com.opcoach.training;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.progress.UIJob;

public class MyJob extends Job
{
	public MyJob()
	{
		super("My Job");
	}

	public IStatus run(IProgressMonitor pm)
	{
		pm.beginTask("This is my job", 100);
		for (int i = 0; i < 100; i++)
		{
			// do something.
			pm.worked(1);
		}
		return Status.OK_STATUS;
	}

	// Run the job
	public static void main(String[] args)
	{
		Job j = new MyJob();
		j.schedule();
	}

	public void jobWithUIJob()
	{
		Job j = new Job("Job Title Here")
			{
				protected IStatus run(IProgressMonitor progress)
				{
					// Your code to run in the background
					// ...
					UIJob updateUI = new UIJob("UIJob Title Here")
						{
							public IStatus runInUIThread(IProgressMonitor monitor)
							{
								// Calls to SWT components
								// ...
								return Status.OK_STATUS;
							}
						};

					updateUI.schedule();
					return Status.OK_STATUS;
				}
			};
		j.schedule();
	}
}
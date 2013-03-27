package com.opcoach.training.e4.codesamples;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.AbstractOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

public class SepiaFilterOperation extends AbstractOperation
{
	private ImageRegistry registry;
	private Image source;
	private Image filtered;
	private String imageKey;

	public SepiaFilterOperation(ImageRegistry reg, String imKey)
	{
		super("Sepia Filter Operation");
		registry = reg;
		imageKey = imKey;
		source = registry.get(imageKey);
	}

	public IStatus execute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException
	{
		SepiaFilter filter = new SepiaFilter();
		filtered = filter.filter(source, monitor);
		registry.put(imageKey, filtered);
		return Status.OK_STATUS;
	}

	public IStatus redo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException
	{
		// Restore the filtered image in registry
		registry.put(imageKey, filtered);
		return Status.OK_STATUS;
	}

	public IStatus undo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException
	{
		// Restore the source image in registry
		registry.put(imageKey, source);
		return Status.OK_STATUS;
	}

}

package com.opcoach.training.e4.codesamples;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.graphics.Image;

public interface ImageFilter
{
	public Image filter(Image source,IProgressMonitor monitor);

}

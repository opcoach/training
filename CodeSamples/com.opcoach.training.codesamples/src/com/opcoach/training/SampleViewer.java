package com.opcoach.training;

import java.io.File;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

public class SampleViewer
{

	public void createPartControl(Composite parent)
	{
		TreeViewer tv = new TreeViewer(parent);
		
		tv.setContentProvider(new FileTreeContentProvider());
		
		tv.setLabelProvider(new FileLabelProvider());
		
		tv.setInput(new File("C:\\"));
		
	}
}

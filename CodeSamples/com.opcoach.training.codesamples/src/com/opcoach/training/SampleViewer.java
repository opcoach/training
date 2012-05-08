package com.opcoach.training;

import java.io.File;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SampleViewer
{

	public void createPartControl(Composite parent)
	{
		TableViewer tv = new TableViewer(parent);
		
		tv.setContentProvider(new FileTableContentProvider());
		
		tv.setLabelProvider(new FileTableLabelProvider());
		
		tv.setInput(new File("C:\\"));
		
		
	}
}

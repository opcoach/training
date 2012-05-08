package com.opcoach.training;

import java.io.File;

import org.eclipse.jface.viewers.LabelProvider;

public class FileTableLabelProvider extends LabelProvider
{
	
	public String getText(Object element)
	{
		if (element instanceof File)
			return ((File)element).getName();
		else
			return super.getText(element);
	}

}

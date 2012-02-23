package com.opcoach.training;

import java.io.File;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class FileTableContentProvider implements IStructuredContentProvider
{
	private static final Object[] EMPTY_RESULT = new Object[0];
	
	public Object[] getElements(Object element)
	{
		Object[] result = null;
		
		if (element instanceof File)
		{
			result = ((File) element).listFiles();
		}
		
		return (result == null) ?  EMPTY_RESULT : result;
	}
	

	public void dispose()
	{
	}

	public void inputChanged(Viewer viewer, Object old_object, Object new_object)
	{
	}
}

package com.opcoach.training;

import java.io.File;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class FileTreeContentProvider implements ITreeContentProvider
{

	public Object[] getChildren(Object parentElement)
	{

		if (parentElement instanceof File)
		{
			File parentFile = (File) parentElement;

			if (parentFile.isDirectory())
			{
				// list child files or directories
				return parentFile.listFiles();
			} else
			{
				// This is a file
				return EMPTY_RESULT;
			}
		}

		return EMPTY_RESULT;
	}

	private static final Object[]	EMPTY_RESULT	= new Object[0];

	public Object[] getElements(Object element)
	{
		Object[] result = null;

		if (element instanceof File)
		{
			result = ((File) element).listFiles();
		}

		return (result == null) ? EMPTY_RESULT : result;
	}

	public void dispose()
	{
	}

	public void inputChanged(Viewer viewer, Object old_object, Object new_object)
	{
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */

	// hasChildren method
	public boolean hasChildren(Object element)
	{
		if ("ROOT".equals(element))
		{
			return true;
		} 
		else if (element instanceof File)
		{
			File file = (File) element;
			// return true if file is a drive or directory
			return (file.getParentFile() == null) || (file.isDirectory());

		}

		return false;
	}
	
	// getParent method
	public Object getParent(Object element)
	{
		if (element instanceof File)
		{
			return ((File) element).getParentFile();
		}
		return EMPTY_RESULT;
	}

}

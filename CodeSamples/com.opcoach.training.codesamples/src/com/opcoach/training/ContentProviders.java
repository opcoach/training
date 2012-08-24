package com.opcoach.training;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

public class ContentProviders 
{
	
	public interface IContentProvider 
	{
	    public void dispose();
	    public void inputChanged(Viewer viewer, Object oldInput, Object newInput);
	}
	
	public interface IStructuredContentProvider extends IContentProvider 
	{
	   // Get all elements to display from inputElement
	    public Object[] getElements(Object inputElement);
	}

	public interface ITreeContentProvider extends IStructuredContentProvider {

	    public Object[] getChildren(Object parentElement);
	    public Object getParent(Object element);
	    public boolean hasChildren(Object element);
	}
	
	
	public class MyProvider extends LabelProvider
	{
		public Image getImage(Object element) { return null;	}
		
		public String getText(Object element) { return super.getText(element); }
	}
	
	
	public interface IColorProvider
	{
		 Color getForeground(Object element);

		 Color getBackground(Object element);
	}
	
	public interface IFontProvider 
	{
	    public Font getFont(Object element);
	}
}


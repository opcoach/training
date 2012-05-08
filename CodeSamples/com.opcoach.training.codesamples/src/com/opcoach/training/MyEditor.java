package com.opcoach.training;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public class MyEditor extends EditorPart
{
	public void init(IEditorSite site, IEditorInput input) throws PartInitException 
	{
		setSite(site);
	    setInput(input);
	}

	public void doSave(IProgressMonitor monitor)  {  }

	public void doSaveAs()  { }

	public void setFocus() 	{	}

	public boolean isDirty()            { return false;	}

	public boolean isSaveAsAllowed() 	{ return false;	}
	
	@Override
	public void createPartControl(Composite parent)
	{
		// Editor contents...
	}


	public Object getAdapter(Class adapter)
	{
		if (adapter.equals(IContentOutlinePage.class))
		{
			IEditorInput input = getEditorInput();
			if (input instanceof IFileEditorInput)
			{
				IFileEditorInput finput = (IFileEditorInput) input;
				return new MyEditorContentOutlinePage(finput.getFile());
			}
		}
		return null;
	}


 
} 

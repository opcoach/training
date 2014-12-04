package com.opcoach.rental.forms.rcp.editors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class EObjectEditorInput implements IEditorInput
{
	private EObject obj;

	public EObjectEditorInput(EObject obj)
	{
		super();
		this.obj = obj;
	}
	
	public EObject getEObject()
	{
		return obj;
	}

	@Override
	public Object getAdapter(Class adapter)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists()
	{
		return (obj != null);
	}

	@Override
	public ImageDescriptor getImageDescriptor()
	{
		return null;  // No image
	}

	@Override
	public String getName()
	{
		return obj.toString();
	}

	@Override
	public IPersistableElement getPersistable()
	{
		return null;
	}

	@Override
	public String getToolTipText()
	{
		return obj.toString();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if ((obj == null) || (! (obj instanceof EObjectEditorInput)))
			return false;
		
		return obj == ((EObjectEditorInput) obj).getEObject();
	}

	
}

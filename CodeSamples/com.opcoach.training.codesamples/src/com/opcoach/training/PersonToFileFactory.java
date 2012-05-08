package com.opcoach.training;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Path;

public class PersonToFileFactory implements IAdapterFactory
{

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType)
	{
		if (adaptableObject == null)
			return null;
		
		IResource result = null;
		 if ((adaptableObject != null) && (adapterType == IResource.class))
		 {
			 Person perso = (Person) adaptableObject;
			 IWorkspace ws = ResourcesPlugin.getWorkspace();
			 IWorkspaceRoot wsroot = ws.getRoot();
			 Path path = new Path("myProject.person/Persons"+perso.getName());
			 result = wsroot.getFile(path);
		 }
		 return result;		 
	}

	@Override
	public Class[] getAdapterList()
	{
		// TODO Auto-generated method stub
		return new Class[] { IResource.class};
	}

}

package com.opcoach.training;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;

public class AdaptableIntoResource implements IAdaptable
{
	private String name;

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter)
	{
		T result = null;
		if (adapter == IResource.class)
		{
			IWorkspaceRoot wsroot = ResourcesPlugin.getWorkspace().getRoot();
			Path path = new Path("myProject/folder/" + name);
			result = (T) wsroot.getFile(path);
		}
		return result;
	}
}

class OtherClass{
	public IFile createAFile()
	{
		IWorkspaceRoot wsroot = ResourcesPlugin.getWorkspace().getRoot();
		Path path = new Path("myProject/folder1/folder2/filename.txt");
		return wsroot.getFile(path);
	}
	
	public void useAdapter()
	{
		AdaptableIntoResource air = new AdaptableIntoResource();
		IResource r = air.getAdapter(IResource.class);
	}

}

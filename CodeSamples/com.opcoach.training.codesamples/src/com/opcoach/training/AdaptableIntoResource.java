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

	@Override
	public Object getAdapter(Class adapter)
	{
		Object result = null;
		if (IResource.class.equals(adapter))
		{
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot wsroot = ws.getRoot();
			Path path = new Path("myProject/dossier" + name);
			result = wsroot.getFile(path);
		}
		return result;
	}

	public IFile createAFile()
	{
		IWorkspaceRoot wsroot = ResourcesPlugin.getWorkspace().getRoot();
		Path path = new Path("myProject/folder1/folder2/filename.txt");
		return wsroot.getFile(path);
	}
}

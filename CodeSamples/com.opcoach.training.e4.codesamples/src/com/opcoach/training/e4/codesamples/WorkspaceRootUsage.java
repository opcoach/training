package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.Path;

public class WorkspaceRootUsage
{

	
	@Inject
	public IFile createAFile(IWorkspaceRoot wsroot)
	{
		Path path = new Path("myProject/folder1/folder2/filename.txt");
		return wsroot.getFile(path);
	}
	

}

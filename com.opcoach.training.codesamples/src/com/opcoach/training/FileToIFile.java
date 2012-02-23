package com.opcoach.training;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class FileToIFile
{

	
	 public IFile getIFileFromFile(File f)
	 {
		 IWorkspace ws = ResourcesPlugin.getWorkspace();
		 IPath  iloc = Path.fromOSString(f.getAbsolutePath());
		 return ws.getRoot().getFileForLocation(iloc);
	 }
}

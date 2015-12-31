package com.opcoach.training;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;

public class AdaptableUsage
{
	 public void reactOnAdaptableResource(Object o)
	 {
		 IResource r = Platform.getAdapterManager().getAdapter(o, IResource.class);
		 if (r != null)
		 {
			 // Work with the resource
		 }
	 }
}

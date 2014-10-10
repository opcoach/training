package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class ImageRegistryAccess extends LabelProvider implements MyPrefConstants 
{

	@Inject @Named(RENTAL_UI_IMG_REGISTRY)
	private ImageRegistry registry;
	
	@Override
	public Image getImage(Object element)
	{
		if (element instanceof Customer)
			return registry.get(IMG_CUSTOMER);
		return null;
	}

}

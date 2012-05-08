package com.opcoach.training;

import java.awt.Image;
import java.lang.ref.SoftReference;

public class Tile
{
	private SoftReference<Image>	image	= new SoftReference<Image>(null);

	public Image getImage()
	{
		Image tileImage = image.get();
		if (tileImage == null)
		{
			// start asynchronous stuff to load tileImage;
		}
		return tileImage;
	}
	// stuff with loaded image...
}
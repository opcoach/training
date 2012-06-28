package com.opcoach.training.rental.ui;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Color;

/** A Palette object to store extension of palette */
public class Palette implements IColorProvider {

	private String id;
	private String name;
	// Delegated colorprovider
	private IColorProvider colorProvider;

	public void setColorProvider(IColorProvider colorProvider) {
		this.colorProvider = colorProvider;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Palette(String id) {
		super();
		this.id = id;
	}

	@Override
	public Color getForeground(Object element) {
		return colorProvider.getForeground(element);
	}

	@Override
	public Color getBackground(Object element) {
		// TODO Auto-generated method stub
		return colorProvider.getBackground(element);
	}

}

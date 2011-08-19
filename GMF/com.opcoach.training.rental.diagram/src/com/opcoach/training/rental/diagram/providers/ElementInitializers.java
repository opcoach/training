package com.opcoach.training.rental.diagram.providers;

import com.opcoach.training.rental.diagram.part.RentalDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers
{

	protected ElementInitializers()
	{
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance()
	{
		ElementInitializers cached = RentalDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null)
		{
			RentalDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}

}

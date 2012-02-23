package com.opcoach.training;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory
{

	public static final String ID	= "com.opcoach.training.rental.ui.rentalperspective";

	public void createInitialLayout(IPageLayout layout)
	{
		// Get the ID of editor area.
		String area = layout.getEditorArea();
		
		// Top left: Resource Navigator view and Bookmarks view placeholder
		IFolderLayout topLeft;
		topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f, area);
		topLeft.addView(IPageLayout.ID_PROJECT_EXPLORER);
		
		// Book a location when view will open 
		topLeft.addPlaceholder(IPageLayout.ID_BOOKMARKS);
		
		// Bottom left: Outline view and Property Sheet view
		IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.50f, "topLeft");
		bottomLeft.addView(IPageLayout.ID_OUTLINE);
		bottomLeft.addView(IPageLayout.ID_PROP_SHEET);
		
		// Bottom right: Task List view
		layout.addView(IPageLayout.ID_TASK_LIST, IPageLayout.BOTTOM, 0.66f, area);
	}
}

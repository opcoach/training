package com.opcoach.training.rental.ui.views;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class RentalPerspective implements IPerspectiveFactory
{

	public static final String ID = "com.opcoach.training.rental.ui.rentalperspective";

	public void createInitialLayout(IPageLayout layout)
	{

		// Get the editor area.
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);

		// Top left: Project Explorer view and Bookmarks view placeholder
		IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f, editorArea);
		topLeft.addView(RentalAgencyView.VIEW_ID);
		topLeft.addView(RentalAgencyDashBoard.VIEW_ID);

		// Bottom left: Outline view and Property Sheet view
		IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.50f, "topLeft");
		bottomLeft.addView(CustomerViewPart.ID);
		layout.addView(RentalPropertyView.VIEW_ID, IPageLayout.LEFT, 0.5f, "bottomLeft");

	}
}

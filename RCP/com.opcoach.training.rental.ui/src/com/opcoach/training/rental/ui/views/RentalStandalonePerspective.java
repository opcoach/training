package com.opcoach.training.rental.ui.views;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class RentalStandalonePerspective implements IPerspectiveFactory
{
	public static final String ID = "com.opcoach.training.rental.ui.rentalStandalonePerspective";

	public void createInitialLayout(IPageLayout layout)
	{
		// A perspective without view tabs.
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		
		layout.addStandaloneView(RentalAgencyView.VIEW_ID, false, IPageLayout.TOP, 0.7f, editorArea);
		layout.addStandaloneView(RentalPropertyView.VIEW_ID, false, IPageLayout.BOTTOM, 0.3f, editorArea);
	
	}
}

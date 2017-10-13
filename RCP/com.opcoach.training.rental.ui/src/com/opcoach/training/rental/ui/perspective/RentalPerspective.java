package com.opcoach.training.rental.ui.perspective;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class RentalPerspective implements IPerspectiveFactory
{

	/**
	 * Creates the initial layout for a page.
	 */
	public void createInitialLayout(IPageLayout layout)
	{
		layout.setEditorAreaVisible(false);
		String editorArea = layout.getEditorArea();
		addFastViews(layout);
		addViewShortcuts(layout);
		addPerspectiveShortcuts(layout);
		layout.addView("com.opcoach.rcpa.rental.ui.agencyformview", IPageLayout.LEFT, 0.5f, IPageLayout.ID_EDITOR_AREA);
		layout.addView("com.opcoach.rental.ui.views.rentalView", IPageLayout.LEFT, 0.5f, IPageLayout.ID_EDITOR_AREA);
	}

	/**
	 * Add fast views to the perspective.
	 */
	private void addFastViews(IPageLayout layout)
	{
		layout.addFastView("org.eclipse.ui.views.ProgressView");
	}

	/**
	 * Add view shortcuts to the perspective.
	 */
	private void addViewShortcuts(IPageLayout layout)
	{
		layout.addShowViewShortcut("org.eclipse.gef.ui.palette_view");
	}

	/**
	 * Add perspective shortcuts to the perspective.
	 */
	private void addPerspectiveShortcuts(IPageLayout layout)
	{
	}

}

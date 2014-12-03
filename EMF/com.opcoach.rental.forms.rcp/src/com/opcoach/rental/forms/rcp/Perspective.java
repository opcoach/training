package com.opcoach.rental.forms.rcp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addView("com.opcoach.rental.forms.rcp.agencyView", IPageLayout.LEFT, 0.5f, IPageLayout.ID_EDITOR_AREA);
		layout.addView("com.opcoach.rental.forms.rcp.emfformView", IPageLayout.RIGHT, 0.5f, IPageLayout.ID_EDITOR_AREA);
	}
}

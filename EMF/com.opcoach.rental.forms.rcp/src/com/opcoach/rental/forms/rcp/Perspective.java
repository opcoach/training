package com.opcoach.rental.forms.rcp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.PlatformUI;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {

		layout.addView("com.opcoach.rental.forms.rcp.agencyView", IPageLayout.LEFT, 0.5f, IPageLayout.ID_EDITOR_AREA);
	
	
	
	}
}

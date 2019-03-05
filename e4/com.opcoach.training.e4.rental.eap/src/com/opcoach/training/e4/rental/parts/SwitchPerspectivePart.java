
package com.opcoach.training.e4.rental.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.e4.rental.ui.RentalUIConstants;

/**
 * This part is only used to directly switch to the snippet perspective provided
 * in plugins
 */
public class SwitchPerspectivePart
{

	private static final String PERS_STACK = "com.opcoach.training.e4.rental.eap.perspectiveStack";

	/** The postConstruct does not create any widget. It only switch to expected perspective */
	@PostConstruct
	public void switchToStartPerspective(Composite parent, EPartService ps, MPart part, 
			                  EModelService ms, MApplication appli)
	{
		// get current window of current MPart
		MWindow refWin = ms.getTopLevelWindowFor(part);
		
		// Suppose perspective is in a snippet. Must clone it 
		MPerspective p = (MPerspective) ms.cloneSnippet(appli, RentalUIConstants.RENTAL_UI_PERSPECTIVE, refWin);

		// Add this perspective in  the perspective Stack 
		MPerspectiveStack pstack = (MPerspectiveStack) ms.find(PERS_STACK, appli);
		pstack.getChildren().add(p);

		// Can now switch to this perspectives
		ps.switchPerspective(p);

	}

}
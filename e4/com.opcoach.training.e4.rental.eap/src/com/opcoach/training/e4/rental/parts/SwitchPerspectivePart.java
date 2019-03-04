 
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

 /** This part is only used to directly switch to the snippet perspective provided in plugins */
public class SwitchPerspectivePart {

	@PostConstruct
	public void postConstruct(Composite parent, EPartService ps, MPart part, EModelService ms, MApplication appli) {
		
				MWindow refWin = ms.getTopLevelWindowFor(part);
				
				MPerspective p = (MPerspective) ms.cloneSnippet(appli, RentalUIConstants.RENTAL_UI_PERSPECTIVE, refWin);
			
				MPerspectiveStack pstack = (MPerspectiveStack) ms.find("com.opcoach.training.e4.rental.eap.perspectiveStack", appli);
				pstack.getChildren().add(p);
				
				ps.switchPerspective(p);

	}
	
	
	
	
}
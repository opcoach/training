 
package com.opcoach.training.e4.rental.ui.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.ui.IPageLayout;

public class MyE4Handler {
	@Execute
	public void execute(IWorkbench wb, EPartService ps) {
		
		System.out.println("On est dans le MyE4Handler et on monte la resource nav");
		ps.showPart("org.eclipse.ui.views.ResourceNavigator", PartState.ACTIVATE);
		
	}
	
	
	@CanExecute
	public boolean canExecute() {
		return true;
	}
		
}
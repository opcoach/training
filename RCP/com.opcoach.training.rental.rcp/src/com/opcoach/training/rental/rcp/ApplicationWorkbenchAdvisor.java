// ------------------------------------------------
// OPCoach Training Projects
// � OPCoach 2010 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.rcp;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.opcoach.training.rental.ui.views.RentalPerspective;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor
{

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer)
	{
		return new ApplicationWorkbenchWindowAdvisor(configurer);
	}

	public String getInitialWindowPerspectiveId()
	{
		return RentalPerspective.ID;
	}
}

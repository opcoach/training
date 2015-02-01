package com.opcoach.training.e4.rental.ui.e3bridge;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.internal.workbench.WorkbenchLogger;
import org.eclipse.e4.ui.model.application.MAddon;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

import com.opcoach.training.e4.rental.ui.RentalAddon;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;

public class RentalProcessor
{

	
	
	@Execute
	public void startRentalE4Feature(MApplication appli, EModelService ms, IEclipseContext ctx)
	{
		 System.out.println("Initialize Rental Addon via processor ");
		ctx.set(Logger.class, new WorkbenchLogger(RentalUIConstants.PLUGIN_ID));
		
		MAddon maddon = ms.createModelElement(MAddon.class);
		
		RentalAddon addon = ContextInjectionFactory.make(RentalAddon.class, ctx);
		maddon.setObject(addon);
		appli.getAddons().add(maddon);
	}

}

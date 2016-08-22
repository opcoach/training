/*******************************************************************************
 * Copyright (c) 2014 OPCoach.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Olivier Prouvost <olivier.prouvost@opcoach.com> - initial API and implementation
 *     Olivier Prouvost <olivier.prouvost@opcoach.com> - Bug 428903 - Having a common 'debug' window for all spies
 *     Olivier Prouvost <olivier.prouvost@opcoach.com> - Bug 482250 - Add a menu 'E4 Spies' to access to the spies
 *******************************************************************************/
package com.opcoach.training.e4.codesamples;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.osgi.framework.FrameworkUtil;

/** A sample E4 processor adding a command in application  */
public class SampleE4Processor
{

	@Execute
	public void process(MApplication application, EModelService modelService)
	{
		// Just create a command and add it in the application
		MCommand command = modelService.createModelElement(MCommand.class);
		command.setElementId("id.of.my.command");
		command.setCommandName("Launch My Commad");
		String contributorURI = "platform:/plugin/" + FrameworkUtil.getBundle(getClass()).getSymbolicName();
		command.setContributorURI(contributorURI);
		command.setDescription("A sample command added in application");

		application.getCommands().add(command);

	}
}

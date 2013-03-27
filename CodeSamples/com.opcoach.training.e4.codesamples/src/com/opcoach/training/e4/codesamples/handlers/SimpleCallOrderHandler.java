/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.opcoach.training.e4.codesamples.handlers;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

import com.opcoach.training.e4.codesamples.inject.SimpleCallOrder;

public class SimpleCallOrderHandler
{

	@Execute
	public void execute(IEclipseContext ctx)
	{
		System.out.println("---> Create the object using ContextInjectionFactory : ");
		ContextInjectionFactory.make(SimpleCallOrder.class, ctx);

		System.out.println("---> Change the parameter used by SimpleCallOrder");
		ctx.set(SimpleCallOrder.MYPARAM, "value 2");

	}

	@CanExecute
	public boolean canExecute()
	{
		return true;
	}
}





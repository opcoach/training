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

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;

import com.opcoach.training.e4.codesamples.inject.Child;
import com.opcoach.training.e4.codesamples.inject.Parent;



public class FullCallOrderHandler {
	@Execute
	public void execute(IEclipseContext ctx) {
		
		   System.out.println("--------------------------------------------");
		   System.out.println("--    Step 1 : create the ChildCallOrder ---");
		   System.out.println("--------------------------------------------");
		   ContextInjectionFactory.make(Child.class, ctx);
		
		   System.out.println("---------------------------------------------------");
		   System.out.println("-- Step 2 : change the parameter used by parent ---");
		   System.out.println("---------------------------------------------------");
		   ctx.set(Parent.PARAM_IN_PARENT, "new value for parent parameter");
		
		   System.out.println("--------------------------------------------------");
		   System.out.println("-- Step 3 : change the parameter used by child ---");
		   System.out.println("--------------------------------------------------");
		   ctx.set(Child.PARAM_IN_CHILD, "new value for child parameter");
		

	}
	
	@CanExecute
	public boolean canExecute() { return true; }
	
	@Inject
	public void traceChildUpdate(@Optional Child currentChild)
	{
		System.out.println("Child value is : " + currentChild);
	}
}

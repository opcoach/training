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

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.internal.contexts.EclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class DisplayContextsHandler
{
	@Execute
	public void execute(IEclipseContext ctx, MApplication appli)
	{

		System.out.println("--------------------------------------------");
		System.out.println("--    Display the context of the Handler ---");
		System.out.println("--------------------------------------------");
		displayContextUp(ctx, "");

		System.out.println("------------------------------------------------------");
		System.out.println("--   Display the top context  ---");
		System.out.println("------------------------------------------------------");
		displayContextDown(appli.getContext().getParent(), "");

		System.out.println("------------------------------------------------------");
		System.out.println("--   Display then content of top context  ---");
		System.out.println("------------------------------------------------------");
		displayContextContent(appli.getContext().getParent(), "");

	}

	@CanExecute
	public boolean canExecute()
	{
		return true;
	}

	public void displayContextDown(IEclipseContext ctx, String indent)
	{
		EclipseContext ct = (EclipseContext) ctx;

		System.out.println(indent + "Context is : " + ctx);
		System.out.println(indent + "Parent is : " + ctx.getParent());
		System.out.println(indent + "Content is : ");
		displayContextContent(ctx, indent + "     " );
		
		System.out.println(indent + "Children contexts : ");
		for (IEclipseContext c : ct.getChildren())
		{
			displayContextDown(c, indent + "   ");
		}

	}

	public void displayContextUp(IEclipseContext ctx, String indent)
	{

		System.out.println(indent + "Contexte is : " + ctx);
		if (ctx.getParent() == null)
			System.out.println(indent + "Parent context : NULL ");
		else
		{
			System.out.println(indent + "Parent context : ");
			displayContextUp(ctx.getParent(), indent + "   ");
		}

	}
	
	public void displayContextContent(IEclipseContext ctx, String indent)
	{
		EclipseContext ct = (EclipseContext) ctx;
		
		System.out.println(indent + "Content for context : " + ct);
		for (String k : ct.localData().keySet())
			System.out.println(indent + "Key = " + k + " Value = " + ct.localData().get(k));
		
	}
}

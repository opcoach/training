package com.opcoach.training.rental.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;


public class PasteCustomer extends AbstractHandler implements IHandler
{



	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		// TODO Auto-generated method stub
		System.out.println("Je paste un customer");
		return null;
	}

}

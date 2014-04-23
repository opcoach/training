package com.opcoach.training.rental.acceleo.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.acceleo.main.GenerateHtml;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class GenerateHtmlHandler extends AbstractHandler
{
	/**
	 * The constructor.
	 */
	public GenerateHtmlHandler()
	{
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException
	{

		ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof IStructuredSelection)
		{
			IStructuredSelection isel = (IStructuredSelection) sel;
			Object selected = isel.getFirstElement();
			if (selected instanceof RentalAgency)
			{
				RentalAgency a = (RentalAgency) selected;

				File targetFolder = new File("/tmp");
				try
				{
					GenerateHtml gen = new GenerateHtml(a, targetFolder, Collections.EMPTY_LIST);
					gen.doGenerate(new BasicMonitor());
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}

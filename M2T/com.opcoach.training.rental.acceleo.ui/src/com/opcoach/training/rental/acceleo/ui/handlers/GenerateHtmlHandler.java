package com.opcoach.training.rental.acceleo.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.acceleo.main.GenerateHtml;

/**
 * E4 Handler code to call the acceleo generator
 */
public class GenerateHtmlHandler
{
	/** This method is called by the framework which inject the expected values
	 * @param isel : the current selection received as an IStructuredSelection (E3 side) */
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection isel) 
	{
			Object selected = isel.getFirstElement();
			if (selected instanceof RentalAgency)
				executeForAgency((RentalAgency) selected);	
	}
	
	/** This method is called locally or by the framework which inject the expected values
	 * @param a : the current selection  received as an RentalAgency (E4 side) */
	@Execute
	public void executeForAgency(@Named(IServiceConstants.ACTIVE_SELECTION) RentalAgency a) 
	{
		File targetFolder = new File("/tmp");
		try
		{
			GenerateHtml gen = new GenerateHtml(a, targetFolder, Collections.emptyList());
			gen.doGenerate(new BasicMonitor());
			System.out.println("File generated in : /tmp");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

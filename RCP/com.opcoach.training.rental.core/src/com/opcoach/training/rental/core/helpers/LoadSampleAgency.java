// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.core.helpers;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

/**
 * @author olivier
 */
public class LoadSampleAgency
{
	public static void main(String[] args) throws IOException
	{
		ResourceSet rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
	    
		Resource res = rset.getResource(URI.createFileURI("sampleAgency.xml"), true);
		RentalAgency agency = (RentalAgency) res.getContents().get(0);
		for (Rental r : agency.getRentals())
		{
			System.out.println("Location de " + r.getRentedObject().getName() + " ˆ " + r.getCustomer().getDisplayName());
		}
	}
}

// ------------------------------------------------
// OPCoach Training Projects
// � OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.helpers;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.Rental;

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
		MyRentalAgency agency = (MyRentalAgency) res.getContents().get(0);
		for (Rental r : agency.getRentals())
		{
			System.out.println("Location de " + r.getRentedObject().getName() + " � " + r.getCustomer().getName());
		}
	}
}

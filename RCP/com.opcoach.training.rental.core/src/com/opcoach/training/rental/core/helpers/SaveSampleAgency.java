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

import com.opcoach.training.rental.MyRentalAgency;

/**
 * @author olivier
 */
public class SaveSampleAgency
{
	public static void main(String[] args) throws IOException
	{
		// Store a sample Rental.
		MyRentalAgency agency = RentalAgencyGenerator.createSampleAgency();

		ResourceSet rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());

		Resource res = rset.createResource(URI.createFileURI("sampleAgency.xml"));
		res.getContents().add(agency);

		res.save(null);

	}
	
}

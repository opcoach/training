// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.helpers;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalPackage;

/**
 * @author olivier
 */
public class DisplayPackageName
{
	public static void main(String[] args) throws IOException
	{
		// Initialize package for reading.
		EPackage p = RentalPackage.eINSTANCE;

		ResourceSet rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
	    
		Resource res = rset.getResource(URI.createFileURI("sampleAgency.xml"), true);
		EObject eo = (RentalAgency) res.getContents().get(0);
		
		System.out.println("Package de eo " + eo.eClass().getClassifierID());
		EPackage p2 = (EPackage) eo.eClass().eContainer();
		System.out.println("Package de eo " + p2.getNsURI());
		for (EObject sf : eo.eClass().eContents())
		    System.out.println("Structure de eo :  " + sf.toString());
				
	}
}

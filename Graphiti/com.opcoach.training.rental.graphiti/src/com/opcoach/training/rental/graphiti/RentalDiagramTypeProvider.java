package com.opcoach.training.rental.graphiti;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalFactory;
import com.opcoach.training.rental.graphiti.features.RentalFeatureProvider;

public class RentalDiagramTypeProvider extends AbstractDiagramTypeProvider
{

	private IToolBehaviorProvider[] toolsProviders;

	public RentalDiagramTypeProvider()
	{
		super();
		setFeatureProvider(new RentalFeatureProvider(this));

	}

	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders()
	{
		if (toolsProviders == null)
		{
			toolsProviders = new IToolBehaviorProvider[] { new RentalToolBehaviorProvider(this) };
		}
		return toolsProviders;
	}

	private RentalAgency agency = null;

	public RentalAgency getAgency()
	{
		if (agency != null)
			return agency;
		
		// Search for agency as a business object for the diagram component.
		agency = (RentalAgency) getFeatureProvider().getBusinessObjectForPictogramElement(getDiagram());

		if (agency == null)
		{
			// This is the first time we need an agency,
			// we must create one and associate it to the diagram
			agency = RentalFactory.eINSTANCE.createRentalAgency();
			agency.setName("Root Agency");

			// And store this agency in a separate Resource using the
			// saveToModelFile
			saveToModelFile(agency, getDiagram());

			// Bind agency to diagram
			getFeatureProvider().link(getDiagram(), agency);
		}
		return agency;
	}

	/**
	 * This method is a copy of the method of TutorialUtil, but the extension
	 * changed from model to rental
	 */
	public static void saveToModelFile(final EObject obj, final Diagram d)
	{
		try
		{
			URI uri = d.eResource().getURI();
			uri = uri.trimFragment();
			uri = uri.trimFileExtension();
			String packageName = obj.eClass().getEPackage().getName();
			uri = uri.appendFileExtension(packageName); // Get package name
														// from rental.
			ResourceSet rSet = d.eResource().getResourceSet();
			final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			IResource file = workspaceRoot.findMember(uri.toPlatformString(true));
			if (file == null || !file.exists())
			{
				Resource createResource = rSet.createResource(uri);
				createResource.save(Collections.emptyMap());
				createResource.setTrackingModification(true);
			}
			final Resource resource = rSet.getResource(uri, true);
			resource.getContents().add(obj);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}

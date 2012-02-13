package com.opcoach.training.diagram.editor;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.training.diagram.Diagram;
import com.opcoach.training.diagram.DiagramElement;
import com.opcoach.training.diagram.DiagramFactory;

public class CreateDiagramHandler extends AbstractHandler
{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{

		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection)
		{
			Object selectedObject = ((IStructuredSelection) currentSelection).getFirstElement();
			if (selectedObject instanceof IFile)
			{
				EObject element = null;
				ResourceSet rs = new ResourceSetImpl();

				final IFile file = (IFile) selectedObject;
				final URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
				String ext = file.getFileExtension();
				// resource with respect to EMF model
				try
				{
					Resource resource = rs.getResource(uri, true);
					element = resource.getContents().get(0);

				} catch (Exception e)
				{
					DiagramCoreActivator.log("Unable to open file : " + uri + ". Will use the default object", IStatus.ERROR);
					e.printStackTrace();
				}

				// On peut creer le diagramme et le sauver
				Diagram diagram = DiagramFactory.eINSTANCE.createDiagram();
				diagram.setContent(element);
			

				String diagname = uri.toString() + ".diagram";
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ext + "diagram", new XMIResourceFactoryImpl());

				URI destURI = URI.createURI(diagname);
				Resource res = rs.createResource(destURI);
				res.getContents().add(diagram);

				try
				{
					res.save(null);
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

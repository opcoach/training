// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.diagram.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.opcoach.training.diagram.Diagram;
import com.opcoach.training.diagram.DiagramElement;

/**
 * @author olivier
 * 
 */
public class DiagramEditPartFactory implements EditPartFactory
{
	/** The model edit partfactory, which creates Editpart for the model */
	private EditPartFactory modelEditPartFactory = null;

	/** Store the diagram currently edited */
	private Diagram diagram = null;

	public DiagramEditPartFactory(EditPartFactory modelEditPartFactory)
	{
		super();
		this.modelEditPartFactory = modelEditPartFactory;
	}

	public EditPart createEditPart(EditPart context, Object model)
	{
		EditPart part = null;
		EObject objectModel = null;
		if (model instanceof Diagram)
			objectModel = ((Diagram) model).getContent();
		else if (model instanceof DiagramElement)
			objectModel = ((DiagramElement) model).getModel();
		else
		{
			System.out.println("Type d'objet reçu dans la factory diagram : " + model.getClass().getName());
		}

		if (objectModel != null)
		{
			AbstractGraphicalEditPart subPart = (AbstractGraphicalEditPart) modelEditPartFactory.createEditPart(context, objectModel);
			part = new DiagramElementEditPart(subPart);
			part.setModel(model);
		}
		
		return part;

	}

}

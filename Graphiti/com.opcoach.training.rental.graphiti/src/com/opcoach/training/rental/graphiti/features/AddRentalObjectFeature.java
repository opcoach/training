package com.opcoach.training.rental.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import com.opcoach.training.rental.RentalObject;

public class AddRentalObjectFeature extends AbstractAddShapeFeature
{

	private static final IColorConstant CLASS_TEXT_FOREGROUND = new ColorConstant(51, 51, 153);

	private static final IColorConstant CLASS_FOREGROUND = new ColorConstant(0,0, 0);

	private static final IColorConstant CLASS_BACKGROUND = new ColorConstant(0,240,100);

	public AddRentalObjectFeature(IFeatureProvider fp)
	{
		super(fp);
	}

	public boolean canAdd(IAddContext context)
	{
		// check if user wants to add a EClass
		if (context.getNewObject() instanceof RentalObject)
		{
			// check if user wants to add to a diagram
			if (context.getTargetContainer() instanceof Diagram)
			{
				return true;
			}
		}
		return false;
	}

	public PictogramElement add(IAddContext context)
	{
		RentalObject addedRentalObject = (RentalObject) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);

		// define a default size for the shape
		int width = 100;
		int height = 50;
		IGaService gaService = Graphiti.getGaService();

		{
			// create and set graphics algorithm
			Rectangle roRectangle= gaService.createRectangle(containerShape);
			roRectangle.setWidth(width);
			roRectangle.setHeight(height);
			roRectangle.setForeground(manageColor(CLASS_FOREGROUND));
			roRectangle.setBackground(manageColor(CLASS_BACKGROUND));
			roRectangle.setLineWidth(2);
			gaService.setLocationAndSize(roRectangle, context.getX(), context.getY(), width, height);

			// if added Class has no resource we add it to the resource
			// of the diagram
			// in a real scenario the business model would have its own resource
			if (addedRentalObject.eResource() == null)
			{
				getDiagram().eResource().getContents().add(addedRentalObject);
			}
			// create link and wire it
			link(containerShape, addedRentalObject);
		}


		// SHAPE WITH TEXT
		{
			// create shape for text
			Shape shape = peCreateService.createShape(containerShape, false);

			// create and set text graphics algorithm
			Text text = gaService.createDefaultText(getDiagram(), shape, addedRentalObject.getName());
			text.setForeground(manageColor(CLASS_TEXT_FOREGROUND));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			text.getFont().setBold(true);
			gaService.setLocationAndSize(text, 0, 0, width, 20);

			// create link and wire it
			link(shape, addedRentalObject);
		}

		
		 // add a chopbox anchor to the shape
        peCreateService.createChopboxAnchor(containerShape);
  
        // call the layout feature
        layoutPictogramElement(containerShape);
		return containerShape;
	}
}

package com.opcoach.training.rental.graphiti.features;

import org.eclipse.graphiti.examples.common.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import com.opcoach.training.rental.RentalFactory;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.graphiti.RentalDiagramTypeProvider;

public class CreateRentalObjectFeature extends AbstractCreateFeature
{

	 public CreateRentalObjectFeature(IFeatureProvider fp) {
	        // set name and description of the creation feature
	        super(fp, "Rental Object", "Create Rental Object");
	    }
	
	@Override
	public boolean canCreate(ICreateContext context)
	{
		return context.getTargetContainer() instanceof Diagram;

	}

	@Override
	public Object[] create(ICreateContext context)
	{

        // ask user for EClass name
        String roName = ExampleUtil.askString("Rental Object name", "Nom de l'objet ˆ louer ?", "");
        if (roName == null || roName.trim().length() == 0) {
            return EMPTY;
        }
 
        // create RentalObject
        RentalObject newRo = RentalFactory.eINSTANCE.createRentalObject ();
        // Add model element to resource.
        // We add the model element to the resource of the diagram for
        // simplicity's sake. Normally, a customer would use its own
        // model persistence layer for storing the business model separately.
        //getDiagram().eResource().getContents().add(newRo);
        newRo.setName(roName);
        
		//Add the customer in agency.
		((RentalDiagramTypeProvider)getFeatureProvider().getDiagramTypeProvider()).getAgency().getObjectsToRent().add(newRo);

		
 
        // do the add
        addGraphicalRepresentation(context, newRo);
 
        // return newly created business object(s)
        return new Object[] { newRo };
	}

}

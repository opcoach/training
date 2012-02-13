// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef.diagram;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;

import com.opcoach.training.diagram.editor.DiagramEditor;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.core.helpers.RentalAgencyGenerator;
import com.opcoach.training.rental.provider.RentalItemProviderAdapterFactory;


/**
 * @author olivier
 * 
 */
public class RentalDiagramEditor extends DiagramEditor
{

	// INIT EN DUR... CODE A VIRER ENSUITE
	static 
	{
		DiagramEditor.initEObject(RentalAgencyGenerator.createSampleAgency());
	}
	
	
	
	
	@Override
	protected EditPartFactory getModelEditPartFactory()
	{
		return new RentalEditPartFactory();
	}

	@Override
	protected String getDiagramFileExtension()
	{
		return "rental_diagram";
	}
	
	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getPaletteRoot
	 * ()
	 */
	@Override
	protected PaletteRoot getPaletteRoot()
	{
		PaletteRoot palette = new PaletteRoot();

		PaletteGroup group1 = new PaletteGroup("Groupe 1");
		ToolEntry selTool = new PanningSelectionToolEntry();
		group1.add(selTool);

		PaletteGroup group2 = new PaletteGroup("Groupe 2");
		RentalCreationFactory rf = new RentalCreationFactory(Customer.class);
		PaletteEntry custTool = new CreationToolEntry("Customer", "Création du client",rf,null,null);
		group2.add(custTool);

		rf = new RentalCreationFactory(RentalObject.class);
		PaletteEntry objTool = new CreationToolEntry("Rental Object", "Création de l'objet",rf,null, null);
		group2.add(objTool);

		rf = new RentalCreationFactory(Rental.class);
		PaletteEntry rentalTool = new CreationToolEntry("Rental", "Création d'une location",rf,null,null);
		group2.add(rentalTool);

		palette.setDefaultEntry(selTool);
		palette.add(group1);
		palette.add(group2);
		return palette;
	}

	@Override
	public AdapterFactory getEmfEditAdapterFactory()
	{
		// TODO Auto-generated method stub
		return new RentalItemProviderAdapterFactory();
	}

	@Override
	protected boolean isNode(EObject o)
	{
		// Each object is a node.
		return true;
	}

	@Override
	protected boolean isConnection(EObject o)
	{
		// Nothing is connection
		return false;
	}

	
}

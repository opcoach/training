// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.core.helpers.RentalAgencyGenerator;

/**
 * @author olivier
 * 
 */
public class RentalGraphicalEditor extends GraphicalEditorWithFlyoutPalette
{
	
	public static final String ID = "com.opcoach.training.rental.gef.rental.editor";

	public RentalGraphicalEditor()
	{
		super();
		setEditDomain(new DefaultEditDomain(this));
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
		PaletteEntry custTool = new CreationToolEntry("Customer", "Création de l'objet", new RentalCreationFactory(Customer.class), null,
				null);
		group2.add(custTool);

		PaletteEntry rentalObjectTool = new CreationToolEntry("Rental Object", "Création de l'objet", new RentalCreationFactory(RentalObject.class), null,
				null);
		group2.add(rentalObjectTool);

		PaletteEntry rentalTool = new CreationToolEntry("Rental", "Création de l'objet", new RentalCreationFactory(Rental.class), null,
				null);
		group2.add(rentalTool);

		palette.setDefaultEntry(selTool);
		palette.add(group1);
		palette.add(group2);
		return palette;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#initializeGraphicalViewer()
	 */
	@Override
	protected void initializeGraphicalViewer()
	{
		// element associated to root edit part
		GraphicalViewer viewer = getGraphicalViewer();
       //  viewer.setContents(RentalFactory.eINSTANCE.createRentalAgency());
        viewer.setContents(RentalAgencyGenerator.createSampleAgency());
    }
	
	@Override
	protected void configureGraphicalViewer()
	{
		// TODO Auto-generated method stub
		super.configureGraphicalViewer();

		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setRootEditPart(new ScalableFreeformRootEditPart());
		viewer.setEditPartFactory(new RentalEditPartFactory());
		/*
		 * viewer.setKeyHandler( new
		 * GraphicalViewerKeyHandler(viewer).setParent(getCommonKeyHandler()));
		 * ContextMenuProvider cmProvider = new
		 * ShapesEditorContextMenuProvider(viewer, getActionRegistry());
		 * viewer.setContextMenu(cmProvider); //
		 * getSite().registerContextMenu(cmProvider, viewer);
		 */

	}
	

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.
	 * IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor)
	{
		// TODO Auto-generated method stub

	}

}

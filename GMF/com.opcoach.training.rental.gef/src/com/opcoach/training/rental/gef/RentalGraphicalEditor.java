// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.SimpleFactory;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;

/**
 * @author olivier
 *
 */
public class RentalGraphicalEditor extends GraphicalEditorWithFlyoutPalette
{

	@Override
	protected void configureGraphicalViewer()
	{
		// TODO Auto-generated method stub
		super.configureGraphicalViewer();
		
		GraphicalViewer viewer = getGraphicalViewer();
	    viewer.setRootEditPart(new ScalableRootEditPart());
	 viewer.setEditPartFactory(new RentalPartFactory());
	/*    viewer.setKeyHandler(
	        new GraphicalViewerKeyHandler(viewer).setParent(getCommonKeyHandler()));
	    ContextMenuProvider cmProvider = 
	        new ShapesEditorContextMenuProvider(viewer, getActionRegistry());
	    viewer.setContextMenu(cmProvider);
	   // getSite().registerContextMenu(cmProvider, viewer);
	     */
	   
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getPaletteRoot()
	 */
	@Override
	protected PaletteRoot getPaletteRoot()
	{
	    PaletteRoot palette = new PaletteRoot();

	    PaletteGroup group1 = new PaletteGroup("Groupe 1");
	    ToolEntry selTool = new PanningSelectionToolEntry();
	    group1.add(selTool);
			
	    PaletteGroup group2 = new PaletteGroup("Groupe 2");
	    PaletteEntry objectTool = new CreationToolEntry("Objet", "Création de l'objet", 
	    		          new SimpleFactory(Object.class), null, null);
	    group2.add(objectTool);

	    palette.setDefaultEntry(selTool);
	    palette.add(group1);
	    palette.add(group2);
	    return palette;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor)
	{
		// TODO Auto-generated method stub

	}

}

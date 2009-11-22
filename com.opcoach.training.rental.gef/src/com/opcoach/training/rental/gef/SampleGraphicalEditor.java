// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.SimpleFactory;
import org.eclipse.gef.ui.parts.GraphicalEditorWithPalette;

/**
 * @author olivier
 *
 */
public class SampleGraphicalEditor extends GraphicalEditorWithPalette
{

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithPalette#getPaletteRoot()
	 */
	@Override
	public PaletteRoot getPaletteRoot() {
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
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#initializeGraphicalViewer()
	 */
	@Override
	protected void initializeGraphicalViewer()
	{
		// TODO Auto-generated method stub

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

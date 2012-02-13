package com.opcoach.training.gef.commands;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
/**
 * An implementation of  ChangeBoundsCirleCommand
 * for changing the bounds of the Circle.
 * @see org.eclipse.gef.commands.Command
 * @generated
 */
public class ChangeBoundsCommand extends Command
{
	
	private IFigure figure;
    
    private Rectangle newBounds, oldBounds;
    private AbstractGraphicalEditPart part ;

    /**
     * Constructor
     * 
     * @param element the element to resize
     * @param constraint the new rectangle that contain the figure
     */
    public ChangeBoundsCommand(final AbstractGraphicalEditPart p, final Rectangle constraint)
    {
        super("Move or resize Object");
        figure = p.getFigure();
        part = p;
        oldBounds = figure.getBounds();
        setNewBounds(constraint);
    }

    /**
     * @see org.eclipse.gef.commands.Command#canExecute()
     */
    public boolean canExecute()
    {
    	return figure != null
                && newBounds != null
                && (!(newBounds.equals(figure.getBounds())));
    }

    /**
     * @see org.eclipse.gef.commands.Command#execute()
     */
    public void execute()
    {
        oldBounds = figure.getBounds();
        redo();
    }

    /**
     * @see org.eclipse.gef.commands.Command#redo()
     */
    public void redo()
    {
    	//Rectangle r = new Rectangle()
    	/*Point p = new Point(newLocation.x, newLocation.y);
        figure.setLocation(p);*/
    	figure.setBounds(newBounds);
    	part.refresh();
    }



    private void setNewBounds(final Rectangle r)
    {
        newBounds = r;
    }

    
    /**
     * 
     * @see org.eclipse.gef.commands.Command#undo()
     */
    public void undo()
    {
    	figure.setBounds(oldBounds);
     }
    

}
package com.opcoach.training.gef.commands;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
/**
 * An implementation of  ChangeBoundsCirleCommand
 * for changing the bounds of the Circle.
 * @see org.eclipse.gef.commands.Command
 * @generated
 */
public class ChangeBoundsCommand extends Command
{
	
	private IFigure figure;

    private Point newLocation;
    private Point oldLocation;

    /**
     * Constructor
     * 
     * @param element the element to resize
     * @param constraint the new rectangle that contain the figure
     */
    public ChangeBoundsCommand(final IFigure element, final Rectangle constraint)
    {
        super("Move Object");
        setElement(element);
        setNewLocation(new Point(constraint.x, constraint.y));
    }

    /**
     * @see org.eclipse.gef.commands.Command#canExecute()
     */
    public boolean canExecute()
    {
    	return figure != null
                && newLocation != null
                && (!(newLocation.equals(new Point(getX(), getY()))));
    }

    /**
     * @see org.eclipse.gef.commands.Command#execute()
     */
    public void execute()
    {
    	oldLocation = new Point(getX(), getY());
        redo();
    }

    /**
     * @see org.eclipse.gef.commands.Command#redo()
     */
    public void redo()
    {
    	Point p = new Point(newLocation.x, newLocation.y);
        figure.setLocation(p);
    }

    private void setElement(final IFigure element)
    {
        this.figure = element;
    }

    private void setNewLocation(final Point loc)
    {
        newLocation = loc;
    }

    
    /**
     * 
     * @see org.eclipse.gef.commands.Command#undo()
     */
    public void undo()
    {
    	Point p = new Point(oldLocation.x, oldLocation.y);
    	figure.setLocation(p);
     }
    
    private int getX()
    {
    	return figure.getBounds().x;
    }
    private int getY()
    {
    	return figure.getBounds().y;
    }

}
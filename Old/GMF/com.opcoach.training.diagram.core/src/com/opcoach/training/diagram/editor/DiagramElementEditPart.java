// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.diagram.editor;

import java.util.List;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeListener;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.opcoach.training.diagram.Diagram;
import com.opcoach.training.diagram.DiagramElement;

/**
 * An helper class to manage the activate and refresh of model All edit parts
 * DiagramElement refers to the modelEdit part
 * 
 * @author olivier
 */
public class DiagramElementEditPart extends AbstractGraphicalEditPart implements Adapter, FigureListener
{
	/** The model edit part defining the figure and policies */
	private AbstractGraphicalEditPart modelEditPart = null;

	public DiagramElementEditPart(AbstractGraphicalEditPart modelEditPart)
	{
		super();
		this.modelEditPart = modelEditPart;
		if (!(modelEditPart.getModel() instanceof EObject))
		{
			throw new IllegalArgumentException("The object in model EditPart must be an instanceof EObject");
		}
	}

	/**
	 * @return the modelObject : ie the object without graphical concerns
	 */
	public EObject getModelObject()
	{
		return (EObject) modelEditPart.getModel();
	}
	
	
	@Override
	protected List getModelChildren()
	{
		if (getModel() instanceof Diagram)
		{
			return ((Diagram)getModel()).getElements();
		}
		return super.getModelChildren();
	}

	/* @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#activate() */
	@Override
	public void activate()
	{
		super.activate();
		// Listen to the object model
		getModelObject().eAdapters().add(this);
	}

	/* @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#deactivate() */
	@Override
	public void deactivate()
	{
		super.deactivate();
		// Stop listening to the object model
		getModelObject().eAdapters().remove(this);
	}

	@Override
	public void notifyChanged(Notification notification)
	{
		System.out.println("Received a model change for model object : " + getModelObject().toString());
		switch (notification.getEventType())
		{
		case Notification.ADD:
		case Notification.ADD_MANY:
		case Notification.REMOVE:
		case Notification.REMOVE_MANY:
			refreshChildren();
			break;
		case Notification.SET:
			refreshVisuals();
			break;
		}
	}

	public Object getAdapter(Class adapterClazz)
	{
		Object adapter = null;
		if (adapterClazz.equals(EObject.class))
		{
			adapter = getModelObject();
		} else
		{
			adapter = super.getAdapter(adapterClazz);
		}
		return adapter;
	}

	/**
	 * Returns <code>false</code>
	 * 
	 * @param type
	 *            the type.
	 * @return <code>false</code>
	 */
	public boolean isAdapterForType(Object type)
	{
		return false;
	}

	/**
	 * The last notifier set to this adapter.
	 */
	private Notifier target = null;

	/** Adapter method implementation */
	public Notifier getTarget()
	{
		return target;
	}

	/** Adapter method implementation */
	public void setTarget(Notifier newTarget)
	{
		target = newTarget;
	}

	@Override
	protected void createEditPolicies()
	{

	}

	
	/**
	 * @return
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#getFigure()
	 */
	public IFigure getFigure()
	{
		IFigure result = modelEditPart.getFigure();

		// Set the bounds for the figure (stored in diag elt).
		if (getModel() instanceof DiagramElement)
		{
			DiagramElement de = (DiagramElement) getModel();

			Rectangle r = new Rectangle(de.getX(), de.getY(), de.getW(), de.getH());
			result.setBounds(r);

			// Must listen to the figure bounds modificiation
			result.addFigureListener(this);
		}

		return result;

	}





	/**
	 * @return
	 * @see org.eclipse.gef.editparts.AbstractEditPart#toString()
	 */
	public String toString()
	{
		return "DiagramElementEditPart of " + modelEditPart.toString();
	}



	@Override
	public void figureMoved(IFigure source)
	{
		Rectangle r = source.getBounds();

		System.out.println("Figure has moved to : " + r);
		// Transfer new coordinates in diagram element
		DiagramElement de = (DiagramElement) getModel();
		de.setX(r.x);
		de.setY(r.y);
		de.setW(r.width);
		de.setH(r.height);

	}

	@Override
	protected IFigure createFigure()
	{
		throw new UnsupportedOperationException("createFigure in DiagramElementEditPart should never be called");
	}

}

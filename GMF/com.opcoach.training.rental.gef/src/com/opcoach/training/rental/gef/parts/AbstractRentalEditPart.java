// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.parts;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

/** An helper class to manage the activate and refresh of model
 *  All edit parts must inherits from this one
 *  To react on model changes, reimplements the notifyChanged method
 * @author olivier
 */
public abstract class AbstractRentalEditPart extends AbstractGraphicalEditPart implements Adapter
{

	  /**
	   * The last notifier set to this adapter.
	   */
	  private Notifier target = null;


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#activate()
	 */
	@Override
	public void activate()
	{
		super.activate();
		// Listen to the object model
		((EObject)getModel()).eAdapters().add(this);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#deactivate()
	 */
	@Override
	public void deactivate()
	{
		super.deactivate();
		// Unlisten to the object model
		((EObject)getModel()).eAdapters().remove(this);

	}
	
	public Object getAdapter(Class adapterClazz) {
		Object adapter = null;
		if (adapterClazz.equals(EObject.class)) {
			adapter = getModel();
		}
		else{
			adapter = super.getAdapter(adapterClazz);
		}
		return adapter;
	}


	@Override
	public void notifyChanged(Notification notification)
	{
		System.out.println("Received a model change for model object : " + getModel().toString());
		refreshVisuals();
	}

	

	  /**
	   * Returns <code>false</code>
	   * @param type the type.
	   * @return <code>false</code>
	   */
	  public boolean isAdapterForType(Object type)
	  {
	    return false;
	  }

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


}

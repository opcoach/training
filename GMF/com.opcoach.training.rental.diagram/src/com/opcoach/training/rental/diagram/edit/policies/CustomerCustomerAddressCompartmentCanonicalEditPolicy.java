package com.opcoach.training.rental.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import com.opcoach.training.rental.RentalPackage;
import com.opcoach.training.rental.diagram.edit.parts.Address2EditPart;
import com.opcoach.training.rental.diagram.part.RentalDiagramUpdater;
import com.opcoach.training.rental.diagram.part.RentalNodeDescriptor;
import com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry;

/**
 * @generated
 */
public class CustomerCustomerAddressCompartmentCanonicalEditPolicy extends CanonicalEditPolicy
{

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList()
	{
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = RentalDiagramUpdater.getCustomerCustomerAddressCompartment_7001SemanticChildren(viewObject).iterator(); it.hasNext();)
		{
			result.add(((RentalNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view)
	{
		int visualID = RentalVisualIDRegistry.getVisualID(view);
		switch (visualID)
		{
		case Address2EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement()))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint()
	{
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize()
	{
		if (myFeaturesToSynchronize == null)
		{
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(RentalPackage.eINSTANCE.getCustomer_Address());
		}
		return myFeaturesToSynchronize;
	}

}

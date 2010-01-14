package com.opcoach.training.rental.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import com.opcoach.training.rental.diagram.edit.policies.RentalAgencyCanonicalEditPolicy;
import com.opcoach.training.rental.diagram.edit.policies.RentalAgencyItemSemanticEditPolicy;

/**
 * @generated
 */
public class RentalAgencyEditPart extends DiagramEditPart
{

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Rental"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public RentalAgencyEditPart(View view)
	{
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies()
	{
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RentalAgencyItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new RentalAgencyCanonicalEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}

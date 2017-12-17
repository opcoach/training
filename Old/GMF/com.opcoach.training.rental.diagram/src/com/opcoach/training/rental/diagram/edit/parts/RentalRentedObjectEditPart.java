package com.opcoach.training.rental.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import com.opcoach.training.rental.diagram.edit.policies.RentalRentedObjectItemSemanticEditPolicy;

/**
 * @generated
 */
public class RentalRentedObjectEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart
{

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public RentalRentedObjectEditPart(View view)
	{
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies()
	{
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RentalRentedObjectItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure()
	{
		return new RentalRentedObjectFigure();
	}

	/**
	 * @generated
	 */
	public RentalRentedObjectFigure getPrimaryShape()
	{
		return (RentalRentedObjectFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RentalRentedObjectFigure extends PolylineConnectionEx
	{

		/**
		 * @generated
		 */
		public RentalRentedObjectFigure()
		{
			this.setLineWidth(1);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration()
		{
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(1);
			return df;
		}

	}

}

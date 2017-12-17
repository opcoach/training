package com.opcoach.training.rental.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import com.opcoach.training.rental.diagram.edit.policies.RentalObjectItemSemanticEditPolicy;
import com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry;
import com.opcoach.training.rental.diagram.providers.RentalElementTypes;

/**
 * @generated
 */
public class RentalObjectEditPart extends ShapeNodeEditPart
{

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public RentalObjectEditPart(View view)
	{
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies()
	{
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RentalObjectItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy()
	{
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy()
			{

				protected EditPolicy createChildEditPolicy(EditPart child)
				{
					EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
					if (result == null)
					{
						result = new NonResizableEditPolicy();
					}
					return result;
				}

				protected Command getMoveChildrenCommand(Request request)
				{
					return null;
				}

				protected Command getCreateCommand(CreateRequest request)
				{
					return null;
				}
			};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape()
	{
		return primaryShape = new RentalObjectFigure();
	}

	/**
	 * @generated
	 */
	public RentalObjectFigure getPrimaryShape()
	{
		return (RentalObjectFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart)
	{
		if (childEditPart instanceof RentalObjectNameEditPart)
		{
			((RentalObjectNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureRentalObjectLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart)
	{
		if (childEditPart instanceof RentalObjectNameEditPart)
		{
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index)
	{
		if (addFixedChild(childEditPart))
		{
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart)
	{
		if (removeFixedChild(childEditPart))
		{
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart)
	{
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate()
	{
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure()
	{
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape)
	{
		if (nodeShape.getLayoutManager() == null)
		{
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane()
	{
		if (contentPane != null)
		{
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color)
	{
		if (primaryShape != null)
		{
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color)
	{
		if (primaryShape != null)
		{
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width)
	{
		if (primaryShape instanceof Shape)
		{
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style)
	{
		if (primaryShape instanceof Shape)
		{
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart()
	{
		return getChildBySemanticHint(RentalVisualIDRegistry.getType(RentalObjectNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget()
	{
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RentalElementTypes.RentalRentedObject_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType)
	{
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == RentalElementTypes.RentalRentedObject_4002)
		{
			types.add(RentalElementTypes.Rental_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class RentalObjectFigure extends RoundedRectangle
	{

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRentalObjectLabelFigure;

		/**
		 * @generated
		 */
		public RentalObjectFigure()
		{
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setLineWidth(1);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode()
					.DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents()
		{

			fFigureRentalObjectLabelFigure = new WrappingLabel();
			fFigureRentalObjectLabelFigure.setText("RentalObject");

			this.add(fFigureRentalObjectLabelFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates()
		{
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates)
		{
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRentalObjectLabelFigure()
		{
			return fFigureRentalObjectLabelFigure;
		}

	}

}

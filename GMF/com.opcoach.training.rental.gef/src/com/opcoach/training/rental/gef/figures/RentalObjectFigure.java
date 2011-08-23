// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author olivier
 */
public class RentalObjectFigure extends Figure
{
	// Width and height for figures
	public static final int W = 60;
	public static final int H = 60;
	private static final int H_NAME = 16;
	private Label objectLabel;

	public RentalObjectFigure()
	{
		super();
		setLayoutManager(new XYLayout());
		setSize(W,H);
		objectLabel = new Label();
		objectLabel.setForegroundColor(ColorConstants.darkBlue);
		objectLabel.setBounds(new Rectangle(5,H/2-H_NAME/2,W-10,H_NAME));
		add(objectLabel);
	}

	protected void paintBorder(Graphics graphics)
	{
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.lightBlue);
		graphics.drawOval(getBounds().x, getBounds().y, getBounds().width-1, getBounds().height-1);
		graphics.popState();

	}
	
	
	public void setObjectName(String name)
	{
		objectLabel.setText(name);
	}


	@Override
	protected boolean useLocalCoordinates()
	{
		return true;
	}
	
	
	
}
 
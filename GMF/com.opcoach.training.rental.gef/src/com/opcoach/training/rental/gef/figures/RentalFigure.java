// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author olivier
 */
public class RentalFigure extends Figure
{
	public RentalFigure()
	{
		super();
		setLayoutManager(new XYLayout());
		setSize(50,50);
		RoundedRectangle fils = new RoundedRectangle();
		fils.setBackgroundColor(ColorConstants.orange);
		fils.setBounds(new Rectangle(0,0,getSize().width, getSize().height));
		add(fils);
	}

	protected void paintBorder(Graphics graphics)
	{
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.cyan);
		graphics.drawOval(getBounds());
		graphics.popState();
	}

	
	@Override
	protected boolean useLocalCoordinates()
	{
		return true;
	}
	
}
 
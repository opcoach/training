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
public class RentalObjectFigure extends Figure
{
	public RentalObjectFigure()
	{
		setLayoutManager(new XYLayout());
		RoundedRectangle fils = new RoundedRectangle();
		fils.setBackgroundColor(ColorConstants.orange);
		fils.setBounds(new Rectangle(10, 10, 200, 200));
		add(fils);
	}

	protected void paintBorder(Graphics graphics)
	{
		graphics.pushState();
		graphics.setBackgroundColor(ColorConstants.blue);
		graphics.drawOval(getBounds());
		graphics.popState();
	}

	protected void paintFigure(Graphics graphics)
	{
		graphics.fillGradient(getBounds(), true);
	}
}
 
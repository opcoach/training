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
public class CustomerFigure extends Figure
{
	public CustomerFigure()
	{
		setLayoutManager(new XYLayout());
		RoundedRectangle fils = new RoundedRectangle();
		fils.setBackgroundColor(ColorConstants.blue);
		fils.setBounds(new Rectangle(10, 10, 300, 300));
		add(fils);
	}

	protected void paintBorder(Graphics graphics)
	{
		graphics.pushState();
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.drawOval(getBounds());
		graphics.popState();
	}

	protected void paintFigure(Graphics graphics)
	{
		graphics.fillOval(getBounds());
	}
}
 
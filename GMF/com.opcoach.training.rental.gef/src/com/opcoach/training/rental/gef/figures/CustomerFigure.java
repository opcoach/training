// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author olivier
 */
public class CustomerFigure extends Figure
{

	private String name = "";
	private Ellipse head;
	private Ellipse body; 
	 
	public CustomerFigure(String n)
	{
		super();
		name = n;
		setLayoutManager(new XYLayout());
		setSize(60,75);

		head = new Ellipse();
		head.setBounds(new Rectangle(12, 4, 16,16));
		head.setBackgroundColor(ColorConstants.blue);
		add(head);
		
		body = new Ellipse();
		body.setBounds(new Rectangle(10, 20, 20, 30));
		body.setBackgroundColor(ColorConstants.darkBlue);
		add(body);
		
	}

	protected void paintBorder(Graphics graphics)
	{
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.orange);
		graphics.drawRectangle(getBounds().x, getBounds().y, getBounds().width-1, getBounds().height-1);
		graphics.popState();
	}

	
	protected void paintFigure(Graphics graphics)
	{
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.blue);
		graphics.drawText(name, getBounds().x + 5, getBounds().y + getBounds().height-20);
		graphics.popState();
	}

	
	@Override
	protected boolean useLocalCoordinates()
	{
		return true;
	}
	
	public void setName(String n)
	{
		name = n;
	}
}
 
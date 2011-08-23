// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author olivier
 */
public class CustomerFigure extends Figure
{
	// Width and height for figures
	public static final int W = 90;
	public static final int H = 75;
	
	private static final int W_HEAD = 20;
	private static final int H_HEAD = 20;
	private static final int W_BODY = 25;
	private static final int H_BODY = 30;
	private static final int H_NAME = 18;

	
	private Label name;
	private Ellipse head;
	private Ellipse body; 
	 
	public CustomerFigure(String n)
	{
		super();
		setLayoutManager(new XYLayout());
		setSize(W,H);

		head = new Ellipse();
		head.setBounds(new Rectangle((W-W_HEAD)/2, 4, W_HEAD, H_HEAD));
		head.setBackgroundColor(ColorConstants.blue);
		add(head);
		
		body = new Ellipse();
		body.setBounds(new Rectangle((W-W_BODY)/2, 4+H_HEAD, W_BODY, H_BODY));
		body.setBackgroundColor(ColorConstants.darkBlue);
		add(body);
		
		name = new Label(n);
		name.setBounds(new Rectangle(1, H-H_NAME, W-2, H_NAME));
		name.setForegroundColor(ColorConstants.blue);
		add(name);
		
		
	}

	protected void paintBorder(Graphics graphics)
	{
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawRectangle(getBounds().x, getBounds().y, getBounds().width-1, getBounds().height-1);
		graphics.popState();
	}



	
	@Override
	protected boolean useLocalCoordinates()
	{
		return true;
	}
	
	public void setName(String n)
	{
		name.setText(n);
	}
}
 
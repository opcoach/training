// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.figures;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalObject;

/**
 * @author olivier
 */
public class RentalFigure extends Figure
{
	// Width and height for figures
	public static final int W = 120;
	public static final int H = 40;
	private static final int H_DATE = 16;

	private Label startDate;
	private Label endDate;

	public RentalFigure()
	{
		super();
		setLayoutManager(new XYLayout());
		setSize(W, H);
		RoundedRectangle fils = new RoundedRectangle();
		fils.setBackgroundColor(ColorConstants.lightBlue);
		fils.setBounds(new Rectangle(0, 0, getSize().width, getSize().height));
		add(fils);

		startDate = new Label();
		startDate.setBounds(new Rectangle(1, 1, W - 2, H_DATE));
		add(startDate);
		
		endDate = new Label();
		endDate.setBounds(new Rectangle(1, 2+H_DATE, W - 2, H_DATE));
		add(endDate);
	}

	protected void paintBorder(Graphics graphics)
	{

		 graphics.pushState();
		 graphics.setForegroundColor(ColorConstants.blue);
		 graphics.drawRectangle(getBounds().x, getBounds().y, getBounds().width-1, getBounds().height-1);
		 graphics.popState();
	}

	@Override
	protected boolean useLocalCoordinates()
	{
		return true;
	}
	
	public void setDates(Date sd, Date ed)
	{
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		startDate.setText(df.format(sd));
		endDate.setText(df.format(ed));
		
	}

}

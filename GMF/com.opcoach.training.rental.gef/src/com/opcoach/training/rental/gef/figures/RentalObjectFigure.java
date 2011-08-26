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
	public static final int W_INIT = 60;
	public static final int H_INIT = 60;
	private static final int H_NAME = 16;
	private Label objectLabel;

	public RentalObjectFigure()
	{
		super();
		setLayoutManager(new XYLayout());
		objectLabel = new Label();
		objectLabel.setForegroundColor(ColorConstants.darkBlue);
		add(objectLabel);
		setBounds(new Rectangle(0, 0, W_INIT, H_INIT));
	}

	protected void paintBorder(Graphics graphics)
	{
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.lightBlue);
		graphics.drawOval(getBounds().x, getBounds().y, getBounds().width - 1, getBounds().height - 1);
		graphics.popState();

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.draw2d.Figure#setBounds(org.eclipse.draw2d.geometry.Rectangle
	 * )
	 */
	@Override
	public void setBounds(Rectangle rect)
	{
		// Check minimal bounds
		if ((rect.width < W_INIT) || (rect.height < H_INIT))
			rect = new Rectangle(rect.x, rect.y, W_INIT, H_INIT);
		
		super.setBounds(rect);
		
		// Recompute size of internal figures.
		int w = rect.width;
		int h = rect.height;

		if (objectLabel != null)
		{
			objectLabel.setBounds(new Rectangle(5, (h - H_NAME) / 2, w - 10, H_NAME));
		}
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

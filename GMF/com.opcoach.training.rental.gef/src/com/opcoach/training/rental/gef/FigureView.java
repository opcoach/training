package com.opcoach.training.rental.gef;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.gef.figures.CustomerFigure;
import com.opcoach.training.rental.gef.figures.RentalFigure;
import com.opcoach.training.rental.gef.figures.RentalObjectFigure;

public class FigureView extends ViewPart {

	public FigureView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
	    
	    Canvas canvas = new Canvas(parent, SWT.NULL);
	    canvas.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
	    LightweightSystem lws = new LightweightSystem(canvas);
	    
	    IFigure ovf = new Figure();
	    ovf.setBackgroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_BLUE));
	    ovf.setLayoutManager(new XYLayout());
	    lws.setContents(ovf);

	    
	    CustomerFigure c1 = new CustomerFigure("John");
	    ovf.add(c1);
	    c1.setLocation(new Point(0,0));
	    Rectangle b = c1.getBounds();
	    
	    CustomerFigure c2 = new CustomerFigure("Jim");
	    c2.setLocation(new Point(b.x + b.width +2, 0));
	    ovf.add(c2);
	   
	    CustomerFigure c3 = new CustomerFigure("James");
	    c3.setLocation(new Point(b.x + 2*b.width +2, 0));
	    ovf.add(c3);
	   
	    RentalFigure fg1 = new RentalFigure();
	    fg1.setLocation(new Point(0, b.y+b.height));
	    Rectangle fgb = fg1.getBounds();
	    ovf.add(fg1);

	    RentalFigure fg2 = new RentalFigure();
	    fg2.setLocation(new Point(fgb.x+fgb.width + 2, fgb.y));
	    ovf.add(fg2);
	    
	    RentalObjectFigure ro1 = new RentalObjectFigure();
	    ro1.setLocation(new Point(0, fgb.y+fgb.height));
	    Rectangle rob = ro1.getBounds();
	    ovf.add(ro1);

	    RentalObjectFigure ro2 = new RentalObjectFigure();
	    ro2.setLocation(new Point(rob.x+rob.width + 2, rob.y));
	    ovf.add(ro2);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}

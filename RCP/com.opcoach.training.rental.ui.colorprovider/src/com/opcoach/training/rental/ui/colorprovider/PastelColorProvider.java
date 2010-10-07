package com.opcoach.training.rental.ui.colorprovider;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;

public class PastelColorProvider implements IColorProvider
{

	public PastelColorProvider()
	{
	}

	@Override
	public Color getBackground(Object element)
	{
		return Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
	}

	public Color getForeground(Object element)
	{
		int color = SWT.COLOR_BLACK;
		if (element instanceof Customer)
			color = SWT.COLOR_DARK_BLUE;
		else if (element instanceof Rental)
			color = SWT.COLOR_DARK_MAGENTA;
		else if (element instanceof RentalObject)
			color = SWT.COLOR_DARK_GREEN;

		return Display.getCurrent().getSystemColor(color);
	}

}

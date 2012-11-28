package com.opcoach.training.rental.ui.palette;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;

public class PaletteJaune implements IColorProvider {

	public PaletteJaune() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getForeground(Object element) {
		if (element instanceof Customer)
			return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_YELLOW);
		else if (element instanceof Rental) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_YELLOW);
		} else if (element instanceof RentalObject) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_GREEN);
		}
		return null;
	}

	@Override
	public Color getBackground(Object element) {
		return null;
	}

}

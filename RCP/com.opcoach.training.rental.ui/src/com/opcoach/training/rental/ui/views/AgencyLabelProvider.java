// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.ui.views;

import java.text.SimpleDateFormat;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.ui.Palette;
import com.opcoach.training.rental.ui.RentalUIActivator;
import com.opcoach.training.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.ui.views.AgencyContentProvider.TNode;

/**
 * @author olivier
 */
public class AgencyLabelProvider extends LabelProvider implements IColorProvider, RentalUIConstants, IFontProvider
{
		
	/** The choosen palette among the additional (may be null) */
	private Palette currentPalette;


	public AgencyLabelProvider()
	{
		initPalette();
	}

	private SimpleDateFormat df = new SimpleDateFormat("dd/MM");

	@Override
	public String getText(Object element)
	{
		String result = null;
		boolean displayCount = RentalUIActivator.getDefault().getPreferenceStore().getBoolean(DISPLAY_COUNT_PREF);

		if (element instanceof RentalAgency)
		{
			result = ((RentalAgency) element).getName();
		} else if (element instanceof TNode)
		{
			return ((TNode) element).getText(displayCount);
		}

		else if (element instanceof Customer)
		{
			result = ((Customer) element).getDisplayName();
		} else if (element instanceof RentalObject)
		{
			result = ((RentalObject) element).getName();
		} else if (element instanceof Rental)
		{
			result = element.toString();
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.jface.viewers.IColorProvider#getBackground(java.lang.Object)
	 */
	@Override
	public Color getBackground(Object element)
	{
		return (currentPalette == null) ? null : currentPalette.getBackground(element);

	}

	@Override
	public Image getImage(Object element)
	{
		// TODO Auto-generated method stub
		Image result = null;
		ImageRegistry reg = RentalUIActivator.getDefault().getImageRegistry();

		if (element instanceof RentalAgency)
		{
			result = reg.get(AGENCY_KEY);
		} else if (element == RENTALS_NODE)
		{
			result = reg.get(RENTAL_KEY);
		} else if (element == CUSTOMERS_NODE)
		{
			result = reg.get(CUSTOMER_KEY);
		} else if (element == OBJECTS_NODE)
		{
			result = reg.get(RENTAL_OBJECT_KEY);
		}

		return result;

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.jface.viewers.IColorProvider#getForeground(java.lang.Object)
	 */
	@Override
	public Color getForeground(Object element)
	{
		return  (currentPalette != null) ? currentPalette.getForeground(element) : null;
		
	}

	
	
	public void initPalette()
	{
		// Recupere la palette selectionnée dans les preferences
		// (appelé par le listener de preference store de l'agency view et par le constructeur du label provider)
		String val = RentalUIActivator.getDefault().getPreferenceStore().getString(COLOR_PROVIDER);
		currentPalette = (val == null) ? null : RentalUIActivator.getDefault().getPaletteManager().get(val);

	}

	@Override
	public Font getFont(Object element)
	{
		if (element instanceof Customer)
		{
			return JFaceResources.getFontRegistry().get(CUSTOMER_KEY);
		} else if (element instanceof RentalObject)
			return JFaceResources.getFontRegistry().getBold(RENTAL_OBJECT_KEY);
		
		return null;
	}

}

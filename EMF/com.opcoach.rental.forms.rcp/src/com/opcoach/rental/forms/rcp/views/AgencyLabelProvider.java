// ------------------------------------------------
// OPCoach Training Projects
// � OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.rental.forms.rcp.views;

import java.text.SimpleDateFormat;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

import com.opcoach.rental.forms.rcp.RentalUIActivator;
import com.opcoach.rental.forms.rcp.RentalUIConstants;
import com.opcoach.rental.forms.rcp.views.AgencyContentProvider.TNode;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

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
		boolean displayCount = RentalUIActivator.getDefault().getPreferenceStore().getBoolean(PREF_DISPLAY_COUNT);

		if (element instanceof RentalAgency)
		{
			result = ((RentalAgency) element).getName();
		} else if (element instanceof TNode)
		{
			return ((TNode) element).getText(displayCount);
		}

		else if (element instanceof Customer)
		{
			result = ((Customer) element).getName();
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
		Image result = null;
		ImageRegistry reg = RentalUIActivator.getDefault().getImageRegistry();

		if (element instanceof RentalAgency)
		{
			result = reg.get(IMG_AGENCY);
		} else if (element instanceof TNode)
		{
			result = ((TNode) element).getImage();
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
		// Recupere la palette selectionn�e dans les preferences
		// (appel� par le listener de preference store de l'agency view et par le constructeur du label provider)
		String val = RentalUIActivator.getDefault().getPreferenceStore().getString(PREF_PALETTE);
		currentPalette = (val == null) ? null : RentalUIActivator.getDefault().getPaletteManager().get(val);

	}

	@Override
	public Font getFont(Object element)
	{
		if (element instanceof Customer)
		{
			return JFaceResources.getFontRegistry().get(FONT_CUSTOMER);
		} else if (element instanceof RentalObject)
			return JFaceResources.getFontRegistry().getBold(FONT_RENTAL_OBJECT);
		
		return null;
	}

}

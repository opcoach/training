// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.e4.rental.ui.parts;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.opcoach.training.e4.rental.ui.Palette;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.e4.rental.ui.parts.AgencyContentProvider.TNode;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

/** This label provider is created by ContextInjectionFactory.
 * @author olivier
 */
@Singleton
@Creatable
public class AgencyLabelProvider extends LabelProvider implements IColorProvider, RentalUIConstants
{
	@Inject
	private Palette currentPalette;
	
	@Inject @Named(RENTAL_UI_IMG_REGISTRY)
	private ImageRegistry registry;	
	
	@Inject @Named(RENTAL_UI_PREF_STORE)
	private IPreferenceStore prefStore;
		

	@Override
	public String getText(Object element)
	{
		String result = null;
		boolean displayCount = prefStore.getBoolean(PREF_DISPLAY_COUNT);

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


	@Override
	public Color getForeground(Object element)
	{
		return currentPalette.getForeground(element);
		
	}
	

	
	@Override
	public Color getBackground(Object element)
	{
		return  currentPalette.getBackground(element);

	}

	@Override
	public Image getImage(Object element)
	{
		Image result = null;


		if (element instanceof RentalAgency)
		{
			result = registry.get(AGENCY_IMG_KEY);
		} else if (element instanceof Rental)
		{
			result = registry.get(RENTAL_IMG_KEY);
		} else if (element instanceof Customer)
		{
			result = registry.get(CUSTOMER_IMG_KEY);
		} else if (element instanceof RentalObject)
		{
			result = registry.get(RENTAL_OBJECT_IMG_KEY);
		}

		return result;
	}
	
	

}

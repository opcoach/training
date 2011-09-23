package com.opcoach.training.rental.gef;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.views.properties.IPropertySource;

import com.opcoach.training.rental.provider.RentalItemProviderAdapterFactory;

 /** An AdapterFactoryContentProvider which transform the EditPart into its Model objecxt
  * It's connected to the RentalItemProvider coming from rental.edit
  * and call the getPropertySource with the object model.
  *
  * @author olivier
  *
  */
public class EditPartToProperySourceAdapterFactory extends AdapterFactoryContentProvider
{
	public EditPartToProperySourceAdapterFactory()
	{
		// initialize with the factory providing propertySources for EObject subclasses
		super(new RentalItemProviderAdapterFactory());
	}

	@Override
	public IPropertySource getPropertySource(Object object)
	{
		// override to get propertySource for the object contained in the EditPart
		if (object instanceof EditPart)
		{
			return super.getPropertySource(((EditPart) object).getModel());
		}
		else
		{
			 return super.getPropertySource(object);
		}	
	}
}

package com.opcoach.training.diagram.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.views.properties.IPropertySource;

 /** An AdapterFactoryContentProvider which transform the EditPart into its Model objecxt
  * It's connected to the RentalItemProvider coming from rental.edit
  * and call the getPropertySource with the object model.
  *
  * @author olivier
  *
  */
public class EditPartToPropertySourceAdapterFactory extends AdapterFactoryContentProvider
{
	public EditPartToPropertySourceAdapterFactory(AdapterFactory af)
	{
		// initialize with the factory providing propertySources for EObject subclasses
		super(af);
	}

	@Override
	public IPropertySource getPropertySource(Object object)
	{
		// override to get propertySource for the object contained in the EditPart
		if (object instanceof DiagramElementEditPart)
		{
			return super.getPropertySource(((DiagramElementEditPart) object).getModelObject());
		}
		else
		{
			 return super.getPropertySource(object);
		}	
	}
}

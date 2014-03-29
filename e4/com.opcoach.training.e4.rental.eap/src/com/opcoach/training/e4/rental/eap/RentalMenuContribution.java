package com.opcoach.training.e4.rental.eap;

import java.util.List;

import org.eclipse.e4.ui.di.AboutToHide;
import org.eclipse.e4.ui.di.AboutToShow;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

public class RentalMenuContribution
{
	/**
	 * @param items an empty list of MenuElement to fill
	 * @param modelService the model service used to create elements
	 */
	@AboutToShow
	public void aboutToShow(List<MMenuElement> items, EModelService modelService)
	{
		String bc = "bundleclass://com.opcoach.training.e4.rental.eap/com.opcoach.training.e4.rental.eap.handlers.TestHandler";
		String bundle = "platform:/plugin/com.opcoach.training.e4.rental.eap";

		MDirectMenuItem directItem = modelService.createModelElement(MDirectMenuItem.class);
		directItem.setLabel("Item added with aboutToShow");
		directItem.setContributionURI(bc);
		directItem.setContributorURI(bundle);

		items.add(directItem);
	}

	/**
	 * An optional method called when the menu disappears
	 * @param items the list of MMenuElement initialized by aboutToShow
	 */
	@AboutToHide
	public void aboutToHide(List<MMenuElement> items)
	{
		// Nothing special to do with the items list. It will be destroyed automatically
		// Use this method to dispose internal data computed in aboutToShow
		// This method with this annotation is optional. 
	} 
}

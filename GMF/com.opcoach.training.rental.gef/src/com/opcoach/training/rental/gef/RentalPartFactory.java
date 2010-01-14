// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.gef.parts.CustomerPart;
import com.opcoach.training.rental.gef.parts.RentalObjectPart;
import com.opcoach.training.rental.gef.parts.RentalPart;
import com.opcoach.training.rental.util.RentalSwitch;

/**
 * @author olivier
 *
 */
public class RentalPartFactory implements EditPartFactory
{

	private  RentalSwitch<EditPart> switcher = new RentalSwitch<EditPart>()
	{
		public EditPart caseCustomer(Customer object) { return new CustomerPart(); }

		public EditPart caseRental(Rental object) 	{ return new RentalPart(); }

		public EditPart caseRentalObject(RentalObject object) { return new RentalObjectPart(); }
		
	};
	
	
	public EditPart createEditPart(EditPart context, Object model)
	{
		EditPart part =  switcher.doSwitch((EObject) model) ;
		part.setModel(model);
		return part;
	}

}

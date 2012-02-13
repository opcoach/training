// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef.diagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.gef.parts.CustomerEditPart;
import com.opcoach.training.rental.gef.parts.RentalAgencyEditPart;
import com.opcoach.training.rental.gef.parts.RentalEditPart;
import com.opcoach.training.rental.gef.parts.RentalObjectEditPart;
import com.opcoach.training.rental.util.RentalSwitch;

/**
 * @author olivier
 *
 */
public class RentalEditPartFactory implements EditPartFactory
{

	private  RentalSwitch<EditPart> switcher = new RentalSwitch<EditPart>()
	{
		public EditPart caseCustomer(Customer object) { return new CustomerEditPart(); }
 
		public EditPart caseRental(Rental object) 	{ return new RentalEditPart(); }

        public EditPart caseRentalObject(RentalObject object) { return new RentalObjectEditPart(); }
        
        public EditPart caseRentalAgency(RentalAgency object) { return new RentalAgencyEditPart(); }
        		
	};
	
	
	public EditPart createEditPart(EditPart context, Object model)
	{
		EditPart part = switcher.doSwitch((EObject) model);
		part.setModel(model);
		return part;
	}

}

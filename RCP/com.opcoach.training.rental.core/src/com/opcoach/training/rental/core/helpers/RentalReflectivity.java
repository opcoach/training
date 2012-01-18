// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.core.helpers;

import java.io.IOException;

import org.eclipse.emf.ecore.EClass;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.MyRentalFactory;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalPackage;

/**
 * @author olivier
 */
public class RentalReflectivity
{
	public static void main(String[] args) throws IOException
	{
		EClass customerClass = RentalPackage.eINSTANCE.getCustomer();
		EClass rentalClass   = (EClass) RentalPackage.eINSTANCE.getEClassifier("Rental");
		
		@SuppressWarnings("unused")
		Customer c = (Customer) RentalPackage.eINSTANCE.getEFactoryInstance().create(customerClass);
		@SuppressWarnings("unused")
		Rental r = (Rental) MyRentalFactory.eINSTANCE.create(rentalClass);
		
		
	}
}

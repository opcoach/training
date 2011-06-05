package com.opcoach.training.rental.gef;

import org.eclipse.gef.requests.CreationFactory;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalFactory;
import com.opcoach.training.rental.RentalObject;

/**
 * The implementation for creating the new objects
 * @author olivier
 */
public class RentalCreationFactory implements CreationFactory {
	@SuppressWarnings("rawtypes")
	private final Class clazz;

	/**
	 * Constructor
	 */
	public RentalCreationFactory(@SuppressWarnings("rawtypes") Class clazz) {
		super();
		this.clazz = clazz;
	}

	/**
	 * return a model instance of class clazz
	 * 
	 * @see org.eclipse.gef.requests.CreationFactory#getNewObject()
	 */
	public Object getNewObject() {
		Object object = null;
		RentalFactory f = RentalFactory.eINSTANCE;
		if (clazz.equals(Customer.class)) {
			object = f.createCustomer();
		}
		else if (clazz.equals(Rental.class)) {
			object = f.createRental();
		}
		else if (clazz.equals(RentalObject.class)) {
			object = f.createRentalObject();
		}
		
		return object;
	}

	/**
	 * @see org.eclipse.gef.requests.CreationFactory#getObjectType()
	 */
	public Object getObjectType() {
		return clazz.getName();
	}

}
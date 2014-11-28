/**
 * OPCoach @ 2009
 *
 * $Id$
 */
package com.opcoach.training.rental.util;

import com.opcoach.training.rental.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import com.opcoach.training.rental.Address;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.License;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.RentalPackage;
import com.opcoach.training.rental.StreetType;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.opcoach.training.rental.RentalPackage
 * @generated
 */
public class RentalValidator extends EObjectValidator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "OPCoach @ 2012";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RentalValidator INSTANCE = new RentalValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.opcoach.training.rental";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalValidator()
	{
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage()
	{
	  return RentalPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		switch (classifierID) {
			case RentalPackage.RENTAL_AGENCY:
				return validateRentalAgency((RentalAgency)value, diagnostics, context);
			case RentalPackage.CUSTOMER:
				return validateCustomer((Customer)value, diagnostics, context);
			case RentalPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case RentalPackage.RENTAL_OBJECT:
				return validateRentalObject((RentalObject)value, diagnostics, context);
			case RentalPackage.LICENSE:
				return validateLicense((License)value, diagnostics, context);
			case RentalPackage.RENTAL:
				return validateRental((Rental)value, diagnostics, context);
			case RentalPackage.STREET_TYPE:
				return validateStreetType((StreetType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRentalAgency(RentalAgency rentalAgency, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(rentalAgency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(customer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validateCustomer_consistentName(customer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the consistentName constraint of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer_consistentName(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "consistentName", getObjectLabel(customer, context) },
						 new Object[] { customer },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the lastNameMustNotBeNull constraint of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCustomer_lastNameMustNotBeNull(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (customer.getLastName().length() <= 2)
		{
			if (diagnostics != null)
			{
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "lastNameMustNotBeNull", getObjectLabel(customer, context) },
						 new Object[] { customer },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRentalObject(RentalObject rentalObject, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(rentalObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicense(License license, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(license, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRental(Rental rental, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(rental, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rental, diagnostics, context);
		if (result || diagnostics != null) result &= validateRental_startDateBeforeEndDate(rental, diagnostics, context);
		return result;
	}

	/**
	 * Validates the startDateBeforeEndDate constraint of '<em>Rental</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRental_startDateBeforeEndDate(Rental rental, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "startDateBeforeEndDate", getObjectLabel(rental, context) },
						 new Object[] { rental },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreetType(StreetType streetType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RentalValidator

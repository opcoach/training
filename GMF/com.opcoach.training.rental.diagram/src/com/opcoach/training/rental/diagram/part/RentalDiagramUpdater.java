package com.opcoach.training.rental.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import com.opcoach.training.rental.Address;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.License;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.RentalPackage;
import com.opcoach.training.rental.diagram.edit.parts.Address2EditPart;
import com.opcoach.training.rental.diagram.edit.parts.AddressEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerCustomerAddressCompartmentEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerCustomerLicensesCompartmentEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerEditPart;
import com.opcoach.training.rental.diagram.edit.parts.LicenseEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalAgencyEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalCustomerEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalObjectEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalRentedObjectEditPart;
import com.opcoach.training.rental.diagram.providers.RentalElementTypes;

/**
 * @generated
 */
public class RentalDiagramUpdater
{

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view)
	{
		switch (RentalVisualIDRegistry.getVisualID(view))
		{
		case CustomerCustomerAddressCompartmentEditPart.VISUAL_ID:
			return getCustomerCustomerAddressCompartment_7001SemanticChildren(view);
		case CustomerCustomerLicensesCompartmentEditPart.VISUAL_ID:
			return getCustomerCustomerLicensesCompartment_7002SemanticChildren(view);
		case RentalAgencyEditPart.VISUAL_ID:
			return getRentalAgency_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomerCustomerAddressCompartment_7001SemanticChildren(View view)
	{
		if (false == view.eContainer() instanceof View)
		{
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement())
		{
			return Collections.EMPTY_LIST;
		}
		Customer modelElement = (Customer) containerView.getElement();
		List result = new LinkedList();
		{
			Address childElement = modelElement.getAddress();
			int visualID = RentalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Address2EditPart.VISUAL_ID)
			{
				result.add(new RentalNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCustomerCustomerLicensesCompartment_7002SemanticChildren(View view)
	{
		if (false == view.eContainer() instanceof View)
		{
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement())
		{
			return Collections.EMPTY_LIST;
		}
		Customer modelElement = (Customer) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getLicenses().iterator(); it.hasNext();)
		{
			License childElement = (License) it.next();
			int visualID = RentalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LicenseEditPart.VISUAL_ID)
			{
				result.add(new RentalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRentalAgency_1000SemanticChildren(View view)
	{
		if (!view.isSetElement())
		{
			return Collections.EMPTY_LIST;
		}
		RentalAgency modelElement = (RentalAgency) view.getElement();
		List result = new LinkedList();
		{
			Address childElement = modelElement.getAddress();
			int visualID = RentalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AddressEditPart.VISUAL_ID)
			{
				result.add(new RentalNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getObjectsToRent().iterator(); it.hasNext();)
		{
			RentalObject childElement = (RentalObject) it.next();
			int visualID = RentalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RentalObjectEditPart.VISUAL_ID)
			{
				result.add(new RentalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getCustomers().iterator(); it.hasNext();)
		{
			Customer childElement = (Customer) it.next();
			int visualID = RentalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CustomerEditPart.VISUAL_ID)
			{
				result.add(new RentalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getRentals().iterator(); it.hasNext();)
		{
			Rental childElement = (Rental) it.next();
			int visualID = RentalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RentalEditPart.VISUAL_ID)
			{
				result.add(new RentalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view)
	{
		switch (RentalVisualIDRegistry.getVisualID(view))
		{
		case RentalAgencyEditPart.VISUAL_ID:
			return getRentalAgency_1000ContainedLinks(view);
		case AddressEditPart.VISUAL_ID:
			return getAddress_2001ContainedLinks(view);
		case RentalObjectEditPart.VISUAL_ID:
			return getRentalObject_2002ContainedLinks(view);
		case CustomerEditPart.VISUAL_ID:
			return getCustomer_2003ContainedLinks(view);
		case RentalEditPart.VISUAL_ID:
			return getRental_2004ContainedLinks(view);
		case Address2EditPart.VISUAL_ID:
			return getAddress_3001ContainedLinks(view);
		case LicenseEditPart.VISUAL_ID:
			return getLicense_3002ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view)
	{
		switch (RentalVisualIDRegistry.getVisualID(view))
		{
		case AddressEditPart.VISUAL_ID:
			return getAddress_2001IncomingLinks(view);
		case RentalObjectEditPart.VISUAL_ID:
			return getRentalObject_2002IncomingLinks(view);
		case CustomerEditPart.VISUAL_ID:
			return getCustomer_2003IncomingLinks(view);
		case RentalEditPart.VISUAL_ID:
			return getRental_2004IncomingLinks(view);
		case Address2EditPart.VISUAL_ID:
			return getAddress_3001IncomingLinks(view);
		case LicenseEditPart.VISUAL_ID:
			return getLicense_3002IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view)
	{
		switch (RentalVisualIDRegistry.getVisualID(view))
		{
		case AddressEditPart.VISUAL_ID:
			return getAddress_2001OutgoingLinks(view);
		case RentalObjectEditPart.VISUAL_ID:
			return getRentalObject_2002OutgoingLinks(view);
		case CustomerEditPart.VISUAL_ID:
			return getCustomer_2003OutgoingLinks(view);
		case RentalEditPart.VISUAL_ID:
			return getRental_2004OutgoingLinks(view);
		case Address2EditPart.VISUAL_ID:
			return getAddress_3001OutgoingLinks(view);
		case LicenseEditPart.VISUAL_ID:
			return getLicense_3002OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRentalAgency_1000ContainedLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAddress_2001ContainedLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRentalObject_2002ContainedLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomer_2003ContainedLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRental_2004ContainedLinks(View view)
	{
		Rental modelElement = (Rental) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rental_Customer_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rental_RentedObject_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddress_3001ContainedLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLicense_3002ContainedLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAddress_2001IncomingLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRentalObject_2002IncomingLinks(View view)
	{
		RentalObject modelElement = (RentalObject) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Rental_RentedObject_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCustomer_2003IncomingLinks(View view)
	{
		Customer modelElement = (Customer) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Rental_Customer_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRental_2004IncomingLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAddress_3001IncomingLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLicense_3002IncomingLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAddress_2001OutgoingLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRentalObject_2002OutgoingLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomer_2003OutgoingLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRental_2004OutgoingLinks(View view)
	{
		Rental modelElement = (Rental) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rental_Customer_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rental_RentedObject_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddress_3001OutgoingLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLicense_3002OutgoingLinks(View view)
	{
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Rental_Customer_4001(Customer target, Map crossReferences)
	{
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();)
		{
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() == RentalPackage.eINSTANCE.getRental_Customer())
			{
				result.add(new RentalLinkDescriptor(setting.getEObject(), target, RentalElementTypes.RentalCustomer_4001, RentalCustomerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Rental_RentedObject_4002(RentalObject target, Map crossReferences)
	{
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();)
		{
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() == RentalPackage.eINSTANCE.getRental_RentedObject())
			{
				result.add(new RentalLinkDescriptor(setting.getEObject(), target, RentalElementTypes.RentalRentedObject_4002, RentalRentedObjectEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Rental_Customer_4001(Rental source)
	{
		Collection result = new LinkedList();
		Customer destination = source.getCustomer();
		if (destination == null)
		{
			return result;
		}
		result.add(new RentalLinkDescriptor(source, destination, RentalElementTypes.RentalCustomer_4001, RentalCustomerEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Rental_RentedObject_4002(Rental source)
	{
		Collection result = new LinkedList();
		RentalObject destination = source.getRentedObject();
		if (destination == null)
		{
			return result;
		}
		result.add(new RentalLinkDescriptor(source, destination, RentalElementTypes.RentalRentedObject_4002, RentalRentedObjectEditPart.VISUAL_ID));
		return result;
	}

}

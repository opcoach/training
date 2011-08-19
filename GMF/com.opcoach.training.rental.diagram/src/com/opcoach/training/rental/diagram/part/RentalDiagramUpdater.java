package com.opcoach.training.rental.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
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
	public static List<RentalNodeDescriptor> getSemanticChildren(View view)
	{
		switch (RentalVisualIDRegistry.getVisualID(view))
		{
		case RentalAgencyEditPart.VISUAL_ID:
			return getRentalAgency_1000SemanticChildren(view);
		case CustomerCustomerAddressCompartmentEditPart.VISUAL_ID:
			return getCustomerCustomerAddressCompartment_7001SemanticChildren(view);
		case CustomerCustomerLicensesCompartmentEditPart.VISUAL_ID:
			return getCustomerCustomerLicensesCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalNodeDescriptor> getCustomerCustomerAddressCompartment_7001SemanticChildren(View view)
	{
		if (false == view.eContainer() instanceof View)
		{
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement())
		{
			return Collections.emptyList();
		}
		Customer modelElement = (Customer) containerView.getElement();
		LinkedList<RentalNodeDescriptor> result = new LinkedList<RentalNodeDescriptor>();
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
	public static List<RentalNodeDescriptor> getCustomerCustomerLicensesCompartment_7002SemanticChildren(View view)
	{
		if (false == view.eContainer() instanceof View)
		{
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement())
		{
			return Collections.emptyList();
		}
		Customer modelElement = (Customer) containerView.getElement();
		LinkedList<RentalNodeDescriptor> result = new LinkedList<RentalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLicenses().iterator(); it.hasNext();)
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
	public static List<RentalNodeDescriptor> getRentalAgency_1000SemanticChildren(View view)
	{
		if (!view.isSetElement())
		{
			return Collections.emptyList();
		}
		RentalAgency modelElement = (RentalAgency) view.getElement();
		LinkedList<RentalNodeDescriptor> result = new LinkedList<RentalNodeDescriptor>();
		{
			Address childElement = modelElement.getAddress();
			int visualID = RentalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AddressEditPart.VISUAL_ID)
			{
				result.add(new RentalNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getObjectsToRent().iterator(); it.hasNext();)
		{
			RentalObject childElement = (RentalObject) it.next();
			int visualID = RentalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RentalObjectEditPart.VISUAL_ID)
			{
				result.add(new RentalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCustomers().iterator(); it.hasNext();)
		{
			Customer childElement = (Customer) it.next();
			int visualID = RentalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CustomerEditPart.VISUAL_ID)
			{
				result.add(new RentalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRentals().iterator(); it.hasNext();)
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
	public static List<RentalLinkDescriptor> getContainedLinks(View view)
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
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getIncomingLinks(View view)
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
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getOutgoingLinks(View view)
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
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getRentalAgency_1000ContainedLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getAddress_2001ContainedLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getRentalObject_2002ContainedLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getCustomer_2003ContainedLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getRental_2004ContainedLinks(View view)
	{
		Rental modelElement = (Rental) view.getElement();
		LinkedList<RentalLinkDescriptor> result = new LinkedList<RentalLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rental_Customer_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rental_RentedObject_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getAddress_3001ContainedLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getLicense_3002ContainedLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getAddress_2001IncomingLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getRentalObject_2002IncomingLinks(View view)
	{
		RentalObject modelElement = (RentalObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		LinkedList<RentalLinkDescriptor> result = new LinkedList<RentalLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rental_RentedObject_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getCustomer_2003IncomingLinks(View view)
	{
		Customer modelElement = (Customer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		LinkedList<RentalLinkDescriptor> result = new LinkedList<RentalLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rental_Customer_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getRental_2004IncomingLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getAddress_3001IncomingLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getLicense_3002IncomingLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getAddress_2001OutgoingLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getRentalObject_2002OutgoingLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getCustomer_2003OutgoingLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getRental_2004OutgoingLinks(View view)
	{
		Rental modelElement = (Rental) view.getElement();
		LinkedList<RentalLinkDescriptor> result = new LinkedList<RentalLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rental_Customer_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rental_RentedObject_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getAddress_3001OutgoingLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RentalLinkDescriptor> getLicense_3002OutgoingLinks(View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RentalLinkDescriptor> getIncomingFeatureModelFacetLinks_Rental_Customer_4001(Customer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences)
	{
		LinkedList<RentalLinkDescriptor> result = new LinkedList<RentalLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings)
		{
			if (setting.getEStructuralFeature() == RentalPackage.eINSTANCE.getRental_Customer())
			{
				result.add(new RentalLinkDescriptor(setting.getEObject(), target, RentalElementTypes.RentalCustomer_4001,
						RentalCustomerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RentalLinkDescriptor> getIncomingFeatureModelFacetLinks_Rental_RentedObject_4002(RentalObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences)
	{
		LinkedList<RentalLinkDescriptor> result = new LinkedList<RentalLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings)
		{
			if (setting.getEStructuralFeature() == RentalPackage.eINSTANCE.getRental_RentedObject())
			{
				result.add(new RentalLinkDescriptor(setting.getEObject(), target, RentalElementTypes.RentalRentedObject_4002,
						RentalRentedObjectEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RentalLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rental_Customer_4001(Rental source)
	{
		LinkedList<RentalLinkDescriptor> result = new LinkedList<RentalLinkDescriptor>();
		Customer destination = source.getCustomer();
		if (destination == null)
		{
			return result;
		}
		result.add(new RentalLinkDescriptor(source, destination, RentalElementTypes.RentalCustomer_4001,
				RentalCustomerEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RentalLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rental_RentedObject_4002(Rental source)
	{
		LinkedList<RentalLinkDescriptor> result = new LinkedList<RentalLinkDescriptor>();
		RentalObject destination = source.getRentedObject();
		if (destination == null)
		{
			return result;
		}
		result.add(new RentalLinkDescriptor(source, destination, RentalElementTypes.RentalRentedObject_4002,
				RentalRentedObjectEditPart.VISUAL_ID));
		return result;
	}

}

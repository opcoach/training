package com.opcoach.training.rental.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalPackage;
import com.opcoach.training.rental.diagram.edit.parts.Address2EditPart;
import com.opcoach.training.rental.diagram.edit.parts.AddressCity2EditPart;
import com.opcoach.training.rental.diagram.edit.parts.AddressCityEditPart;
import com.opcoach.training.rental.diagram.edit.parts.AddressEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerCustomerAddressCompartmentEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerCustomerLicensesCompartmentEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerFirstNameLastNameEditPart;
import com.opcoach.training.rental.diagram.edit.parts.LicenseEditPart;
import com.opcoach.training.rental.diagram.edit.parts.LicenseNumberEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalAgencyEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalCustomerEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalObjectEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalObjectNameEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalRentedObjectEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalStartDateEditPart;
import com.opcoach.training.rental.diagram.edit.parts.WrappingLabel2EditPart;
import com.opcoach.training.rental.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RentalVisualIDRegistry
{

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "com.opcoach.training.rental.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view)
	{
		if (view instanceof Diagram)
		{
			if (RentalAgencyEditPart.MODEL_ID.equals(view.getType()))
			{
				return RentalAgencyEditPart.VISUAL_ID;
			} else
			{
				return -1;
			}
		}
		return com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view)
	{
		View diagram = view.getDiagram();
		while (view != diagram)
		{
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null)
			{
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type)
	{
		try
		{
			return Integer.parseInt(type);
		} catch (NumberFormatException e)
		{
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY)))
			{
				RentalDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID)
	{
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement)
	{
		if (domainElement == null)
		{
			return -1;
		}
		if (RentalPackage.eINSTANCE.getRentalAgency().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((RentalAgency) domainElement))
		{
			return RentalAgencyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement)
	{
		if (domainElement == null)
		{
			return -1;
		}
		String containerModelID = com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry.getModelID(containerView);
		if (!RentalAgencyEditPart.MODEL_ID.equals(containerModelID))
		{
			return -1;
		}
		int containerVisualID;
		if (RentalAgencyEditPart.MODEL_ID.equals(containerModelID))
		{
			containerVisualID = com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry.getVisualID(containerView);
		} else
		{
			if (containerView instanceof Diagram)
			{
				containerVisualID = RentalAgencyEditPart.VISUAL_ID;
			} else
			{
				return -1;
			}
		}
		switch (containerVisualID)
		{
		case RentalAgencyEditPart.VISUAL_ID:
			if (RentalPackage.eINSTANCE.getAddress().isSuperTypeOf(domainElement.eClass()))
			{
				return AddressEditPart.VISUAL_ID;
			}
			if (RentalPackage.eINSTANCE.getRentalObject().isSuperTypeOf(domainElement.eClass()))
			{
				return RentalObjectEditPart.VISUAL_ID;
			}
			if (RentalPackage.eINSTANCE.getCustomer().isSuperTypeOf(domainElement.eClass()))
			{
				return CustomerEditPart.VISUAL_ID;
			}
			if (RentalPackage.eINSTANCE.getRental().isSuperTypeOf(domainElement.eClass()))
			{
				return RentalEditPart.VISUAL_ID;
			}
			break;
		case CustomerCustomerAddressCompartmentEditPart.VISUAL_ID:
			if (RentalPackage.eINSTANCE.getAddress().isSuperTypeOf(domainElement.eClass()))
			{
				return Address2EditPart.VISUAL_ID;
			}
			break;
		case CustomerCustomerLicensesCompartmentEditPart.VISUAL_ID:
			if (RentalPackage.eINSTANCE.getLicense().isSuperTypeOf(domainElement.eClass()))
			{
				return LicenseEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID)
	{
		String containerModelID = com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry.getModelID(containerView);
		if (!RentalAgencyEditPart.MODEL_ID.equals(containerModelID))
		{
			return false;
		}
		int containerVisualID;
		if (RentalAgencyEditPart.MODEL_ID.equals(containerModelID))
		{
			containerVisualID = com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry.getVisualID(containerView);
		} else
		{
			if (containerView instanceof Diagram)
			{
				containerVisualID = RentalAgencyEditPart.VISUAL_ID;
			} else
			{
				return false;
			}
		}
		switch (containerVisualID)
		{
		case RentalAgencyEditPart.VISUAL_ID:
			if (AddressEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			if (RentalObjectEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			if (CustomerEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			if (RentalEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		case AddressEditPart.VISUAL_ID:
			if (AddressCityEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		case RentalObjectEditPart.VISUAL_ID:
			if (RentalObjectNameEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		case CustomerEditPart.VISUAL_ID:
			if (CustomerFirstNameLastNameEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			if (CustomerCustomerAddressCompartmentEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			if (CustomerCustomerLicensesCompartmentEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		case RentalEditPart.VISUAL_ID:
			if (RentalStartDateEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		case Address2EditPart.VISUAL_ID:
			if (AddressCity2EditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		case LicenseEditPart.VISUAL_ID:
			if (LicenseNumberEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		case CustomerCustomerAddressCompartmentEditPart.VISUAL_ID:
			if (Address2EditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		case CustomerCustomerLicensesCompartmentEditPart.VISUAL_ID:
			if (LicenseEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		case RentalCustomerEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		case RentalRentedObjectEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID)
			{
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement)
	{
		if (domainElement == null)
		{
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(RentalAgency element)
	{
		return true;
	}

}

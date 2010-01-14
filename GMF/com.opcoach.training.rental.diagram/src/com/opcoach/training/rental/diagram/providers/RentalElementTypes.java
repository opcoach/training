package com.opcoach.training.rental.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import com.opcoach.training.rental.RentalPackage;
import com.opcoach.training.rental.diagram.edit.parts.Address2EditPart;
import com.opcoach.training.rental.diagram.edit.parts.AddressEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerEditPart;
import com.opcoach.training.rental.diagram.edit.parts.LicenseEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalAgencyEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalCustomerEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalObjectEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalRentedObjectEditPart;
import com.opcoach.training.rental.diagram.part.RentalDiagramEditorPlugin;

/**
 * @generated
 */
public class RentalElementTypes extends ElementInitializers
{

	/**
	 * @generated
	 */
	private RentalElementTypes()
	{
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType RentalAgency_1000 = getElementType("com.opcoach.training.rental.diagram.RentalAgency_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Address_2001 = getElementType("com.opcoach.training.rental.diagram.Address_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RentalObject_2002 = getElementType("com.opcoach.training.rental.diagram.RentalObject_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Customer_2003 = getElementType("com.opcoach.training.rental.diagram.Customer_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rental_2004 = getElementType("com.opcoach.training.rental.diagram.Rental_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Address_3001 = getElementType("com.opcoach.training.rental.diagram.Address_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType License_3002 = getElementType("com.opcoach.training.rental.diagram.License_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RentalCustomer_4001 = getElementType("com.opcoach.training.rental.diagram.RentalCustomer_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RentalRentedObject_4002 = getElementType("com.opcoach.training.rental.diagram.RentalRentedObject_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry()
	{
		if (imageRegistry == null)
		{
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element)
	{
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(ENamedElement element)
	{
		if (element instanceof EStructuralFeature)
		{
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract())
			{
				element = eContainingClass;
			}
			else if (eType instanceof EClass && !((EClass) eType).isAbstract())
			{
				element = eType;
			}
		}
		if (element instanceof EClass)
		{
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract())
			{
				return RentalDiagramEditorPlugin.getInstance().getItemImageDescriptor(eClass.getEPackage().getEFactoryInstance().create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element)
	{
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null)
		{
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null)
			{
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element)
	{
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null)
		{
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null)
			{
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint)
	{
		ENamedElement element = getElement(hint);
		if (element == null)
		{
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint)
	{
		ENamedElement element = getElement(hint);
		if (element == null)
		{
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint)
	{
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null)
		{
			elements = new IdentityHashMap();

			elements.put(RentalAgency_1000, RentalPackage.eINSTANCE.getRentalAgency());

			elements.put(Address_2001, RentalPackage.eINSTANCE.getAddress());

			elements.put(RentalObject_2002, RentalPackage.eINSTANCE.getRentalObject());

			elements.put(Customer_2003, RentalPackage.eINSTANCE.getCustomer());

			elements.put(Rental_2004, RentalPackage.eINSTANCE.getRental());

			elements.put(Address_3001, RentalPackage.eINSTANCE.getAddress());

			elements.put(License_3002, RentalPackage.eINSTANCE.getLicense());

			elements.put(RentalCustomer_4001, RentalPackage.eINSTANCE.getRental_Customer());

			elements.put(RentalRentedObject_4002, RentalPackage.eINSTANCE.getRental_RentedObject());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id)
	{
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType)
	{
		if (KNOWN_ELEMENT_TYPES == null)
		{
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(RentalAgency_1000);
			KNOWN_ELEMENT_TYPES.add(Address_2001);
			KNOWN_ELEMENT_TYPES.add(RentalObject_2002);
			KNOWN_ELEMENT_TYPES.add(Customer_2003);
			KNOWN_ELEMENT_TYPES.add(Rental_2004);
			KNOWN_ELEMENT_TYPES.add(Address_3001);
			KNOWN_ELEMENT_TYPES.add(License_3002);
			KNOWN_ELEMENT_TYPES.add(RentalCustomer_4001);
			KNOWN_ELEMENT_TYPES.add(RentalRentedObject_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID)
	{
		switch (visualID)
		{
		case RentalAgencyEditPart.VISUAL_ID:
			return RentalAgency_1000;
		case AddressEditPart.VISUAL_ID:
			return Address_2001;
		case RentalObjectEditPart.VISUAL_ID:
			return RentalObject_2002;
		case CustomerEditPart.VISUAL_ID:
			return Customer_2003;
		case RentalEditPart.VISUAL_ID:
			return Rental_2004;
		case Address2EditPart.VISUAL_ID:
			return Address_3001;
		case LicenseEditPart.VISUAL_ID:
			return License_3002;
		case RentalCustomerEditPart.VISUAL_ID:
			return RentalCustomer_4001;
		case RentalRentedObjectEditPart.VISUAL_ID:
			return RentalRentedObject_4002;
		}
		return null;
	}

}

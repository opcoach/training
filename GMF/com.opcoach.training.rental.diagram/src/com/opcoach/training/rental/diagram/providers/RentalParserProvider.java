package com.opcoach.training.rental.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import com.opcoach.training.rental.RentalPackage;
import com.opcoach.training.rental.diagram.edit.parts.AddressCity2EditPart;
import com.opcoach.training.rental.diagram.edit.parts.AddressCityEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerFirstNameLastNameEditPart;
import com.opcoach.training.rental.diagram.edit.parts.LicenseNumberEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalObjectNameEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalStartDateEditPart;
import com.opcoach.training.rental.diagram.parsers.MessageFormatParser;
import com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry;

/**
 * @generated
 */
public class RentalParserProvider extends AbstractProvider implements IParserProvider
{

	/**
	 * @generated
	 */
	private IParser addressCity_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAddressCity_5001Parser()
	{
		if (addressCity_5001Parser == null)
		{
			EAttribute[] features = new EAttribute[] { RentalPackage.eINSTANCE.getAddress_City() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addressCity_5001Parser = parser;
		}
		return addressCity_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser rentalObjectName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getRentalObjectName_5002Parser()
	{
		if (rentalObjectName_5002Parser == null)
		{
			EAttribute[] features = new EAttribute[] { RentalPackage.eINSTANCE.getRentalObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rentalObjectName_5002Parser = parser;
		}
		return rentalObjectName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser customerFirstNameLastName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCustomerFirstNameLastName_5005Parser()
	{
		if (customerFirstNameLastName_5005Parser == null)
		{
			EAttribute[] features = new EAttribute[] { RentalPackage.eINSTANCE.getCustomer_FirstName(),
					RentalPackage.eINSTANCE.getCustomer_LastName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customerFirstNameLastName_5005Parser = parser;
		}
		return customerFirstNameLastName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser rentalStartDate_5006Parser;

	/**
	 * @generated
	 */
	private IParser getRentalStartDate_5006Parser()
	{
		if (rentalStartDate_5006Parser == null)
		{
			EAttribute[] features = new EAttribute[] { RentalPackage.eINSTANCE.getRental_StartDate() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rentalStartDate_5006Parser = parser;
		}
		return rentalStartDate_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser addressCity_5003Parser;

	/**
	 * @generated
	 */
	private IParser getAddressCity_5003Parser()
	{
		if (addressCity_5003Parser == null)
		{
			EAttribute[] features = new EAttribute[] { RentalPackage.eINSTANCE.getAddress_City() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addressCity_5003Parser = parser;
		}
		return addressCity_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser licenseNumber_5004Parser;

	/**
	 * @generated
	 */
	private IParser getLicenseNumber_5004Parser()
	{
		if (licenseNumber_5004Parser == null)
		{
			EAttribute[] features = new EAttribute[] { RentalPackage.eINSTANCE.getLicense_Number() };
			MessageFormatParser parser = new MessageFormatParser(features);
			licenseNumber_5004Parser = parser;
		}
		return licenseNumber_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID)
	{
		switch (visualID)
		{
		case AddressCityEditPart.VISUAL_ID:
			return getAddressCity_5001Parser();
		case RentalObjectNameEditPart.VISUAL_ID:
			return getRentalObjectName_5002Parser();
		case CustomerFirstNameLastNameEditPart.VISUAL_ID:
			return getCustomerFirstNameLastName_5005Parser();
		case RentalStartDateEditPart.VISUAL_ID:
			return getRentalStartDate_5006Parser();
		case AddressCity2EditPart.VISUAL_ID:
			return getAddressCity_5003Parser();
		case LicenseNumberEditPart.VISUAL_ID:
			return getLicenseNumber_5004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint)
	{
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint)
	{
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null)
		{
			return getParser(RentalVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null)
		{
			return getParser(RentalVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation)
	{
		if (operation instanceof GetParserOperation)
		{
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RentalElementTypes.getElement(hint) == null)
			{
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter
	{

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint)
		{
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter)
		{
			if (IElementType.class.equals(adapter))
			{
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

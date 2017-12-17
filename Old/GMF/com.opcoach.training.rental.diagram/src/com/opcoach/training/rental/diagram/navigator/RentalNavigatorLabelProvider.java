package com.opcoach.training.rental.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.diagram.edit.parts.Address2EditPart;
import com.opcoach.training.rental.diagram.edit.parts.AddressCity2EditPart;
import com.opcoach.training.rental.diagram.edit.parts.AddressCityEditPart;
import com.opcoach.training.rental.diagram.edit.parts.AddressEditPart;
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
import com.opcoach.training.rental.diagram.part.RentalDiagramEditorPlugin;
import com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry;
import com.opcoach.training.rental.diagram.providers.RentalElementTypes;
import com.opcoach.training.rental.diagram.providers.RentalParserProvider;

/**
 * @generated
 */
public class RentalNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider
{

	/**
	 * @generated
	 */
	static
	{
		RentalDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RentalDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath)
	{
		Object element = elementPath.getLastSegment();
		if (element instanceof RentalNavigatorItem && !isOwnView(((RentalNavigatorItem) element).getView()))
		{
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element)
	{
		if (element instanceof RentalNavigatorGroup)
		{
			RentalNavigatorGroup group = (RentalNavigatorGroup) element;
			return RentalDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof RentalNavigatorItem)
		{
			RentalNavigatorItem navigatorItem = (RentalNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView()))
			{
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view)
	{
		switch (RentalVisualIDRegistry.getVisualID(view))
		{
		case RentalCustomerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://com.opcoach.training/rental/1.0?Rental?customer", RentalElementTypes.RentalCustomer_4001); //$NON-NLS-1$
		case LicenseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://com.opcoach.training/rental/1.0?License", RentalElementTypes.License_3002); //$NON-NLS-1$
		case AddressEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://com.opcoach.training/rental/1.0?Address", RentalElementTypes.Address_2001); //$NON-NLS-1$
		case Address2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://com.opcoach.training/rental/1.0?Address", RentalElementTypes.Address_3001); //$NON-NLS-1$
		case RentalRentedObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://com.opcoach.training/rental/1.0?Rental?rentedObject", RentalElementTypes.RentalRentedObject_4002); //$NON-NLS-1$
		case CustomerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://com.opcoach.training/rental/1.0?Customer", RentalElementTypes.Customer_2003); //$NON-NLS-1$
		case RentalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://com.opcoach.training/rental/1.0?Rental", RentalElementTypes.Rental_2004); //$NON-NLS-1$
		case RentalObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://com.opcoach.training/rental/1.0?RentalObject", RentalElementTypes.RentalObject_2002); //$NON-NLS-1$
		case RentalAgencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://com.opcoach.training/rental/1.0?RentalAgency", RentalElementTypes.RentalAgency_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType)
	{
		ImageRegistry imageRegistry = RentalDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && RentalElementTypes.isKnownElementType(elementType))
		{
			image = RentalElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null)
		{
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element)
	{
		if (element instanceof RentalNavigatorGroup)
		{
			RentalNavigatorGroup group = (RentalNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RentalNavigatorItem)
		{
			RentalNavigatorItem navigatorItem = (RentalNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView()))
			{
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view)
	{
		if (view.getElement() != null && view.getElement().eIsProxy())
		{
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RentalVisualIDRegistry.getVisualID(view))
		{
		case RentalCustomerEditPart.VISUAL_ID:
			return getRentalCustomer_4001Text(view);
		case LicenseEditPart.VISUAL_ID:
			return getLicense_3002Text(view);
		case AddressEditPart.VISUAL_ID:
			return getAddress_2001Text(view);
		case Address2EditPart.VISUAL_ID:
			return getAddress_3001Text(view);
		case RentalRentedObjectEditPart.VISUAL_ID:
			return getRentalRentedObject_4002Text(view);
		case CustomerEditPart.VISUAL_ID:
			return getCustomer_2003Text(view);
		case RentalEditPart.VISUAL_ID:
			return getRental_2004Text(view);
		case RentalObjectEditPart.VISUAL_ID:
			return getRentalObject_2002Text(view);
		case RentalAgencyEditPart.VISUAL_ID:
			return getRentalAgency_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRentalAgency_1000Text(View view)
	{
		MyRentalAgency domainModelElement = (MyRentalAgency) view.getElement();
		if (domainModelElement != null)
		{
			return domainModelElement.getName();
		} else
		{
			RentalDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAddress_2001Text(View view)
	{
		IParser parser = RentalParserProvider
				.getParser(RentalElementTypes.Address_2001, view.getElement() != null ? view.getElement() : view,
						RentalVisualIDRegistry.getType(AddressCityEditPart.VISUAL_ID));
		if (parser != null)
		{
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else
		{
			RentalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRentalObject_2002Text(View view)
	{
		IParser parser = RentalParserProvider.getParser(RentalElementTypes.RentalObject_2002,
				view.getElement() != null ? view.getElement() : view,
				RentalVisualIDRegistry.getType(RentalObjectNameEditPart.VISUAL_ID));
		if (parser != null)
		{
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else
		{
			RentalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCustomer_2003Text(View view)
	{
		IParser parser = RentalParserProvider.getParser(RentalElementTypes.Customer_2003,
				view.getElement() != null ? view.getElement() : view,
				RentalVisualIDRegistry.getType(CustomerFirstNameLastNameEditPart.VISUAL_ID));
		if (parser != null)
		{
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else
		{
			RentalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRental_2004Text(View view)
	{
		IParser parser = RentalParserProvider.getParser(RentalElementTypes.Rental_2004,
				view.getElement() != null ? view.getElement() : view,
				RentalVisualIDRegistry.getType(RentalStartDateEditPart.VISUAL_ID));
		if (parser != null)
		{
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else
		{
			RentalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAddress_3001Text(View view)
	{
		IParser parser = RentalParserProvider.getParser(RentalElementTypes.Address_3001,
				view.getElement() != null ? view.getElement() : view,
				RentalVisualIDRegistry.getType(AddressCity2EditPart.VISUAL_ID));
		if (parser != null)
		{
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else
		{
			RentalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLicense_3002Text(View view)
	{
		IParser parser = RentalParserProvider.getParser(RentalElementTypes.License_3002,
				view.getElement() != null ? view.getElement() : view,
				RentalVisualIDRegistry.getType(LicenseNumberEditPart.VISUAL_ID));
		if (parser != null)
		{
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else
		{
			RentalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRentalCustomer_4001Text(View view)
	{
		IParser parser = RentalParserProvider.getParser(RentalElementTypes.RentalCustomer_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null)
		{
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else
		{
			RentalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRentalRentedObject_4002Text(View view)
	{
		IParser parser = RentalParserProvider.getParser(RentalElementTypes.RentalRentedObject_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null)
		{
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else
		{
			RentalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view)
	{
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view)
	{
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig)
	{
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento)
	{
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento)
	{
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement)
	{
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view)
	{
		return RentalAgencyEditPart.MODEL_ID.equals(RentalVisualIDRegistry.getModelID(view));
	}

}

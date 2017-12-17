package com.opcoach.training.rental.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import com.opcoach.training.rental.diagram.providers.RentalElementTypes;

/**
 * @generated
 */
public class RentalPaletteFactory
{

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot)
	{
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group()
	{
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAddress1CreationTool());
		paletteContainer.add(createCustomer2CreationTool());
		paletteContainer.add(createLicense3CreationTool());
		paletteContainer.add(createRental4CreationTool());
		paletteContainer.add(createRentalObject5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group()
	{
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createCustomer1CreationTool());
		paletteContainer.add(createRentedObject2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAddress1CreationTool()
	{
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RentalElementTypes.Address_2001);
		types.add(RentalElementTypes.Address_3001);
		NodeToolEntry entry = new NodeToolEntry(Messages.Address1CreationTool_title, Messages.Address1CreationTool_desc, types);
		entry.setId("createAddress1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RentalElementTypes.getImageDescriptor(RentalElementTypes.Address_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomer2CreationTool()
	{
		NodeToolEntry entry = new NodeToolEntry(Messages.Customer2CreationTool_title, Messages.Customer2CreationTool_desc,
				Collections.singletonList(RentalElementTypes.Customer_2003));
		entry.setId("createCustomer2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RentalElementTypes.getImageDescriptor(RentalElementTypes.Customer_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLicense3CreationTool()
	{
		NodeToolEntry entry = new NodeToolEntry(Messages.License3CreationTool_title, Messages.License3CreationTool_desc,
				Collections.singletonList(RentalElementTypes.License_3002));
		entry.setId("createLicense3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RentalElementTypes.getImageDescriptor(RentalElementTypes.License_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRental4CreationTool()
	{
		NodeToolEntry entry = new NodeToolEntry(Messages.Rental4CreationTool_title, Messages.Rental4CreationTool_desc,
				Collections.singletonList(RentalElementTypes.Rental_2004));
		entry.setId("createRental4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RentalElementTypes.getImageDescriptor(RentalElementTypes.Rental_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRentalObject5CreationTool()
	{
		NodeToolEntry entry = new NodeToolEntry(Messages.RentalObject5CreationTool_title, Messages.RentalObject5CreationTool_desc,
				Collections.singletonList(RentalElementTypes.RentalObject_2002));
		entry.setId("createRentalObject5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RentalElementTypes.getImageDescriptor(RentalElementTypes.RentalObject_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomer1CreationTool()
	{
		LinkToolEntry entry = new LinkToolEntry(Messages.Customer1CreationTool_title, Messages.Customer1CreationTool_desc,
				Collections.singletonList(RentalElementTypes.RentalCustomer_4001));
		entry.setId("createCustomer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RentalElementTypes.getImageDescriptor(RentalElementTypes.RentalCustomer_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRentedObject2CreationTool()
	{
		LinkToolEntry entry = new LinkToolEntry(Messages.RentedObject2CreationTool_title, Messages.RentedObject2CreationTool_desc,
				Collections.singletonList(RentalElementTypes.RentalRentedObject_4002));
		entry.setId("createRentedObject2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RentalElementTypes.getImageDescriptor(RentalElementTypes.RentalRentedObject_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry
	{

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes)
		{
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool()
		{
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry
	{

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description, List<IElementType> relationshipTypes)
		{
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool()
		{
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}

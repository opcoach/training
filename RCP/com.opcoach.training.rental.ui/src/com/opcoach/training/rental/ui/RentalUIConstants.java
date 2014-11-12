package com.opcoach.training.rental.ui;

/**
 * Constant definitions for plug-in preferences, keys for colors, and to identify objects nature.
 */
public interface RentalUIConstants {

	
	// Constants to manage object images in registry. Constant values are path to icons
	public static final String IMG_AGENCY = "icons/Agency.png";
	public static final String IMG_CUSTOMER = "icons/Customers.png";
	public static final String IMG_RENTAL = "icons/Rentals.png";
	public static final String IMG_RENTAL_OBJECT = "icons/RentalObjects.png";
	public static final String IMG_COLLAPSE_ALL = "icons/collapseall.gif";
	public static final String IMG_EXPAND_ALL = "icons/expandall.gif";

	
	// Constants for preference values 
	public static final String PREF_DISPLAY_COUNT = "displayCounter";
	public static final String PREF_PALETTE = "palette";
	public static final String PREF_CUSTOMER_COLOR = "customerColor";
	public static final String PREF_RENTAL_COLOR = "rentalColor";
	public static final String PREF_RENTAL_OBJECT_COLOR = "rentalObjectColor";
	
	// Nodes for providers
	public static final String CUSTOMERS_NODE = "Clients";
	public static final String RENTALS_NODE = "Locations";
	public static final String OBJECTS_NODE = "Objets à louer";

	// Constants for font values
	public static final String FONT_CUSTOMER = "customerFont";
	public static final String FONT_RENTAL_OBJECT  = "rentalObjectKey";


	
}

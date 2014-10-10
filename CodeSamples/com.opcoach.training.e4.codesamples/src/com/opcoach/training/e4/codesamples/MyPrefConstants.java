package com.opcoach.training.e4.codesamples;


/**
 * Constant definitions for plug-in preferences, keys for colors, and to identify objects nature.
 */
public interface MyPrefConstants {

	public static final String PLUGIN_ID = "com.opcoach.training.e4.rental.ui";
	public static final String RENTAL_UI_PREF_STORE = PLUGIN_ID + ".preferenceStore";
	public static final String RENTAL_UI_IMG_REGISTRY = PLUGIN_ID + ".imageRegistry";

	
	// Constants to manage object images in registry
	public static final String AGENCY_IMG_KEY = "agencyImage";
	public static final String CUSTOMER_IMG_KEY = "customerImage";
	public static final String RENTAL_IMG_KEY  = "rentalImage";
	public static final String RENTAL_OBJECT_IMG_KEY  = "rentalObjectImage";
	

	// Constants to manage object images in registry. Constant values are path to icons
	public static final String IMG_AGENCY = "icons/Agency.png";
	public static final String IMG_CUSTOMER = "icons/Customers.png";
	public static final String IMG_RENTAL = "icons/Rentals.png";
	public static final String IMG_RENTAL_OBJECT = "icons/RentalObjects.png";

	
	// Nodes for providers
	public static final String CUSTOMERS_NODE = "Clients";
	public static final String RENTALS_NODE = "Locations";
	public static final String OBJECTS_NODE = "Objets � louer";
	
	// Preferences constants
	public static final String PALETTE_MANAGER = "com.opcoach.training.e4.rental.ui.paletteManager";
	public static final String PREF_PALETTE = "prefPalette";
	public static final String PREF_CUSTOMER_COLOR = "CustomerColor";
	public static final String PREF_RENTAL_COLOR= "RentalColor";
	public static final String PREF_RENTAL_OBJECT_COLOR = "RentalObjectColor";
	public static final String PREF_PATH = "prefPath";
	public static final String NONE_PALETTE = "com.opcoach.training.e4.rental.ui.NonePalette";

	public static final String PREF_DISPLAY_COUNT = "displayCounterPref";


	
}

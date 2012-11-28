package com.opcoach.training.rental.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
	private static final String BUNDLE_NAME = "com.opcoach.training.rental.ui.messages"; //$NON-NLS-1$
	public static String RentalPropertyView_dateFormat;
	public static String RentalPropertyView_From;
	public static String RentalPropertyView_Information;
	public static String RentalPropertyView_RentalDateTitle;
	public static String RentalPropertyView_RentedBy;
	public static String RentalPropertyView_To;
	static
	{
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages()
	{
	}
}

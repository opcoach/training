package com.opcoach.training.rental.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
	private static final String BUNDLE_NAME = Messages.class.getPackage().getName() + ".messages"; //$NON-NLS-1$
	public static String RentalPropertyView_dateFormat;
	public static String RentalPropertyView_From;
	public static String RentalPropertyView_Information;
	public static String RentalPropertyView_RentalDateTitle;
	public static String RentalPropertyView_RentedBy;
	public static String RentalPropertyView_To;
	public static String SampleCommandHandler_0;
	public static String SampleCommandHandler_1;
	public static String SampleCommandHandler_2;
	public static String SampleCommandHandler_3;

	static
	{
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
		
	}

	private Messages()
	{
	}
}

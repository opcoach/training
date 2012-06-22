// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.helpers;

import java.io.IOException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import com.opcoach.training.rental.MyRentalAgency;
import com.opcoach.training.rental.RentalAgency;

/**
 * @author olivier
 */
public class ObserveAgency
{
	public static class RentalAgencyAdapter extends AdapterImpl
	{
		@Override
		public void notifyChanged(Notification msg)
		{
			if (msg.getNotifier() instanceof MyRentalAgency)
			{
				System.out.println("RentalAgency touched : " + ((MyRentalAgency) msg.getNotifier()).getName());
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		// Store a sample Rental.
		RentalAgency agency = RentalAgencyGenerator.createSampleAgency();
		Adapter cadapter = new RentalAgencyAdapter();
		agency.eAdapters().add(cadapter);
		agency.setName("Bordeaux");

	}
}

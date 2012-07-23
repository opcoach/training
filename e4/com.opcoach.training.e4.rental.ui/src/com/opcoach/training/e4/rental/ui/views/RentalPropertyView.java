package com.opcoach.training.e4.rental.ui.views;

import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.core.RentalCoreActivator;

public class RentalPropertyView
{
	public static final String VIEW_ID = "com.opcoach.rental.e4.ui.views.rentalView"; //$NON-NLS-1$

	private Label rentedObjectLabel;
	private Label customerNameLabel;
	private Label startDateLabel;
	private Label endDateLabel;

	@PostConstruct
	public void createContent(Composite parent)
	{
		parent.setLayout(new GridLayout(1, false));

		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setText("Information");
		infoGroup.setLayout(new GridLayout(2, false));

		rentedObjectLabel = new Label(infoGroup, SWT.BORDER);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		rentedObjectLabel.setLayoutData(gd);

		DragSource ds = new DragSource(rentedObjectLabel, DND.DROP_COPY);
		ds.setTransfer(new Transfer[] { TextTransfer.getInstance() });
		ds.addDragListener(new DragSourceAdapter() {
			public void dragSetData(DragSourceEvent event)
			{
				if (TextTransfer.getInstance().isSupportedType(event.dataType))
				{
					event.data = rentedObjectLabel.getText();
				}
			}

			/*
			 * public void dragStart(DragSourceEvent event) { event.image =
			 * RentalUIActivator
			 * .getDefault().getImageRegistry().get(RentalUIConstants
			 * .AGENCY_KEY); }
			 */

		});

		Label customerTitle = new Label(infoGroup, SWT.NONE);
		customerTitle.setText("Client : ");
		customerNameLabel = new Label(infoGroup, SWT.NONE);

		Group dateGroup = new Group(parent, SWT.NONE);
		dateGroup.setText("Dates");
		dateGroup.setLayout(new GridLayout(2, false));

		Label startDateTitle = new Label(dateGroup, SWT.NONE);
		startDateTitle.setText("Start date :");
		startDateLabel = new Label(dateGroup, SWT.NONE);

		Label endDateTitle = new Label(dateGroup, SWT.NONE);
		endDateTitle.setText("End date");
		endDateLabel = new Label(dateGroup, SWT.NONE);

		// Try with sample
		RentalAgency agency = RentalCoreActivator.getAgency();
		setRental(agency.getRentals().get(0));

	}

	public void setRental(Rental r)
	{
		if (r == null)
		{
			rentedObjectLabel.setText("                               ");
			customerNameLabel.setText(" ");
			startDateLabel.setText(" ");
			endDateLabel.setText("                                    ");
		} else
		{
			rentedObjectLabel.setText(r.getRentedObject().getName());
			Customer c = r.getCustomer();
			customerNameLabel.setText(c.getDisplayName());

			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			startDateLabel.setText(df.format(r.getStartDate()));
			endDateLabel.setText(df.format(r.getEndDate()));
		}

	}

	@Inject
	public void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object o, 
			                 Adapter adapter)
	{
		Rental r = adapter.adapt(o, Rental.class);
		setRental(r);

	}

}

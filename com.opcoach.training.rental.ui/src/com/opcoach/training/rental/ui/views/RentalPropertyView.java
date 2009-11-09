package com.opcoach.training.rental.ui.views;

import java.text.SimpleDateFormat;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.ui.RentalUIActivator;

public class RentalPropertyView extends ViewPart
{
	private Label rentedObjectLabel;
	private Label customerNameLabel;
	private Label startDateLabel;
	private Label endDateLabel;

	public RentalPropertyView()
	{
	}

	@Override
	public void createPartControl(Composite parent)
	{
		parent.setLayout(new GridLayout(2, false));

		rentedObjectLabel = new Label(parent, SWT.BORDER);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		rentedObjectLabel.setLayoutData(gd);

		Label customerTitle = new Label(parent, SWT.NONE);
		customerTitle.setText("Loué à : ");
		customerNameLabel = new Label(parent, SWT.NONE);

		Label startDateTitle = new Label(parent, SWT.NONE);
		startDateTitle.setText("du : ");
		startDateLabel = new Label(parent, SWT.NONE);

		Label endDateTitle = new Label(parent, SWT.NONE);
		endDateTitle.setText("au : ");
		endDateLabel = new Label(parent, SWT.NONE);

		// Try with sample
		RentalAgency agency = RentalUIActivator.getAgency();
		setRental(agency.getRentals().get(0));

	}

	public void setRental(Rental r)
	{
		rentedObjectLabel.setText(r.getRentedObject().getName());
		Customer c = r.getCustomer();
		customerNameLabel.setText(c.getDisplayName());

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		startDateLabel.setText(df.format(r.getStartDate()));
		endDateLabel.setText(df.format(r.getEndDate()));

	}

	@Override
	public void setFocus()
	{
		// TODO Auto-generated method stub

	}

}

package com.opcoach.training.rental.ui.views;

import java.text.SimpleDateFormat;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.core.RentalCoreActivator;

public class RentalPropertyView extends ViewPart implements ISelectionListener
{
	public static final String VIEW_ID = "com.opcoach.rental.ui.views.rentalView";

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
		RentalAgency agency = RentalCoreActivator.getAgency();
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
	public void init(IViewSite site) throws PartInitException
	{
		// TODO Auto-generated method stub
		super.init(site);
		
		site.getPage().addSelectionListener(this);
	}

	@Override
	public void setFocus()
	{
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection)
	{
		if (selection instanceof IStructuredSelection)
		{
			Object sel = ((IStructuredSelection) selection).getFirstElement();
			
			if (sel == null)
				return;
			
			// Est ce une rental directement ? 
			if (sel instanceof Rental)
			{
				setRental((Rental) sel);
			}
			
			// Existe t il un adapter en rental ? 
			Rental r = (Rental) Platform.getAdapterManager().getAdapter(sel, Rental.class);
			if (r != null)
			{
				setRental(r);
			}
			else if (sel instanceof IAdaptable)
			{
				// Sinon l'objet est il finalement adaptable ? 
				IAdaptable selAd = (IAdaptable) sel;
				r = (Rental) selAd.getAdapter(Rental.class);
				if (r != null)
				{
					setRental(r);
				}
			}
			
			
		}
		
	}

}

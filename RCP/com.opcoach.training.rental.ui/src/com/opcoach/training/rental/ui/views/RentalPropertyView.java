package com.opcoach.training.rental.ui.views;

import java.text.SimpleDateFormat;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.core.RentalCoreActivator;
import com.opcoach.training.rental.ui.Messages;
import com.opcoach.training.rental.ui.RentalUIActivator;
import com.opcoach.training.rental.ui.RentalUIConstants;

public class RentalPropertyView extends ViewPart implements ISelectionListener
{
	public static final String VIEW_ID = "com.opcoach.rental.ui.views.rentalView"; //$NON-NLS-1$

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
		parent.setLayout(new GridLayout(1, false));

		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setText(Messages.RentalPropertyView_Information);
		infoGroup.setLayout(new GridLayout(2, false));

		rentedObjectLabel = new Label(infoGroup, SWT.BORDER);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		rentedObjectLabel.setLayoutData(gd);

		DragSource ds = new DragSource(rentedObjectLabel, DND.DROP_COPY);
		ds.setTransfer(new Transfer[] { TextTransfer.getInstance() });
		ds.addDragListener(new DragSourceAdapter()
			{
				public void dragSetData(DragSourceEvent event)
				{
					if (TextTransfer.getInstance().isSupportedType(event.dataType))
					{
						event.data = rentedObjectLabel.getText();
					}
				}

				@Override
				public void dragStart(DragSourceEvent event)
				{
					event.image = RentalUIActivator.getDefault().getImageRegistry().get(RentalUIConstants.AGENCY_KEY);
				}

			});

		Label customerTitle = new Label(infoGroup, SWT.NONE);
		customerTitle.setText(Messages.RentalPropertyView_RentedBy);
		customerNameLabel = new Label(infoGroup, SWT.NONE);

		Group dateGroup = new Group(parent, SWT.NONE);
		dateGroup.setText(Messages.RentalPropertyView_RentalDateTitle);
		dateGroup.setLayout(new GridLayout(2, false));

		Label startDateTitle = new Label(dateGroup, SWT.NONE);
		startDateTitle.setText(Messages.RentalPropertyView_From);
		startDateLabel = new Label(dateGroup, SWT.NONE);

		Label endDateTitle = new Label(dateGroup, SWT.NONE);
		endDateTitle.setText(Messages.RentalPropertyView_To);
		endDateLabel = new Label(dateGroup, SWT.NONE);

		// Try with sample
		RentalAgency agency = RentalCoreActivator.getAgency();
		setRental(agency.getRentals().get(0));

	}

	public void setRental(Rental r)
	{
		if (r==null)
		{
			rentedObjectLabel.setText(" ");
			customerNameLabel.setText(" ");
			startDateLabel.setText(" ");
			endDateLabel.setText(" ");
		}
		else
		{
			rentedObjectLabel.setText(r.getRentedObject().getName());
			Customer c = r.getCustomer();
			customerNameLabel.setText(c.getDisplayName());

			SimpleDateFormat df = new SimpleDateFormat(Messages.RentalPropertyView_dateFormat);
			startDateLabel.setText(df.format(r.getStartDate()));
		endDateLabel.setText(df.format(r.getEndDate()));
		}

	}

	@Override
	public void init(IViewSite site) throws PartInitException
	{
		super.init(site);
		site.getPage().addSelectionListener(this);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose()
	{
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
	}

	@Override
	public void setFocus()
	{

    }
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.
	 * IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection)
	{
		if (selection.isEmpty())
			return;
		
		if (selection instanceof IStructuredSelection)
		{
			Object sel = ((IStructuredSelection) selection).getFirstElement();

			// La selection courante est elle un Rental ou adaptable en Rental ? 
			Rental r = (Rental) Platform.getAdapterManager().getAdapter(sel, Rental.class);
			setRental(r);

		}

	}

}

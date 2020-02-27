package com.opcoach.training.e4.rental.ui.parts;

import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.resource.ImageRegistry;
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

import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class RentalPropertyPart {
	// private DataBindingContext m_bindingContext;
	public static final String VIEW_ID = "com.opcoach.rental.e4.ui.views.rentalView"; //$NON-NLS-1$

	protected Label rentedObjectLabel, customerNameLabel, startDateLabel, endDateLabel;
	protected Rental currentRental;
	protected Label customerTitle;
	@Inject
	@Named(RentalUIConstants.RENTAL_UI_IMG_REGISTRY)
	ImageRegistry reg;

	@PostConstruct
	public void createContent(Composite parent, RentalAgency agency) {
		parent.setLayout(new GridLayout(1, false));

		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
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
			public void dragSetData(DragSourceEvent event) {
				if (TextTransfer.getInstance().isSupportedType(event.dataType)) {
					event.data = rentedObjectLabel.getText();
				}
			}

			public void dragStart(DragSourceEvent event) {
				event.image = reg.get(RentalUIConstants.IMG_AGENCY);
			}

		});

		customerTitle = new Label(infoGroup, SWT.NONE);
		customerTitle.setText("Client : ");
		customerNameLabel = new Label(infoGroup, SWT.NONE);
		customerNameLabel.setText("        ");

		Group dateGroup = new Group(parent, SWT.NONE);
		dateGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		dateGroup.setText("Dates");
		dateGroup.setLayout(new GridLayout(2, false));

		Label startDateTitle = new Label(dateGroup, SWT.NONE);
		startDateTitle.setText("Start date :");
		startDateLabel = new Label(dateGroup, SWT.NONE);
		startDateLabel.setText(" default start date  ");

		Label endDateTitle = new Label(dateGroup, SWT.NONE);
		endDateTitle.setText("End date");
		endDateLabel = new Label(dateGroup, SWT.NONE);

		// Try with sample (agency injected)
		setRental(agency.getRentals().get(0));
		// m_bindingContext = initDataBindings();

	}

	public boolean isUICreated() {
		return rentedObjectLabel != null;
	}

	/**
	 * This method is inject and option -> not called when object is built if
	 * injection is not possible
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object o, Adapter adapter) {
		if (isUICreated()) {
			Rental r = adapter.adapt(o, Rental.class);
			setRental(r);
		}

	}

	public void setRental(Rental r) {
		currentRental = r;
		// if (r != null)
		// initDataBindings();

		if (rentedObjectLabel == null)
			return; // ui not created yet
		if (r == null) {
			rentedObjectLabel.setText("        NO RENTED OBJECT               ");
			customerNameLabel.setText(" ");
			startDateLabel.setText(" ");
			endDateLabel.setText("                                    ");
		} else {
			rentedObjectLabel.setText(r.getRentedObject().getName());
			Customer c = r.getCustomer();
			customerNameLabel.setText(c.getDisplayName());

			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			startDateLabel.setText(df.format(r.getStartDate()));
			endDateLabel.setText(df.format(r.getEndDate()));
		}

	}

	@Focus
	private void setFocus() {
		rentedObjectLabel.setFocus();
	}

	/*
	 * protected DataBindingContext initDataBindings() { DataBindingContext
	 * bindingContext = new DataBindingContext(); // IObservableValue
	 * observeTextRentedObjectLabelObserveWidget =
	 * WidgetProperties.text().observe(rentedObjectLabel); IObservableValue
	 * currentRentalNameObserveValue = EMFProperties
	 * .value(FeaturePath.fromList(Literals.RENTAL__RENTED_OBJECT,
	 * Literals.RENTAL_OBJECT__NAME)) .observe(currentRental);
	 * bindingContext.bindValue(observeTextRentedObjectLabelObserveWidget,
	 * currentRentalNameObserveValue, null, null); // IObservableValue
	 * observeTextCustomerNameLabelObserveWidget =
	 * WidgetProperties.text().observe(customerNameLabel); IObservableValue
	 * displayNameCurrentRentalgetCustomerObserveValue =
	 * PojoProperties.value("displayName") .observe(currentRental.getCustomer());
	 * bindingContext.bindValue(observeTextCustomerNameLabelObserveWidget,
	 * displayNameCurrentRentalgetCustomerObserveValue, null, null); //
	 * IObservableValue observeTextStartDateLabelObserveWidget =
	 * WidgetProperties.text().observe(startDateLabel); IObservableValue
	 * currentRentalStartDateObserveValue =
	 * EMFObservables.observeValue(currentRental, Literals.RENTAL__START_DATE);
	 * UpdateValueStrategy strategy = new UpdateValueStrategy();
	 * strategy.setConverter(new DateToStringConverter());
	 * bindingContext.bindValue(observeTextStartDateLabelObserveWidget,
	 * currentRentalStartDateObserveValue, null, strategy); // IObservableValue
	 * observeTextEndDateLabelObserveWidget =
	 * WidgetProperties.text().observe(endDateLabel); IObservableValue
	 * currentRentalEndDateObserveValue = EMFObservables.observeValue(currentRental,
	 * Literals.RENTAL__END_DATE); UpdateValueStrategy strategy_1 = new
	 * UpdateValueStrategy(); strategy_1.setConverter(new DateToStringConverter());
	 * bindingContext.bindValue(observeTextEndDateLabelObserveWidget,
	 * currentRentalEndDateObserveValue, null, strategy_1); // return
	 * bindingContext; }
	 */
}

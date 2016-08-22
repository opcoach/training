package com.opcoach.training.rental.ui.views;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalPackage.Literals;

public class CustomerViewPart extends ViewPart implements ISelectionListener
{
	private DataBindingContext m_bindingContext;

	public static final String ID = "com.opcoach.training.rental.ui.views.CustomerViewPart"; //$NON-NLS-1$
	private Text txtAName;
	private Text txtUnPrnom;
	private Customer currentCustomer;

	public CustomerViewPart()
	{
	}

	@Override
	public void init(IViewSite site) throws PartInitException
	{
		super.init(site);
		site.getPage().addSelectionListener(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose()
	{
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FormLayout());

		Group grpIdentity = new Group(container, SWT.NONE);
		FormData fd_grpIdentity = new FormData();
		fd_grpIdentity.bottom = new FormAttachment(0, 94);
		fd_grpIdentity.right = new FormAttachment(0, 402);
		fd_grpIdentity.top = new FormAttachment(0);
		fd_grpIdentity.left = new FormAttachment(0);
		grpIdentity.setLayoutData(fd_grpIdentity);
		grpIdentity.setText("Identity");
		grpIdentity.setLayout(new GridLayout(2, false));

		Label label = new Label(grpIdentity, SWT.NONE);
		label.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		label.setText("display Name");
		label.setAlignment(SWT.CENTER);

		Label lblNom = new Label(grpIdentity, SWT.NONE);
		lblNom.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNom.setText("Nom : ");

		txtAName = new Text(grpIdentity, SWT.BORDER);
		txtAName.setText("A name");
		txtAName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblPrnom = new Label(grpIdentity, SWT.NONE);
		lblPrnom.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPrnom.setText("Pr\u00E9nom");

		txtUnPrnom = new Text(grpIdentity, SWT.BORDER);
		txtUnPrnom.setText("Un pr\u00E9nom");
		txtUnPrnom.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Group grpAdresse = new Group(container, SWT.NONE);
		grpAdresse.setText("Adresse");
		grpAdresse.setLayout(new FillLayout(SWT.HORIZONTAL));
		FormData fd_grpAdresse = new FormData();
		fd_grpAdresse.right = new FormAttachment(grpIdentity, 0, SWT.RIGHT);
		fd_grpAdresse.bottom = new FormAttachment(100, -12);
		fd_grpAdresse.top = new FormAttachment(grpIdentity, 6);
		fd_grpAdresse.left = new FormAttachment(0);
		grpAdresse.setLayoutData(fd_grpAdresse);

		Label lblAdresse = new Label(grpAdresse, SWT.NONE);
		lblAdresse.setText("Adresse");

	}

	public void setCustomer(Customer c)
	{
		currentCustomer = c;
		if (m_bindingContext != null)
		{
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		
		if (c != null)
		{
			m_bindingContext = initDataBindings();
		}
		else
		{
			// Fill with default
			txtAName.setText(" ");
			txtUnPrnom.setText(" ");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
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

			// Is current selection a customer or adaptable into a Customer ? 
			Customer c = Platform.getAdapterManager().getAdapter(sel, Customer.class);
			setCustomer(c);

		}

	}

	@Override
	public void setFocus()
	{
		// Set the focus
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtANameObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtAName);
		IObservableValue currentCustomerLastNameObserveValue = EMFObservables.observeValue(currentCustomer, Literals.CUSTOMER__LAST_NAME);
		bindingContext.bindValue(observeTextTxtANameObserveWidget, currentCustomerLastNameObserveValue, null, new EMFUpdateValueStrategy());
		//
		IObservableValue observeTextTxtUnPrnomObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtUnPrnom);
		IObservableValue currentCustomerFirstNameObserveValue = EMFObservables.observeValue(currentCustomer, Literals.CUSTOMER__FIRST_NAME);
		bindingContext.bindValue(observeTextTxtUnPrnomObserveWidget, currentCustomerFirstNameObserveValue, null, new EMFUpdateValueStrategy());
		//
		return bindingContext;
	}
}

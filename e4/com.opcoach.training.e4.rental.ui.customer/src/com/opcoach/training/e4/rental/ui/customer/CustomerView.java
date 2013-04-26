package com.opcoach.training.e4.rental.ui.customer;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.e4.ui.services.IServiceConstants;
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

import com.opcoach.training.rental.Customer;

public class CustomerView
{

	public static final String ID = "com.opcoach.training.e4.rental.ui.views.CustomerView"; //$NON-NLS-1$
	private Text txtAName;
	private Text txtUnPrnom;

	public CustomerView()
	{
		System.out.println("Appel constructeur Customer View");
	}

	
	/**
	 * Create contents of the view part.
	 * 
	 * @param parent received by injection
	 */
	@Inject
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
		if (c != null)
		{
			txtAName.setText(c.getLastName());
			txtUnPrnom.setText(c.getFirstName());
		} else
		{
			txtAName.setText("");
			txtUnPrnom.setText("");
		}
	}

	
	@Inject
	public void selectACustomer(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object o, Adapter adapter)
	{
		System.out.println("Entree dans selectACustomer");
		Customer c = adapter.adapt(o, Customer.class);
		setCustomer(c);
	}

}

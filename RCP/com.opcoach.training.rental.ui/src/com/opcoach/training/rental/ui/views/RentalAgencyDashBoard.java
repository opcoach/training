package com.opcoach.training.rental.ui.views;

import java.text.SimpleDateFormat;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.core.RentalCoreActivator;
import com.opcoach.training.rental.ui.RentalUIActivator;

public class RentalAgencyDashBoard extends ViewPart implements IPropertyChangeListener
{
	public static final String VIEW_ID = "com.opcoach.rental.ui.agencyDashboard";

	private TableViewer objectViewer;
	private TableViewer rentalViewer;
	private TableViewer customerViewer;


	public RentalAgencyDashBoard()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent)
	{		
		parent.setLayout(new GridLayout(1,false));
		Composite top = new Composite(parent, SWT.BORDER);
		top.setLayout(new GridLayout(2,true));
		top.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
		Composite bottom = new Composite(parent, SWT.BORDER);
		bottom.setLayout(new GridLayout(1,true));
		bottom.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));

		RentalAgency currentAgency = RentalCoreActivator.getAgency();
		
		// Create the 2 title lables in top.
		Label cTitle = new Label(top, SWT.NONE);
		cTitle.setLayoutData(new GridData(SWT.CENTER));
		cTitle.setText("Customers");
		
		Label cObjects = new Label(top, SWT.NONE);
		cObjects.setLayoutData(new GridData(SWT.CENTER));
		cObjects.setText("Objects");
		
		customerViewer = createCustomerTable(top, currentAgency);
		objectViewer = createObjectTable(top, currentAgency);
		rentalViewer = createRentalTable(bottom, currentAgency);
		
	
	}

	

	private TableViewer createCustomerTable(Composite top, RentalAgency currentAgency)
	{
		// Create the customer table with 2 columns: firstname and name
		TableViewer viewer = new TableViewer(top);
		final Table cTable = viewer.getTable();
		cTable.setHeaderVisible(true);
		cTable.setLinesVisible(true);
		GridData gd_cTable = new GridData(SWT.FILL);
		gd_cTable.verticalAlignment = SWT.TOP;
		cTable.setLayoutData(gd_cTable);
		
		// Create the first column for firstname
		TableViewerColumn firstNameCol = new TableViewerColumn(viewer, SWT.NONE);
		firstNameCol.getColumn().setWidth(200);
		firstNameCol.getColumn().setText("Firstname");
		firstNameCol.setLabelProvider(new ColumnLabelProvider() {@Override
		public String getText(Object element)
		{
			return ((Customer)element).getFirstName();
		}});
		
		// Create the second column for name
		TableViewerColumn nameCol = new TableViewerColumn(viewer, SWT.NONE);
		nameCol.getColumn().setWidth(200);
		nameCol.getColumn().setText("LastName");
		nameCol.setLabelProvider(new ColumnLabelProvider() {@Override
		public String getText(Object element)
		{
			return ((Customer)element).getLastName();
		}});
		
		// Set input data and content provider (default ArrayContentProvider)
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setInput(currentAgency.getCustomers());
		
		setMenuAndSelectionOnViewer(viewer);

		return viewer;
	}
	
	private TableViewer createObjectTable(Composite top, RentalAgency currentAgency)
	{
		// Create the object table with 1 column : name
		TableViewer viewer = new TableViewer(top);  //, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		final Table cTable = viewer.getTable();
		cTable.setHeaderVisible(true);
		cTable.setLinesVisible(true);
		GridData gd_cTable = new GridData(SWT.FILL);
		gd_cTable.verticalAlignment = SWT.TOP;
		cTable.setLayoutData(gd_cTable);
		
		
		TableViewerColumn nameCol = new TableViewerColumn(viewer, SWT.NONE);
		nameCol.getColumn().setWidth(100);
		nameCol.getColumn().setText("Name");
		nameCol.setLabelProvider(new ColumnLabelProvider() {@Override
		public String getText(Object element)
		{
			return ((RentalObject)element).getName();
		}});
		
		// Set input data and content provider (default ArrayContentProvider)
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setInput(currentAgency.getObjectsToRent());
		
		// Set menu manager and selection provider on viewer (can be removed)
		setMenuAndSelectionOnViewer(viewer);

		return viewer;
	}
	
	private TableViewer createRentalTable(Composite top, RentalAgency currentAgency)
	{
		// Create the rental table with 2 columns: firstname and name
		TableViewer viewer = new TableViewer(top);
		final Table cTable = viewer.getTable();
		cTable.setHeaderVisible(true);
		cTable.setLinesVisible(true);
		cTable.setLayoutData(new GridData(SWT.FILL));
		
		
		TableViewerColumn objectCol = new TableViewerColumn(viewer, SWT.NONE);
		objectCol.getColumn().setWidth(150);
		objectCol.getColumn().setText("Object");
		objectCol.setLabelProvider(new ColumnLabelProvider() {@Override
		public String getText(Object element)
		{
			return ((Rental)element).getRentedObject().getName();
		}});
		TableViewerColumn customerCol = new TableViewerColumn(viewer, SWT.NONE);
		customerCol.getColumn().setWidth(150);
		customerCol.getColumn().setText("Customer");
		customerCol.setLabelProvider(new ColumnLabelProvider() {@Override
		public String getText(Object element)
		{
			return ((Rental)element).getCustomer().getDisplayName();
		}});
		
		TableViewerColumn startDateCol = new TableViewerColumn(viewer, SWT.NONE);
		startDateCol.getColumn().setWidth(150);
		startDateCol.getColumn().setText("Start Date");
		startDateCol.setLabelProvider(new ColumnLabelProvider() {@Override
		public String getText(Object element)
		{
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			return df.format(((Rental)element).getStartDate());
		}});
		
		TableViewerColumn endDateCol = new TableViewerColumn(viewer, SWT.NONE);
		endDateCol.getColumn().setWidth(150);
		endDateCol.getColumn().setText("End Date");
		endDateCol.setLabelProvider(new ColumnLabelProvider() {@Override
		public String getText(Object element)
		{
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			return df.format(((Rental)element).getEndDate());
		}});
		
		
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setInput(currentAgency.getRentals());
		
		// Set menu manager and selection provider on viewer (can be removed)
		setMenuAndSelectionOnViewer(viewer);
		return viewer;
	}
	
	private void setMenuAndSelectionOnViewer(TableViewer v)
	{
		// viewer has a popup
		MenuManager menuManager = new MenuManager();
		Menu menu = menuManager.createContextMenu(v.getControl());
		v.getControl().setMenu(menu);
		getSite().registerContextMenu(menuManager, v);
		// viewer sends selection
		getSite().setSelectionProvider(v);
	}
	
	
	@Override
	public void init(IViewSite site) throws PartInitException
	{
		super.init(site);
		// On s'enregistre en tant que pref listener sur le preference store...
		RentalUIActivator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
				
	}
	
	@Override
	public void dispose()
	{
		RentalUIActivator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
		super.dispose();
	}

	@Override
	public void propertyChange(PropertyChangeEvent event)
	{	
		customerViewer.refresh();
	}

	@Override
	public void setFocus()
	{
		// TODO Auto-generated method stub

	}

}

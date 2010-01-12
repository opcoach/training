package com.opcoach.training.rental.ui.views;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.ui.RentalUIActivator;

public class RentalAgencyView extends ViewPart implements IPropertyChangeListener
{
	

	TreeViewer agencyViewer;

	public RentalAgencyView()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent)
	{
		agencyViewer = new TreeViewer(parent);
		agencyViewer.setContentProvider(new AgencyContentProvider(RentalUIActivator.getAgency()));
		agencyViewer.setLabelProvider(new AgencyLabelProvider());
		agencyViewer.setInput(AgencyContentProvider.ROOT_AGENCY_NODE);
		getSite().setSelectionProvider(agencyViewer);		
		
		//  On s'enregistre en tant que pref listener sur le preference store...
		RentalUIActivator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent event)
	{
		agencyViewer.refresh();
	}

	@Override
	public void setFocus()
	{
		// TODO Auto-generated method stub

	}

}

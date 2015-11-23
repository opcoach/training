package com.opcoach.training.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.core.RentalCoreActivator;
import com.opcoach.training.rental.ui.RentalUIActivator;

public class RentalAgencyUIFormView extends ViewPart implements IPropertyChangeListener
{
	private TreeViewer agencyViewer;


	public RentalAgencyUIFormView()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent)
	{
       FormToolkit toolkit = new FormToolkit(parent.getDisplay());
       
       Form form = toolkit.createForm(parent);
       form.setText("Agency View en UIForm");
       form.getBody().setLayout(new FillLayout());
       Tree t = toolkit.createTree(form.getBody(), SWT.V_SCROLL	| SWT.H_SCROLL);
       t.setLayoutData(new TableWrapData(TableWrapData.FILL));
       
       agencyViewer = new TreeViewer(t);
		RentalProvider provider = new RentalProvider();
		agencyViewer.setContentProvider(provider);
		agencyViewer.setLabelProvider(provider);
		Collection<RentalAgency> agencies = new ArrayList<RentalAgency>();
		agencies.add(RentalCoreActivator.getAgency());
		agencyViewer.setInput(agencies);
		
		// Autorise le popup sur le treeviewer
		MenuManager menuManager = new MenuManager();
		Menu menu = menuManager.createContextMenu(agencyViewer.getControl());
		agencyViewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuManager, agencyViewer);
		
		
		
		getSite().setSelectionProvider(agencyViewer);		
		
		//  On s'enregistre en tant que pref listener sur le preference store...
		RentalUIActivator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
       

	}

	@Override
	public void setFocus()
	{
		// TODO Auto-generated method stub

	}
	
	@Override
	public void propertyChange(PropertyChangeEvent event)
	{
		agencyViewer.refresh();
	}

}

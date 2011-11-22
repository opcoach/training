package com.opcoach.training.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.core.RentalCoreActivator;
import com.opcoach.training.rental.ui.RentalUIActivator;

public class RentalAgencyView extends ViewPart implements IPropertyChangeListener
{
	public static final String VIEW_ID = "com.opcoach.rental.ui.rentalagencyview";

	private TreeViewer agencyViewer;

	private AgencyLabelProvider labelProvider;

	public RentalAgencyView()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent)
	{
		
		// Association de la vue sur un contexte d'aide
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "rentalContext");
		
		
		agencyViewer = new TreeViewer(parent);
		agencyViewer.setContentProvider(new AgencyContentProvider());
		labelProvider = new AgencyLabelProvider();
		agencyViewer.setLabelProvider(labelProvider);
		Collection<RentalAgency> agencies = new ArrayList<RentalAgency>();
		agencies.add(RentalCoreActivator.getAgency());
		agencyViewer.setInput(agencies);

		// Autorise le popup sur le treeviewer
		MenuManager menuManager = new MenuManager();
		Menu menu = menuManager.createContextMenu(agencyViewer.getControl());
		agencyViewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuManager, agencyViewer);

		// L'arbre est draggable
		DragSource ds = new DragSource(agencyViewer.getControl(), DND.DROP_COPY);
		Transfer[] ts = new Transfer[] { TextTransfer.getInstance() };
		ds.setTransfer(ts);
		ds.addDragListener(new AgencyTreeDragSourceListener(agencyViewer));

		getSite().setSelectionProvider(agencyViewer);

		
	
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
		labelProvider.initPalette();
		agencyViewer.refresh();
	}

	@Override
	public void setFocus()
	{
		// TODO Auto-generated method stub

	}

}

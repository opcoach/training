package com.opcoach.training.e4.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.menu.MPopupMenu;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.RTFTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.URLTransfer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.e4.rental.ui.RentalUIActivator;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

public class RentalAgencyView // implements  IPropertyChangeListener
{
	public static final String VIEW_ID = "com.opcoach.rental.e4.ui.rentalagencyview";
	public static final String MENU_ID = VIEW_ID+".menu";

	private TreeViewer agencyViewer;

	private AgencyLabelProvider labelProvider;

	
	@Inject
	private EMenuService menuService;
	

	@PostConstruct
	public void createContent(Composite parent, @Optional IStylingEngine styleEngine, RentalAgency agency, ImageRegistry imgRegistry, IPreferenceStore pstore)
	{
		agencyViewer = new TreeViewer(parent);
		agencyViewer.setContentProvider(new AgencyContentProvider());
		labelProvider = new AgencyLabelProvider(imgRegistry, pstore);
		agencyViewer.setLabelProvider(labelProvider);

		Collection<RentalAgency> agencies = new ArrayList<RentalAgency>();
		agencies.add(agency);
		RentalAgency lyon = RentalAgencyGenerator.createSampleAgency();
		lyon.setName("Lyon");
		agencies.add(lyon);

		agencyViewer.setInput(agencies);

		// Association de la vue sur un contexte d'aide
		System.out.println("Voir pour le help system");
		// IWorkbench wb; // COmment le récupérer ?
		// PlatformUI.getWorkbench().getHelpSystem().setHelp(agencyViewer.getControl(),
		// "com.opcoach.training.rental.ui.rentalContext");

		// Register a popup menu on viewer (MENU_ID is the id of popupmenu in application model)
		MPopupMenu menu = menuService.registerContextMenu(agencyViewer.getControl(), MENU_ID);

		// Autorise le popup sur le treeviewer
/*
		MenuManager menuManager = new MenuManager();
		Menu menu = menuManager.createContextMenu(agencyViewer.getControl());
		agencyViewer.getControl().setMenu(menu);
		System.out.println("Voir comment récupérer le getSite(), pour enregistrer contextMenu");
		// getSite().registerContextMenu(menuManager, agencyViewer);
*/
		// L'arbre est draggable
		DragSource ds = new DragSource(agencyViewer.getControl(), DND.DROP_COPY);
		Transfer[] ts = new Transfer[] { TextTransfer.getInstance(), RTFTransfer.getInstance(), URLTransfer.getInstance() };
		ds.setTransfer(ts);
		ds.addDragListener(new AgencyTreeDragSourceListener(agencyViewer));
		
		// Add the e4 styling
		if (styleEngine != null)
		{
			styleEngine.setClassname(agencyViewer.getControl(), "agencyViewer");
		}
		
		// Listen to the preference store
		//pstore.addPropertyChangeListener(this);


		provideSelection();

	}

	@Inject
	private ESelectionService selectionService;

	private void provideSelection()
	{
		// attach a selection listener to the jface viewer 
		agencyViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event)
			{
				// Get the selection in event
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				// set the selection to the service
				selectionService.setSelection(sel.size() == 1 ? sel.getFirstElement() : sel.toArray());
			}
		});
	}


	@PreDestroy
	public void dispose(IPreferenceStore ps)
	{
		// ps.removePropertyChangeListener(this);
	}


	
	@Focus
	public void setFocus(EPartService ps)
	{
		//System.out.println("Affichage de l'agency viewer et montée de la vue navigateur");
		agencyViewer.getControl().setFocus();
		/*MPart p = ps.showPart("org.eclipse.ui.views.ResourceNavigator", PartState.ACTIVATE);
		System.out.println("Part navigateur = " + p);*/
	}

	
	@Inject
	public void refreshTree(@Preference(nodePath=RentalUIActivator.PLUGIN_ID, value=RentalUIConstants.CUSTOMER_KEY) String custCol,
			@Preference(nodePath=RentalUIActivator.PLUGIN_ID, value=RentalUIConstants.RENTAL_KEY) String rk,
			@Preference(nodePath=RentalUIActivator.PLUGIN_ID, value=RentalUIConstants.RENTAL_OBJECT_KEY) String rok)
	{
		if (agencyViewer != null)
		{
		agencyViewer.refresh();
		labelProvider.initPalette();
		}

	}
			


/*
	@Override
	public void propertyChange(PropertyChangeEvent event)
	{
		agencyViewer.refresh();				
	}
	*/
	
	

}

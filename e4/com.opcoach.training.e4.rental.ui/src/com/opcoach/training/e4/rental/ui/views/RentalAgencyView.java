package com.opcoach.training.e4.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.xml.ws.FaultAction;

import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MPopupMenu;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
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
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.core.RentalCoreActivator;
import com.opcoach.training.rental.core.helpers.RentalAgencyGenerator;

public class RentalAgencyView implements IPropertyChangeListener
{
	public static final String VIEW_ID = "com.opcoach.rental.e4.ui.rentalagencyview";
	public static final String MENU_ID = VIEW_ID+".menu";

	private TreeViewer agencyViewer;

	private AgencyLabelProvider labelProvider;

	@Inject
	private ESelectionService selectionService;
	
	@Inject
	private EMenuService menuService;
	

	@Inject
	public RentalAgencyView(Composite parent, @Optional IStylingEngine styleEngine)
	{
		agencyViewer = new TreeViewer(parent);
		agencyViewer.setContentProvider(new AgencyContentProvider());
		labelProvider = new AgencyLabelProvider();
		agencyViewer.setLabelProvider(labelProvider);

		Collection<RentalAgency> agencies = new ArrayList<RentalAgency>();
		agencies.add(RentalCoreActivator.getAgency());

		RentalAgency lyon = RentalAgencyGenerator.createSampleAgency();
		lyon.setName("Lyon");
		agencies.add(lyon);

		agencyViewer.setInput(agencies);

		// Association de la vue sur un contexte d'aide
		System.out.println("Voir pour le help system");
		// IWorkbench wb; // COmment le récupérer ?
		// PlatformUI.getWorkbench().getHelpSystem().setHelp(agencyViewer.getControl(),
		// "com.opcoach.training.rental.ui.rentalContext");

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

	}

	@PostConstruct
	void initializeListeners(@Active MPart part)
	{
		// attach a selection listener to our jface viewer
		System.out.println("On ajoute le mécanisme de selection sur l'agence");

		agencyViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event)
			{
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				// set the selection to the service
				selectionService.setSelection(selection.size() == 1 ? selection.getFirstElement() : selection.toArray());
			}
		});

		// Listen to the preference store
		RentalUIActivator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
		
		// Register the popup menu on viewer
		MPopupMenu menu = menuService.registerContextMenu(agencyViewer.getControl(), MENU_ID);

		System.out.println("Description du part courant : " + part.getDescription());		//menu.setLabel("MENU SUR AGENCE");
		//menu.setVisible(true);*/
		

	}

	@PreDestroy
	public void dispose()
	{
		RentalUIActivator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
	}

	@Override
	public void propertyChange(PropertyChangeEvent event)
	{
		labelProvider.initPalette();
		agencyViewer.refresh();
	}
	
	@Focus
	public void onFocus()
	{
		System.out.println("On entre dans l'agency view");
	}

}

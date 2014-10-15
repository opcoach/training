package com.opcoach.training.e4.rental.ui.parts;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.RTFTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.URLTransfer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

public class RentalAgencyPart implements RentalUIConstants // implements
// IPropertyChangeListener
{
	public static final String VIEW_ID = "com.opcoach.rental.e4.ui.rentalagencyview";
	public static final String MENU_ID = VIEW_ID + ".menu";

	private TreeViewer agencyViewer;

	@Inject
	private AgencyLabelProvider labelProvider;

	@Inject
	private EMenuService menuService;

	@PostConstruct
	public void createContent(Composite parent, @Optional IStylingEngine styleEngine, RentalAgency agency, IEclipseContext ctx)
	{
		agencyViewer = new TreeViewer(parent);
		agencyViewer.setContentProvider(new AgencyContentProvider());
		// labelProvider is now Creatable, so it is useless to call
		// ContextInjectionFactory
		// labelProvider =
		// ContextInjectionFactory.make(AgencyLabelProvider.class, ctx);
		agencyViewer.setLabelProvider(labelProvider);

		Collection<RentalAgency> agencies = new ArrayList<RentalAgency>();
		agencies.add(agency);
		RentalAgency lyon = RentalAgencyGenerator.createSampleAgency();
		lyon.setName("Lyon");
		agencies.add(lyon);

		agencyViewer.setInput(agencies);

		// Register a popup menu on viewer (MENU_ID is the id of popupmenu in
		// application model)
		menuService.registerContextMenu(agencyViewer.getControl(), MENU_ID);

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

		// attach a selection listener to the viewer
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

	@Inject
	private ESelectionService selectionService;

	@Focus
	public void setFocus(EPartService ps)
	{
		// System.out.println("Affichage de l'agency viewer et mont�e de la vue navigateur");
		agencyViewer.getControl().setFocus();
		/*
		 * MPart p = ps.showPart("org.eclipse.ui.views.ResourceNavigator",
		 * PartState.ACTIVATE); System.out.println("Part navigateur = " + p);
		 */
	}

	/**
	 * We can receive any value of the preferences store... This method will be
	 * called each time a value has changed in the preferenceStore.
	 */
	@Inject
	public void refreshTree(@Preference(value = PREF_PALETTE) String pal)
	{
		if ((agencyViewer != null) && (!agencyViewer.getControl().isDisposed()))
		{
			agencyViewer.refresh();
		}
	}
	
	
	/** With the dashboard part, we can now receive selection from outside of this view */
	@Inject
	@Optional
	public void selectionChanged(@Named(IServiceConstants.ACTIVE_SELECTION) Object selection, 
			                     @Named(IServiceConstants.ACTIVE_PART) MPart currentPart)
	{
		// Nothing to do if nothing available.
		if (currentPart == null || selection == null || agencyViewer == null)
			return;
		
		// Is this selection coming from outside of this part ? 
		// In this case must set it on the viewer if created
		if ( ! VIEW_ID.equals(currentPart.getElementId()))
		{
			// Must recreate a structuredSelection ! :)
			IStructuredSelection ss = new StructuredSelection(selection);
			agencyViewer.setSelection(ss, true);
		}

	}

}

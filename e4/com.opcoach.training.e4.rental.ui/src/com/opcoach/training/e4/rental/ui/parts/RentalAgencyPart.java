package com.opcoach.training.e4.rental.ui.parts;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.menu.MPopupMenu;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IColorProvider;
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

public class RentalAgencyPart implements RentalUIConstants // implements
// IPropertyChangeListener
{
	public static final String VIEW_ID = "com.opcoach.rental.e4.ui.rentalagencyview";
	public static final String MENU_ID = VIEW_ID + ".menu";

	private TreeViewer agencyViewer;

	private AgencyLabelProvider labelProvider;

	@Inject
	private EMenuService menuService;

	@PostConstruct
	public void createContent(Composite parent, @Optional IStylingEngine styleEngine, RentalAgency agency, IEclipseContext ctx)
	{
		agencyViewer = new TreeViewer(parent);
		agencyViewer.setContentProvider(new AgencyContentProvider());
		labelProvider = ContextInjectionFactory.make(AgencyLabelProvider.class, ctx);
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
		// System.out.println("Affichage de l'agency viewer et montée de la vue navigateur");
		agencyViewer.getControl().setFocus();
		/*
		 * MPart p = ps.showPart("org.eclipse.ui.views.ResourceNavigator",
		 * PartState.ACTIVATE); System.out.println("Part navigateur = " + p);
		 */
	}


	/**
	 * We can receive at least one of the preferences values... This method will
	 * be called each time a preference is changed in the corresponding
	 * preference Store, even if other values are changed.
	 */
	@Inject
	public void refreshTree(@Preference(value = PREF_CUSTOMER_COLOR) String custCol)
	{
		if (agencyViewer != null)
		{
			agencyViewer.refresh();
		}
	}

}

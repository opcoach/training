package com.opcoach.training.e4.rental.ui.parts;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
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
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.RTFTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.URLTransfer;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;

public class RentalAgencyPart implements RentalUIConstants // implements
// IPropertyChangeListener
{
	public static final String VIEW_ID = "com.opcoach.rental.e4.ui.rentalagencyview";
	public static final String MENU_ID = VIEW_ID + ".menu";

	private TreeViewer agencyViewer;


	@Inject
	@Named(RENTAL_UI_IMG_REGISTRY)
	private ImageRegistry imgReg;

	@PostConstruct
	public void createContent(Composite parent, @Optional IStylingEngine styleEngine, RentalAgency agency, IEclipseContext ctx, EMenuService menuService,
			@Preference IEclipsePreferences prefs)
	{
		parent.setLayout(new GridLayout(1, false));

		final Composite comp = new Composite(parent, SWT.NONE);
		comp.setLayout(new GridLayout(2, false));

		Button expandAll = new Button(comp, SWT.FLAT);
		expandAll.setImage(imgReg.get(IMG_EXPAND_ALL));
		expandAll.setToolTipText("Expand agency tree");
		expandAll.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				agencyViewer.expandAll();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
			}
		});
		Button collapseAll = new Button(comp, SWT.FLAT);
		collapseAll.setImage(imgReg.get(IMG_COLLAPSE_ALL));
		collapseAll.setToolTipText("Collapse context nodes");
		collapseAll.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				agencyViewer.collapseAll();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
			}
		});

		agencyViewer = new TreeViewer(parent);
		agencyViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		RentalProvider provider = ContextInjectionFactory.make(RentalProvider.class, ctx);
		agencyViewer.setContentProvider(provider);
		agencyViewer.setLabelProvider(provider);

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

		// To refresh the part whatever the preference changed, use a listener
		// on IEclipsePreferences
		prefs.addPreferenceChangeListener(new IEclipsePreferences.IPreferenceChangeListener() {
			
			@Override
			public void preferenceChange(PreferenceChangeEvent event)
			{
				System.out.println("Refresh for any preference change. Here : " + event.getKey());
				agencyViewer.refresh();
			}
		});

	}

	@Inject
	private ESelectionService selectionService;

	@Focus
	public void setFocus(EPartService ps)
	{
		agencyViewer.getControl().setFocus();
	}

	/**
	 * We can receive any value of the preferences store... This method will be
	 * called each time the specific palette is changed.
	 */
	@Inject
	public void refreshTree(@Preference(value = PREF_PALETTE) String pal)
	{
		if ((agencyViewer != null) && (!agencyViewer.getControl().isDisposed()))
		{
			System.out.println("Refresh for palette preference change.");
			agencyViewer.refresh();
		}
	}

	
	/**
	 * With the dashboard part, we can now receive selection from outside of
	 * this view
	 */
	@Inject
	@Optional
	public void selectionChanged(@Named(IServiceConstants.ACTIVE_SELECTION) Object selection, @Named(IServiceConstants.ACTIVE_PART) MPart currentPart)
	{
		// Nothing to do if nothing available.
		if (currentPart == null || selection == null || agencyViewer == null)
			return;

		// Is this selection coming from outside of this part ?
		// In this case must set it on the viewer if created
		if (!VIEW_ID.equals(currentPart.getElementId()))
		{
			// Must recreate a structuredSelection ! :)
			IStructuredSelection ss = new StructuredSelection(selection);
			agencyViewer.setSelection(ss, true);
		}

	}

}

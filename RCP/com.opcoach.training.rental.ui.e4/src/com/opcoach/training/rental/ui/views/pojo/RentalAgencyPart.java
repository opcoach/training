package com.opcoach.training.rental.ui.views.pojo;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.menu.MPopupMenu;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
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
import org.eclipse.ui.PlatformUI;

import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.core.RentalCoreActivator;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;
import com.opcoach.training.rental.ui.RentalUIActivator;
import com.opcoach.training.rental.ui.RentalUIConstants;
import com.opcoach.training.rental.ui.views.AgencyContentProvider;
import com.opcoach.training.rental.ui.views.AgencyLabelProvider;
import com.opcoach.training.rental.ui.views.AgencyTreeDragSourceListener;

public class RentalAgencyPart
{
	public static final String VIEW_ID = "com.opcoach.rental.ui.rentalagencyview";

	public static final String MENU_ID = VIEW_ID + ".menu";

	private TreeViewer agencyViewer;

	private AgencyLabelProvider labelProvider;

	@Inject
	@Optional
	EMenuService menuService;

	@Inject
	@Optional
	private ESelectionService selectionService;

	public RentalAgencyPart()
	{
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void createPartControl(Composite parent, ESelectionService selectionService)
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
		PlatformUI.getWorkbench().getHelpSystem()
				.setHelp(agencyViewer.getControl(), "com.opcoach.training.rental.ui.rentalContext");

		// Register a popup menu on viewer (MENU_ID is the id of popupmenu in
		// application model)
		if (menuService != null)
		{
			MPopupMenu menu = menuService.registerContextMenu(agencyViewer.getControl(), MENU_ID);
		}

		// L'arbre est draggable
		DragSource ds = new DragSource(agencyViewer.getControl(), DND.DROP_COPY);
		Transfer[] ts = new Transfer[] { TextTransfer.getInstance(), RTFTransfer.getInstance(), URLTransfer.getInstance() };
		ds.setTransfer(ts);
		ds.addDragListener(new AgencyTreeDragSourceListener(agencyViewer));

		provideSelection();

	}

	private void provideSelection()
	{
		if (selectionService == null)
			return;

		// attach a selection listener to the jface viewer
		agencyViewer.addSelectionChangedListener(new ISelectionChangedListener()
			{
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
	public void refreshTree(
			@Preference(nodePath = RentalUIActivator.PLUGIN_ID, value = RentalUIConstants.CUSTOMER_KEY) String custCol,
			@Preference(nodePath = RentalUIActivator.PLUGIN_ID, value = RentalUIConstants.RENTAL_KEY) String rk,
			@Preference(nodePath = RentalUIActivator.PLUGIN_ID, value = RentalUIConstants.RENTAL_OBJECT_KEY) String rok)
	{
		if (agencyViewer != null)
		{
			labelProvider.initPalette();
			agencyViewer.refresh();
		}

	}

	@Focus
	public void setFocus()
	{

	}

}

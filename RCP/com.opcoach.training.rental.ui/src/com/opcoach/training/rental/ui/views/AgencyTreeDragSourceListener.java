package com.opcoach.training.rental.ui.views;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.TextTransfer;

import com.opcoach.training.rental.Customer;

final class AgencyTreeDragSourceListener extends DragSourceAdapter
{
	private ISelectionProvider selProvider = null;

	public AgencyTreeDragSourceListener(ISelectionProvider selProvider)
	{
		super();
		this.selProvider = selProvider;
	}

	@Override
	public void dragSetData(DragSourceEvent event)
	{
		if (TextTransfer.getInstance().isSupportedType(event.dataType))
		{
			// Recupere la source
			ISelection sel = selProvider.getSelection();
			if (sel instanceof IStructuredSelection)
			{
				IStructuredSelection ss = (IStructuredSelection) sel;
				Object selectedObject = ss.getFirstElement();
				if (selectedObject instanceof Customer)
				{
					Customer c = (Customer) selectedObject;
					event.data = "Customer : " + c.getDisplayName();
				} else
					event.data = selectedObject.toString();
			}
		}

	}
}
package com.opcoach.training;

import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Label;

public class DropTargetSample
{

	private Label label = null;

	public void setLabelAsDropTarget()
	{
		int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_LINK;
		Transfer[] types = new Transfer[] { TextTransfer.getInstance() };
		DropTarget target = new DropTarget(label, operations);
		target.setTransfer(types);
		target.addDropListener(new MyDropListener());
	}

	public void setLabelAsDragSource()
	{
		DragSource source = new DragSource(label, DND.DROP_MOVE | DND.DROP_COPY);
		// Define the transfer type (Local, Text...)
		source.setTransfer(new Transfer[] { TextTransfer.getInstance() });
		source.addDragListener(new MyDragListener());
	}

	public class MyDragListener extends DragSourceAdapter
	{
		public void dragSetData(DragSourceEvent event)
		{
			if (TextTransfer.getInstance().isSupportedType(event.dataType))
			{
				event.data = label.getText();
			}

		}
	}
	
	public class MyDropListener extends DropTargetAdapter
	{
		public void drop(DropTargetEvent event)
		{
			// Do your drop stuff...
		}
		
	}

}

package com.opcoach.training;

import java.awt.event.MouseEvent;
import java.util.EventListener;

import org.eclipse.swt.events.MouseAdapter;

public interface MouseListener extends EventListener {
	/** Invoked when the mouse button has been clicked (pressed and released) */
	public void mouseClicked(MouseEvent e);

	/** Invoked when a mouse button has been pressed on a component. */
	public void mousePressed(MouseEvent e);

	/** Invoked when a mouse button has been released on a component. */
	public void mouseReleased(MouseEvent e);

	/** Invoked when the mouse enters a component. */
	public void mouseEntered(MouseEvent e);

	/** Invoked when the mouse exits a component. */
	public void mouseExited(MouseEvent e);

	public class MyMouseAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			// To do when clicked
		}
	}

	// The listener to manage event
	public interface XXListener 
	{
		public void doSomething(XXEvent event);
	}
	
	// The source class that creates and sends events
	public class Source 
	{
		void addXXListener(XXListener x) { }
	}

	// The consumer class (reacts on events)
	public class MyClass implements XXListener 
	{
		Source source = new Source();

		MyClass() 
		{
			source.addXXListener(this);
		}

		public void doSomething(XXEvent event) 
		{
			System.out.println("Do something with event");
		}
	}

}
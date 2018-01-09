package com.opcoach.training.e4.rental.ui.test.e4Stubs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.swt.widgets.Display;

/**
 * This class is a copy of package
 * org.eclipse.jface.databinding.swt.DisplayRealm Must be redefined to access to
 * constructor which is private...
 *
 * 
 */
public class DisplayRealm extends Realm {

	private static List<DisplayRealm> realms = new ArrayList<DisplayRealm>();

	/**
	 * Returns the realm representing the UI thread for the given display.
	 *
	 * @param display
	 * @return the realm representing the UI thread for the given display
	 */
	public static Realm getRealm(final Display display) {
		synchronized (realms) {
			for (DisplayRealm element : realms) {
				if (element.display == display) {
					return element;
				}
			}
			DisplayRealm result = new DisplayRealm(display);
			realms.add(result);

			return result;
		}
	}

	// Add this method for tests.
	public static void initDefault(Realm r) {
		Realm.setDefault(r);
	}

	private Display display;

	/**
	 * @param display
	 */
	private DisplayRealm(Display display) {
		this.display = display;
	}

	@Override
	public boolean isCurrent() {
		return Display.getCurrent() == display;
	}

	@Override
	public void asyncExec(final Runnable runnable) {
		Runnable safeRunnable = new Runnable() {
			@Override
			public void run() {
				safeRun(runnable);
			}
		};
		if (!display.isDisposed()) {
			display.asyncExec(safeRunnable);
		}
	}

	@Override
	public void timerExec(int milliseconds, final Runnable runnable) {
		if (!display.isDisposed()) {
			Runnable safeRunnable = new Runnable() {
				@Override
				public void run() {
					safeRun(runnable);
				}
			};
			display.timerExec(milliseconds, safeRunnable);
		}
	}

	@Override
	public int hashCode() {
		return (display == null) ? 0 : display.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final DisplayRealm other = (DisplayRealm) obj;
		if (display == null) {
			if (other.display != null)
				return false;
		} else if (!display.equals(other.display))
			return false;
		return true;
	}
}
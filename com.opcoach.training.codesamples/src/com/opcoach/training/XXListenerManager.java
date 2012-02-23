package com.opcoach.training;

import java.lang.ref.WeakReference;

public class XXListenerManager
{
	// Store the weak reference
	private WeakReference<XXListener>	wrListener;

	public void setXListener(XXListener listener)
	{
		// bind listener in a weak reference
		wrListener = new WeakReference<XXListener>(listener);
	}

	public XXListener getXListener()
	{
		return wrListener == null ? null : wrListener.get();
	}

	public void fireXEvent()
	{
		// Send event only if listener always bound to weak ref
		if (wrListener != null)
		{
			XXEvent event = new XXEvent();
			XXListener listener = wrListener.get();
			if (listener != null)
			{
				listener.doSomething(event);
			}
		}
	}
	
}
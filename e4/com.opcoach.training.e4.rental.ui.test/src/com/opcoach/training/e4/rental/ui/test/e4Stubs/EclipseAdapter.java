package com.opcoach.training.e4.rental.ui.test.e4Stubs;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.e4.core.services.adapter.Adapter;

public class EclipseAdapter extends Adapter {

	@Override
	public <T> T adapt(Object element, Class<T> adapterType) {
		return Adapters.adapt(element, adapterType);
	}

}
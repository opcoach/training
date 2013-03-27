package com.opcoach.training.e4.codesamples;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

public class SampleViewStylingEngine
{

	@Inject
	private ESelectionService selectionService;

	@Inject
	private EMenuService menuService; // This field is initialized by injector

	public SampleViewStylingEngine()
	{
	}

	@Inject
	public void anotherMethod(@Optional EMenuService service)
	{
		// This method will be called
	}

	@PostConstruct
	public void createContent(Composite parent, @Optional IStylingEngine styleEngine)
	{
		TreeViewer agencyViewer = new TreeViewer(parent);

		// .... more code to fill the UI

		// Add the e4 styling
		if (styleEngine != null)
		{
			styleEngine.setClassname(agencyViewer.getControl(), "agencyViewer");
		}
	}
	
	
	

	@PostConstruct
	void initializeListeners(@Active MPart part)
	{
		// A method called after all injected method have been called
	}

	@PreDestroy
	public void dispose()
	{
		// Call this method before deleting object (to remove listener for
		// instance)
	}

	@Focus
	public void onFocus()
	{
		// This method is called when part takes focus
	}

}

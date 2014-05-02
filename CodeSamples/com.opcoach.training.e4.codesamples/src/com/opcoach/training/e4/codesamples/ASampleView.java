package com.opcoach.training.e4.codesamples;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Composite;

public class ASampleView
{

	@Inject
	private ESelectionService selectionService;

	@Inject
	private EMenuService menuService; // This field is initialized by injector

	@Inject
	public void anotherMethod(@Optional EMenuService service)
	{
		// This method will be called
	}

	@PostConstruct
	public void createContent(Composite parent, @Optional IStylingEngine styleEngine)
	{
        // Code to create the view
	}

	@PreDestroy
	public void dispose()
	{
		// Call this method before deleting object (to remove listener for  instance)
	}

	@Focus
	public void onFocus()
	{
		// This method is called when part takes focus
	}
}

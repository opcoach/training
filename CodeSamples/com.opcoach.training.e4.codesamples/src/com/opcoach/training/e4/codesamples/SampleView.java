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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;

public class SampleView
{

	@Inject
	private ESelectionService selectionService;
	
	@Inject
	private EMenuService menuService; // This field is initialized by injector

	public SampleView()
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
		parent.setLayout(new GridLayout(1, false));
		
		Bundle bundle = FrameworkUtil.getBundle(getClass());
		Image im = ImageDescriptor.createFromURL(bundle.getEntry("icons/splash.png")).createImage();
		Label l = new Label(parent, SWT.BORDER | SWT.WRAP);
		l.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		l.setImage(im);
		// Code to create the view...
		Button b = new Button(parent, SWT.BORDER | SWT.FLAT);
		b.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		b.setText("Ctrl button");
		
		
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

package com.opcoach.rental.forms.rcp;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

public class PropertiesWithForms extends ViewPart implements ISelectionListener
{

	public PropertiesWithForms()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IViewSite site) throws PartInitException
	{
		// TODO Auto-generated method stub
		super.init(site);
		site.getPage().addSelectionListener(this);
	}

	@Override
	public void dispose()
	{
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
	}

	private Composite parent;
	private ECPSWTView view;
	private Composite parentView;

	@Override
	public void createPartControl(Composite parent)
	{
		this.parent = parent;
		parent.setLayout(new FillLayout());
	}

	@Override
	public void setFocus()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection)
	{
		if (selection instanceof IStructuredSelection)
		{
			IStructuredSelection isel = (IStructuredSelection) selection;
			Object firstElement = isel.getFirstElement();
			if (firstElement instanceof EObject)
				try
				{
					if (view != null)
					{
						view.dispose();
					}
					parentView = new Composite(parent, SWT.NONE);
					view = ECPSWTViewRenderer.INSTANCE.render(parent, (EObject) firstElement);
					/*
					 * else view.getViewModelContext().
					 */
				} catch (ECPRendererException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}

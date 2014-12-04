package com.opcoach.rental.forms.rcp.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

/**
 * This is a generic editor that manages the form view for a selected Eobject
 * received in the EObjectEditorInput
 */
public class EObjectEditorPart extends EditorPart
{

	public static final String ID = "com.opcoach.rental.forms.rcp.eObjectEditor";
	private ECPSWTView ecpView;

	public EObjectEditorPart()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSave(IProgressMonitor monitor)
	{

	}

	@Override
	public void doSaveAs()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
		setSite(site);
		setInput(input);
	}

	@Override
	public boolean isDirty()
	{
		return false;
	}

	@Override
	public boolean isSaveAsAllowed()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent)
	{

		try
		{
			EObject obj = ((EObjectEditorInput) getEditorInput()).getEObject();

			ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

			AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(composedAdapterFactory);
			setPartName(labelProvider.getText(obj));

			ecpView = ECPSWTViewRenderer.INSTANCE.render(parent, obj);

		} catch (ECPRendererException e)
		{
			Label label = new Label(parent, SWT.NONE);
			label.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
			label.setText("Editor is not available");
		}

	}

	@Override
	public void setFocus()
	{
		// TODO Auto-generated method stub

	}

}

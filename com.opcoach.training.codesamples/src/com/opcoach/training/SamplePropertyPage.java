package com.opcoach.training;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.PropertyPage;



public class SamplePropertyPage extends PropertyPage
{
	private Label label;

	protected Control createContents(Composite parent)
	{
		Composite composite = new Composite(parent, SWT.NONE);
		// Code to create page
		label = new Label(composite, SWT.NONE);
		return label;

	}

	public boolean performOk()
	{
		// store the value in the owner text field
		try
		{
			IResource res = ((IResource) getElement());
			QualifiedName qname = new QualifiedName("com.opcoach.rental", "mykey");
			res.setPersistentProperty(qname, label.getText());
		} catch (CoreException e)
		{
			return false;
		}
		return true;
	}
}

package com.opcoach.training.rental.property;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.resource.DataFormatException;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;

import com.opcoach.training.rental.ui.RentalUIActivator;

public class RentalProperty extends PropertyPage implements IWorkbenchPropertyPage
{
	
	/**
	 * 
	 */
	private static final String DISPLAYTEST = "DISPLAYTEST";
	/**
	 * 
	 */
	public static final QualifiedName DISPLAY_TEST_PROP = new QualifiedName("com.opcoach.training.rental.ui", DISPLAYTEST);
	
	private Button displaySum ;
	

	public RentalProperty()
	{
		// TODO Auto-generated constructor stub
		// setPreferenceStore(RentalUIActivator.getDefault().getPreferenceStore());
	}

	@Override
	protected Control createContents(Composite parent)
	{
		IFile f = (IFile) getElement();
		Composite top = new Composite(parent, SWT.NONE);
		top.setLayout(new GridLayout(1, false));
		 displaySum = new Button(top, SWT.CHECK);
		displaySum.setText("Afficher la somme des noeuds");
		try
		{
			String bool = f.getPersistentProperty(DISPLAY_TEST_PROP);
			if (bool != null)
			    displaySum.setSelection(StringConverter.asBoolean(bool));
		} catch (DataFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoreException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return top;
	}

	@Override
	public boolean performOk()
	{
		
		IFile f = (IFile) getElement();
		try
		{
			f.setPersistentProperty(DISPLAY_TEST_PROP, StringConverter.asString(displaySum.getSelection()));
		} catch (CoreException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return super.performOk();
	}
	
	

}

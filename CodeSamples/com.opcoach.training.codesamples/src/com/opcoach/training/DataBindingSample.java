package com.opcoach.training;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;

public class DataBindingSample
{
	private Label name;
	private Person person = new Person();

	public void bindMyValues()
	{
		DataBindingContext bc = new DataBindingContext();
		bc.bindValue(SWTObservables.observeText(name, SWT.Modify), 
				     PojoObservables.observeValue(person, "name"), 
				     null,
				     new UpdateValueStrategy()
				     {
					    public Object convert(Object value)
					    {
					    	return ((String) value).toUpperCase();
					    }
				     });
	}

	public void bindSimpleValue()
	{
		DataBindingContext bc = new DataBindingContext();
		bc.bindValue(SWTObservables.observeText(name, SWT.Modify), 
				     PojoObservables.observeValue(person, "name"), 
				     null, 
				     null);
	}

}

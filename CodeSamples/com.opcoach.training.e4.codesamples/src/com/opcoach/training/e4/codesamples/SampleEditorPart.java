package com.opcoach.training.e4.codesamples;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.PersistState;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class SampleEditorPart
{
	private static final String LAST_INPUT = "lastInput";
	private Text inputText;

	@PostConstruct 	public void postConstruct(Composite parent, MPart part)
	{
		inputText = new Text(parent, SWT.NONE);

		// Restore previous input text
		String lastText = part.getPersistedState().get(LAST_INPUT);
		if (lastText != null)
			inputText.setText(lastText);
		
		// Create here other widgets ... 
	}

	@PersistState public void saveTheState(MPart part)
	{
		// Save the states of some widgets to restore it later
		part.getPersistedState().put(LAST_INPUT, inputText.getText());
	}

	@Focus	public void onFocus() 	{ inputText.setFocus();  }
	
	@Persist public void doSave() { System.out.println("Save editor data"); }
		
}
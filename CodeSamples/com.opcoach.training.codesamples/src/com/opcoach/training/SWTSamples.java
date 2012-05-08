package com.opcoach.training;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class SWTSamples
{

	public void creeLabel(Composite parent)
	{
		final String text = "test";
		final Label label = new Label(parent, SWT.NONE);

		Label titre = new Label(parent, SWT.BORDER);
		titre.setText("Nom : ");

		Composite shell2 = new Shell();
		// Set a layout of 2 columns with different sizes
		shell2.setLayout(new GridLayout(2, false));

		Composite shell = new Shell();
		// Set a layout of 2 columns with different sizes
		shell.setLayout(new GridLayout());
		// Create the button
		Button button = new Button(shell, SWT.PUSH);
		GridData gd = new GridData();
		gd.horizontalAlignment = SWT.CENTER;
		button.setLayoutData(gd);

		Display.getDefault().asyncExec(new Runnable()
			{
				public void run()
				{
					label.setText(text);
				}
			});

	}
}

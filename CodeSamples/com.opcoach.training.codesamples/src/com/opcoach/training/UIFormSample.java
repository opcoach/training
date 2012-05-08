package com.opcoach.training;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;

public class UIFormSample
{

	public void createPartControl(Composite parent)
	{
		FormToolkit toolkit = new FormToolkit(parent.getDisplay());
		ScrolledForm form = toolkit.createScrolledForm(parent);
		form.setText("Hello, Eclipse Forms");
	}

	public void temp(Composite parent)
	{
		FormToolkit toolkit = new FormToolkit(parent.getDisplay());
		ScrolledForm form = toolkit.createScrolledForm(parent);
		form.setText("Hello, Eclipse Forms");

		GridLayout layout = new GridLayout();
		form.getBody().setLayout(layout);
		Hyperlink link = toolkit.createHyperlink(form.getBody(), "Click here.", SWT.WRAP);
		link.addHyperlinkListener(new HyperlinkAdapter()
			{
				public void linkActivated(HyperlinkEvent e)
				{
					System.out.println("Link activated!");
				}
			});
	}

	public void temp2(Composite parent)
	{
		FormToolkit toolkit = new FormToolkit(parent.getDisplay());
		final ScrolledForm form = toolkit.createScrolledForm(parent);
		form.setText("Hello, Eclipse Forms");
		Button button = null;

		Section section = toolkit.createSection(form.getBody(), Section.DESCRIPTION | Section.TITLE_BAR | 
				                                                Section.TWISTIE	| Section.EXPANDED);
		TableWrapData td = new TableWrapData(TableWrapData.FILL);
		td.colspan = 2;
		section.setLayoutData(td);
		section.addExpansionListener(new ExpansionAdapter()
			{
				public void expansionStateChanged(ExpansionEvent e)
				{
					form.reflow(true);
				}
			});
		section.setText("Section title");
		section.setDescription("This is the description that goes " + "below the title");
		Composite sectionClient = toolkit.createComposite(section);
		sectionClient.setLayout(new GridLayout());
		button = toolkit.createButton(sectionClient, "Radio 1", SWT.RADIO);
		button = toolkit.createButton(sectionClient, "Radio 2", SWT.RADIO);
		section.setClient(sectionClient);
	}
}

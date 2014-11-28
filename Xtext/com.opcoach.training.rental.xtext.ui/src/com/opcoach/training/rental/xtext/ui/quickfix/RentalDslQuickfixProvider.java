package com.opcoach.training.rental.xtext.ui.quickfix;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import com.opcoach.training.rental.xtext.validation.RentalDslJavaValidator;

public class RentalDslQuickfixProvider extends DefaultQuickfixProvider
{

	@Fix(RentalDslJavaValidator.START_DATE_BEFORE)
	public void fixStartDate(final Issue issue, IssueResolutionAcceptor acceptor)
	{
		acceptor.accept(issue, "Advance date", "Set the date to 1st January 2000", "daybefore.png", 
			new IModification()
			{
				@Override
				public void apply(IModificationContext context) throws Exception
				{
					IXtextDocument xtextDocument = context.getXtextDocument();
					xtextDocument.replace(issue.getOffset(), issue.getLength(), "01/01/2000");
				}
			});
	}

}

package com.opcoach.training.rental.xtext.ui.quickfix

import com.opcoach.training.rental.xtext.validation.RentalDslJavaValidator
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue

class TaskDslQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(RentalDslJavaValidator::START_DATE_BEFORE)
	def fixStartDate(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Advance date", "Set the date to 1st January 2000", "daybefore.png", 
			[ it.getXtextDocument().replace(issue.getOffset(), issue.getLength(), "01/01/2000");  ]);
	}
} 

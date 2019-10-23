package com.opcoach.training.rental.xtext.ui.quickfix;

import com.opcoach.training.rental.xtext.validation.RentalDslJavaValidator;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

@SuppressWarnings("all")
public class TaskDslQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(RentalDslJavaValidator.START_DATE_BEFORE)
  public void fixStartDate(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = new IModification() {
      @Override
      public void apply(final IModificationContext it) throws Exception {
        it.getXtextDocument().replace((issue.getOffset()).intValue(), (issue.getLength()).intValue(), "01/01/2000");
      }
    };
    acceptor.accept(issue, "Advance date", "Set the date to 1st January 2000", "daybefore.png", _function);
  }
}

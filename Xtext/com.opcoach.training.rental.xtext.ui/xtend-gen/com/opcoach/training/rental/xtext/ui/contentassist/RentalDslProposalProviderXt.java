package com.opcoach.training.rental.xtext.ui.contentassist;

import com.opcoach.training.rental.xtext.ui.contentassist.AbstractRentalDslProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

@SuppressWarnings("all")
public class RentalDslProposalProviderXt extends AbstractRentalDslProposalProvider {
  public void completeRental_StartDate(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeRental_StartDate(model, assignment, context, acceptor);
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("today", context);
    acceptor.accept(_createCompletionProposal);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("tomorrow", context);
    acceptor.accept(_createCompletionProposal_1);
    ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal("next week", context);
    acceptor.accept(_createCompletionProposal_2);
    ICompletionProposal _createCompletionProposal_3 = this.createCompletionProposal("next month", context);
    acceptor.accept(_createCompletionProposal_3);
  }
}

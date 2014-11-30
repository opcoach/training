package com.opcoach.training.rental.xtext.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

class RentalDslProposalProviderXt extends AbstractRentalDslProposalProvider {

	
	override void completeRental_StartDate(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

        // Call implementation of super class (should do nothing for date)
		super.completeRental_StartDate(model, assignment, context, acceptor)
		
		// Add specific proposals for a date 
		acceptor.accept(createCompletionProposal("today", context))
		acceptor.accept(createCompletionProposal("tomorrow", context))
		acceptor.accept(createCompletionProposal("next week", context))
		acceptor.accept(createCompletionProposal("next month", context))
		
	}                          
	
	
	
}

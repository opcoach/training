package com.opcoach.training.rental.xtext;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.BuilderParticipant;

public class RentalBuilderParticipant  extends BuilderParticipant
{

	public RentalBuilderParticipant()
	{
		super();
		System.out.println("On initialise le Rental builder participant");
	}
	
	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException
	{
		// TODO Auto-generated method stub
		super.build(context, monitor);
	}

}

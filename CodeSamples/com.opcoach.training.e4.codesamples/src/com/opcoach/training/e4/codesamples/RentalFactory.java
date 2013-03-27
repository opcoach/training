package com.opcoach.training.e4.codesamples;

public interface RentalFactory
{
	
	public RentalFactory eInstance = null;
	
	public Rental createRental();

}

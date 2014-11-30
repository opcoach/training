package com.opcoach.training.rental.xtend

import com.opcoach.training.rental.helpers.RentalAgencyGenerator

class SampleXtendCode {
		
  def printRentalAgency()
  {
  	val agency = RentalAgencyGenerator::createSampleAgency();
  	
  	for (cust : agency.customers)  
  		println("Customer : " + cust.firstName + " " + cust.name )
   } 
}
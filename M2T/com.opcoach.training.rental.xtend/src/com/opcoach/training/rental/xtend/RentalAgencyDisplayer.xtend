package com.opcoach.training.rental.xtend

import com.opcoach.training.rental.Customer
import com.opcoach.training.rental.RentalObject
import com.opcoach.training.rental.helpers.RentalAgencyGenerator

class RentalAgencyDisplayer {
		
	new() {
		
	}
   
  def printRentalAgency()
  {
  	val agency = RentalAgencyGenerator::createSampleAgency();
  	
  	println("---> Generate with xtend code")
  	for (cust : agency.customers)
  		println("Customer : " + cust.firstName + " " + cust.name )
    
  	
  	println("---> Generate with a template")
  	for (cust : agency.customers)
  	{
  		println(cust.displayCustomer);
  	}
  	
  	println("---> Polymorphisme sur les rental objets ")
  	for (ro : agency.objectsToRent)
        println(displayRentalObject(ro))
  	
  	
  }	
  
  def  String displayCustomer(Customer c) '''
     Customer : «c.firstName»  «c.name.toUpperCase»'''
     
     def String displayRentalObject(RentalObject o) '''
     RentalObject : «o.name»'''
     
   
}
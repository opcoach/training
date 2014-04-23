package com.opcoach.training.rental.xtend

import com.opcoach.training.rental.Car
import com.opcoach.training.rental.Device
import com.opcoach.training.rental.RentalObject
import com.opcoach.training.rental.Customer
import com.opcoach.training.rental.helpers.RentalAgencyGenerator

class RentalAgencyDisplayer {
		
	new() {
		
	}
   
  def printRentalAgency()
  {
  	val agency = RentalAgencyGenerator::createSampleAgency();
  	
  	println("---> Génération avec du code xtend normal")
  	for (cust : agency.customers)
  		println("Customer : " + cust.firstName + " " + cust.lastName )
    
  	
  	println("---> Génération avec un template")
  	for (cust : agency.customers)
  	{
  		println(cust.displayCustomer);
  	}
  	
  	println("---> Polymorphisme sur les rental objets ")
  	for (ro : agency.objectsToRent)
        println(displayRentalObject(ro))
  	
  	
  }	
  
  def  String displayCustomer(Customer c) '''
     Customer : «c.firstName»  «c.lastName.toUpperCase»'''
     
     def String displayRentalObject(RentalObject o) '''
     RentalObject : «o.name»'''
     
     def String displayRentalObject(Car car) '''
     Car : «car.licensePlate»'''
     
     def String displayRentalObject(Device d) '''
     Device : «d.name» Dimension(«d.width»,«d.length»,«d.height»)'''
}
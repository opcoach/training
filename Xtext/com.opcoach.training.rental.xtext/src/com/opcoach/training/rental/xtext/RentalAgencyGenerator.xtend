package com.opcoach.training.rental.xtext

import com.opcoach.training.rental.Customer
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator


class RentalAgencyGenerator implements IGenerator {
		
	override void doGenerate(Resource resource, IFileSystemAccess fsa)
	{
		for (cust : resource.allContents.toList().filter(typeof(Customer)))
			{
					fsa.generateFile(cust.lastName  +"_" + cust.firstName +".cust",cust.generateCustomer())
			}
	}
	
	def  generateCustomer(Customer c) '''
	«c.firstName» «c.lastName» est un client de l'agence «c.parentAgency.name»
	'''
	
}
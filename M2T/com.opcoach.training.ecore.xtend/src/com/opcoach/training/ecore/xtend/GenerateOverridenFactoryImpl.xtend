package com.opcoach.training.ecore.xtend

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage

 /** This class generate the code for an overriden factory */
class GenerateOverridenFactoryImpl {
	
	
	def getFactoryName(EPackage p) { "My" + p.name.toFirstUpper + "FactoryImpl.java"}
	
	def generateFactory(EPackage p) '''
	public class «p.factoryName» {
		«FOR c : p.EClassifiers»
		   «c.generateCreateMethod»
		«ENDFOR»
	}
	'''
	
	def dispatch generateCreateMethod(EClass c)'''
	public «c.name.toFirstUpper» create«c.name.toFirstUpper»()
	{
		return new My«c.name.toFirstUpper»Impl();
	}
	'''
	
	def dispatch generateCreateMethod(EClassifier c)''''''
}
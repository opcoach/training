package com.opcoach.training.ecore.xtend

import java.io.FileWriter
import org.eclipse.emf.ecore.EcorePackage

class GenerateAll {

	def static void main(String[] args) {

		val extension f = new GenerateOverridenFactoryImpl
		val p = EcorePackage.eINSTANCE

		println("On genere la overriden factory ")

		val fw = new FileWriter("/tmp/" + p.factoryName)
		
		
		fw.write(p.generateFactory.toString)
		fw.close

		// Generate all implemented classes
		val extension f2 = new GenerateOverridenClassImpl
		println("On genere les overriden classes ")
		p.generateOverridenClasses

	}

}

package com.opcoach.training.ecore.xtend

import java.io.FileWriter
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage

/** This class generate the code for a generated class to be overriden */
class GenerateOverridenClassImpl {

	def className(EClass c) {
		"My" + c.name.toFirstUpper + "Impl"
	}

	def generateOverridenClasses(EPackage p) {

		p.EClassifiers.filter(EClass).forEach[it.generateClass]

	}

	def generateClass(EClass c) {
		val fw = new FileWriter("/tmp/impl/" + c.className + ".java")
		fw.write(c.generateClassCode.toString)
		fw.close
	}

	def private generateClassCode(EClass c) '''
		public class «c.className» extends «c.name.toFirstUpper + "Impl"»{
			// Add your custom code here
		}
	'''

}

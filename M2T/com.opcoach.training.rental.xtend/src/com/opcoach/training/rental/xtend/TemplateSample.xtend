package com.opcoach.training.rental.xtend

import org.eclipse.emf.ecore.EClass;

class TemplateSample {
	
	def generateCode(EClass c,  String packName) '''
		package «packName»;
		public class «c.name»
		{
			«FOR att : c.EAllAttributes»
			private «att.EType.instanceClassName» _«att.name»;
			«ENDFOR»
		}
	'''
}
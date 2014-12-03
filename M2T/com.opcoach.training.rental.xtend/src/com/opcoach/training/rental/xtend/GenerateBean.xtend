package com.opcoach.training.rental.xtend

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

class GenerateBean {
	
	def generateCode(EClass c,  String packName) '''
		package «packName»;
		public class «c.name»
		{
			«FOR f : c.EAllStructuralFeatures»
			private «f.type» _«f.name»;
			«ENDFOR»
			
			«FOR f : c.EAllStructuralFeatures»
			«f.generateGetter»
			«ENDFOR»
			
		}
	'''

	def dispatch generateGetter(EAttribute att) '''
	public �att.type� get�att.name.toFirstUpper�()
	{
		return _�att.name�
	}
	'''
	def dispatch generateGetter(EReference ref) '''
	public Collection<�ref.type�> get�ref.name.toFirstUpper�()
	{
		return _�ref.name�
	}
	'''
	
	def dispatch getType(EAttribute att)	{ att.EType.instanceClassName 	}
	def dispatch getType(EReference ref)	{ ref.EType.name 	}
}
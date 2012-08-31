package com.opcoach.training.rental.xtend;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;

public class RunGenerateBean
{
	public static void main(String[] args)
	{
		GenerateBean gen = new GenerateBean();
		// Get the EClass describing the EClass ! 
		EClass c = EcorePackage.eINSTANCE.getEClass();
		Object result = gen.generateCode(c, "com.opcoach.training.test");
		System.out.println("Code généré : \n" + result);
		
	}
}

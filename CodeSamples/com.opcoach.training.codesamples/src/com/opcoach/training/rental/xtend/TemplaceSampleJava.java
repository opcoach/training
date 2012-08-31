package com.opcoach.training.rental.xtend;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

public class TemplaceSampleJava
{
	public String generateCode(String packName, EClass c)
	{
		StringBuffer buf = new StringBuffer("package ").append(packName);
		buf.append(";\n");
		buf.append("public class ").append(c.getName()).append("{");
		buf.append("\n");
	
		// Generate a field for each attribute
	    for (EAttribute att : c.getEAllAttributes())
	    {
	    	buf.append("private ").append(att.getEType().getInstanceClassName());
	    	buf.append(" _").append(att.getName());
			buf.append(";\n");
	    }
	    buf.append("}");
		
		return buf.toString();
	}
}

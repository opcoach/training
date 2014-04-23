package com.opcoach.training.rental.xtend

import java.io.IOException
import java.util.ArrayList
import java.util.List

import static com.opcoach.training.rental.xtend.SampleFields.*


import static extension java.util.Collections.*


abstract class SampleFields {
	
	// Private field 
	var        name1 = "Default"      // Private, type inferred
	val        name2 = "Default name" // Private, final, type inferred
	String     name3 = "Test"         // Private, type declared
	public var name4 = "Public name"  // public, type inferred
	static var state = true           // private, static, type inferred
	
	
	def useCollectionsExtension()
	{
		var List<String> myList = new ArrayList<String>()
		myList.replaceAll("before", "after")
		
	}
	
	// Method with return type inferred (here String)
	def method1() 
	{
		return name1+name2+name3+name4+state
	}
	
	// Static method (return type inferred : boolean)
	 def static method2() { return state }
	 
	 // overriden method
	 override toString() { return name1 }
	 
	 // abstract method (no body, and class must be declared as abstract)
	 def String method3() throws IOException
	 
	 // polymorphic methods 
	 def dispatch displayData(Integer n) { println("Int    : " + n)  }
	 def dispatch displayData(Number n)  { println("Number : " + n)  }
	
}
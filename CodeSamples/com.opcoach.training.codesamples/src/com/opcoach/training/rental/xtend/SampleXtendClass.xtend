package com.opcoach.training.rental.xtend

import java.util.List

class SampleXtendClass {
	
	// Private field 
	List<String> names  
	
	// Constructor
	new() 
	{
		// Can call this() or super()
	}
	
	// Method with return type inferred
	def method1()
	{
		return names
	}
	
}
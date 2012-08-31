package com.opcoach.training.rental.xtend

import com.google.inject.Inject
import java.util.ArrayList
import java.util.List

import static extension java.util.Collections.*

class ExtensionFieldSample {
 	
 	@Inject
 	extension var IMessageSender sender
 	
 	def useFieldExtension()
 	{
 		var List<String> myList = new ArrayList 
		// send is now available on List type
		myList.send
 	}
 }
 
 class other{	
	
	def useCollectionsExtension()
	{
		var List<String> myList = new ArrayList<String>()
		// replaceAll is now available on List type
		myList.replaceAll("before", "after")
		
		// Can call mymethod on list
		myList.myMethod
		
	}
	
	// A local method using a list
	def <T> myMethod(List<T> l)
	{
		// do something on List<T>
		l.clear();
	}
	
	// Use extension locally
	def useLocalExtension()
	{
		var List<String> myList = new ArrayList<String>()
		
		// Can call mymethod on list
		myList.myMethod
		
	}
	
	
	
	
	
	
}
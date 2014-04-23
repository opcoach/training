package com.opcoach.training.rental.xtend

class SwitchSample {
	
	def switchSample(String s)
	{
		// We can test everything on a string.. this method returns the value
	    switch s
		{
			case "name" : "This is the name string"
			case s.toFirstUpper == 'A' : "Starts with A"
			case s.length > 10 : "Too long string"
			default : "Refused"
		}	
	}
	
	def switchWithType(Object o)
	{
		// we can test the type of Object and put it in a variable (everything is expression)
		var value = switch o
		{
			String case o.length > 10 : "Too long String"
			Integer case o == 5 : "This is 5"
			default : -1
		}
		println("value is : " + value)
	}
}
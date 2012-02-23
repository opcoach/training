package com.opcoach.training;


  /** Implement the listener on a class */
public class MyClass implements XXListener
{
	
	private String name;

	public String getName() {
		return name;
	}

	/** Set a with a positive value */
	public void setName(String name) {
		this.name = name;
	}
	// Specific method 
	public void otherSpecificMethods()
	{
		// ........
	}
	
	// Implementing the listener
	public void doSomething(XXEvent event)
	{
		// TODO Auto-generated method stub
	}
	
	// Binding sample
	public static void main(String[] args)
	{
		// Create the listening class
		MyClass myclass = new MyClass();
		// Create the event sender
		XXSender source = new XXSender();
		// Register the listener on the sender
		source.addXXListenenr(myclass);
	}
}

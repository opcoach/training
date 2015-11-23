package com.opcoach.training;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class MyTest extends TestCase {
	
	private MyClass c;
	
	@Before protected void setUp()
	{
		c = new MyClass();	
	}

	@Test
	public void testTheName() 
	{
		c.setName("Test");
		 assertEquals(c.getName(), "Test");
	}
}

package com.opcoach.training;

import java.awt.Color;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GenericsSample
{

	public void listWithoutGenerics()
	{
		LinkedList list = new LinkedList();
		list.add(new Integer(1));
		Integer num = (Integer) list.get(0);
	}

	public int listWithGenerics()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(1));
		Integer num = list.get(0);
		return num;
	}

	public interface List<E>
	{
		public void add(E x);
		public Iterator<E> iterator();
	}

	public interface Iterator<E>
	{
		E next();
		boolean hasNext();
	}

	// Create a map with key=Id (string), and value=instance of Color
	Map<String, Color> colorMap = new HashMap<String,Color>();
	
	
	// A generic number generator class
	public class Generator<T extends Number>
	{
		public T generateValue() { return null; };
	}
	
	public void testGen()
	{
		// Not possible : Date is not a number
	   // Generator<Date> gen1 = new Generator<Date>();
	    
	    
	    
	    
	    // Ok : Double is a number
	    Generator<Double> gen2 = new Generator<Double>();
	}
	
	@SuppressWarnings(value="")
	public void testJoker()
	{
		// A class of anything setted with a specific class
		Class<?> c = Integer.class;
		
		// A generator of anything (that must inherits from Number)
		Generator<?> g;
	    Generator<Double> gen2 = new Generator<Double>();
	    g = gen2;

	}
	
	
	
	
	
}

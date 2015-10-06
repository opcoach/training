package com.opcoach.java;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opcoach.java.SampleGenericClass.Bike;
import com.opcoach.java.SampleGenericClass.Car;
import com.opcoach.java.SampleGenericClass.Customer;
import com.opcoach.java.SampleGenericClass.RentalObject;

@SuppressWarnings("rawtypes")

public class ObjectEtClasses
{

	public interface Comparable
	{
		int compareTo(Object other);
	}

	public interface Constants
	{
		// Max weight in kg
		public static final int MAX_WEIGHT = 550;
	}

	@SuppressWarnings("all")

	public class Vector<E> extends AbstractList<E>implements Comparable
	{
		private static final long serialVersionUID = 1L;
		protected Object[] elementData;

		public Vector(int initialCapacity)
		{
			super();
			elementData = new Object[initialCapacity];
		}

		public Vector()
		{
			this(10);
		}

		@Override
		public E get(int index)
		{
			return (E) elementData[index];
		}

		@Override
		public int size()
		{
			return elementData.length;
		}

		@Override
		public int compareTo(Object other)
		{
			return 0;
		}

	}

	class A
	{
	}

	public final class B extends A
	{
		// The class B can not be extended
	}

	@SuppressWarnings("all")
	public void finalfunction()
	{
		class temp
		{

			public final int CST_MAX = 5;

			public final void myFinalMethod()
			{
			}

			public void callMath()
			{

				double twoPower3 = Math.pow(2, 3);
			}

		}

	}

	public static class OptimizedCache
	{
		static Map<String, Object> _cache = new HashMap<String, Object>();

		public static final String HTTP_PROTOCOL = "http";

	}

	Collection liste = (Collection) new ArrayList();

	Collection col = new ArrayList();
	ArrayList list = (ArrayList) col;

	public enum DocumentType1
	{
		Bill, Letter, Proposal
	}

	DocumentType1 type = DocumentType1.Bill;

	public enum DocumentType
	{
		Bill(1), Letter(2), Proposal(5);
		private int code;

		private DocumentType(int c)
		{
			code = c;
		}

		public int getCode()
		{
			return code;
		}
	}

	static class factorySample
	{
		interface Car
		{
		};

		class CarImpl implements Car
		{
		};

		public interface CarRentalFactory
		{
			// Returns a new object of class 'Car'.
			Car createCar();
		}

		// Implementation
		public class CarRentalFactoryImpl implements CarRentalFactory
		{
			public Car createCar()
			{
				CarImpl car = new CarImpl();
				return car;
			}
		}
	}

	static class temp2
	{

		public interface MyList<E>
		{
			void add(E x);

			Iterator<E> iterator();
		}

		public interface Iterator<E>
		{
			E next();

			boolean hasNext();
		}

	}

	static class forSampleClass
	{
		public class RentalObject
		{
			public void rent(Customer c)
			{
			}
		}

		class Bike extends RentalObject
		{
			Bike(String nae)
			{
			}
		}

		class Car extends RentalObject
		{
			Car(String nae)
			{
			}
		}

		class Customer
		{
			Customer(String nae)
			{
			}
		}

		// Sample
		// Sample
		public void sample()
		{

			Bike bike = new Bike("Kawasaki");
			Car car = new Car("Tesla");
			Customer john = new Customer("John");
			List<RentalObject> ro = new ArrayList<RentalObject>();
			ro.add(bike);
			ro.add(car);
			// Rent all objects to john.
			for (RentalObject toRent : ro)
			{
				toRent.rent(john);
			}

		}
	}
}

package com.opcoach.java;

// Code sample pour le Language.xml dans scenari
public class Language
{
	String nom, prenom;
	private int[] tabint = new int[30];

	public void stringBuilder()
	{

		StringBuilder sb = new StringBuilder("Nom : ");
		sb.append(nom).append(' ').append(prenom);
		String result = sb.toString();

	}

	public void arrays()
	{

		int[] tabint;
		tabint = new int[50];
		int[] tabint2 = new int[20];
		int[] tabint3 = new int[] { 1, 2, 3, 4, 5 };
		int[][] tabint2D = new int[5][10];
		Class<?>[] classes = new Class[] { String.class };

	}

	public void length()
	{

		for (int i = 0; i < tabint.length; i++)
			System.out.println(tabint[i]);

	}

	public void foreach()
	{

		for (int value : tabint)
		{
			System.out.println(value);
		}

	}

	public void whileSample()
	{

		int i = 0;
		while (i < tabint.length)
		{
			System.out.println("tabint[" + i + "] = " + tabint[i]);
			i++;
		}

	}

	public void dowhileSample()
	{

		int i = 0;
		do
		{
			System.out.println("tabint[" + i + "] = " + tabint[i]);
			i++;
		} while (i < tabint.length);

	}

	int a, b;

	public void condition()
	{

		if (a == b)
		{
			System.out.println(" a == b");
		} else if (a > b)
		{
			System.out.println(" a > b");
		} else
		{
			System.out.println(" a < b");
		}

	}

	public void multiplesection()
	{

		switch (a)
		{
		case 0:
			System.out.println("Case O");
			break;
		case 1:
		case 7:
			System.out.println("Case 1 or 7 ");
			break;
		default:
			System.out.println("Default treatment");
		}

	}

	class Exception1 extends Exception
	{
	}

	class Exception2 extends Exception
	{
	}

	public void blocktrycatch()
	{

		try
		{
			if (a == b)
				throw new Exception1();
			else
				throw new Exception2();
			
		} catch (Exception1 ex1)
		{
			System.out.println("Exception1");
		} catch (Exception2 ex2)
		{
			System.out.println("Exception2");
		}
		finally
		{
			System.out.println("In finally (always executed)");
		}

	}
}

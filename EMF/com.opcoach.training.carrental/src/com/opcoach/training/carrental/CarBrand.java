/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.training.carrental;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Car Brand</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.opcoach.training.carrental.CarrentalPackage#getCarBrand()
 * @model
 * @generated
 */
public enum CarBrand implements Enumerator
{
	/**
	 * The '<em><b>Audi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDI_VALUE
	 * @generated
	 * @ordered
	 */
	AUDI(0, "Audi", "Audi"),

	/**
	 * The '<em><b>Alpha Romeo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_ROMEO_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA_ROMEO(1, "AlphaRomeo", "Alpha Romeo"),

	/**
	 * The '<em><b>Bmw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMW_VALUE
	 * @generated
	 * @ordered
	 */
	BMW(2, "Bmw", "Bmw"),

	/**
	 * The '<em><b>Peugeot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEUGEOT_VALUE
	 * @generated
	 * @ordered
	 */
	PEUGEOT(3, "Peugeot", "Peugeot"),

	/**
	 * The '<em><b>Renault</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENAULT_VALUE
	 * @generated
	 * @ordered
	 */
	RENAULT(4, "Renault", "Renault");

	/**
	 * The '<em><b>Audi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Audi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUDI
	 * @model name="Audi"
	 * @generated
	 * @ordered
	 */
	public static final int AUDI_VALUE = 0;

	/**
	 * The '<em><b>Alpha Romeo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha Romeo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA_ROMEO
	 * @model name="AlphaRomeo" literal="Alpha Romeo"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_ROMEO_VALUE = 1;

	/**
	 * The '<em><b>Bmw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bmw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BMW
	 * @model name="Bmw"
	 * @generated
	 * @ordered
	 */
	public static final int BMW_VALUE = 2;

	/**
	 * The '<em><b>Peugeot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Peugeot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PEUGEOT
	 * @model name="Peugeot"
	 * @generated
	 * @ordered
	 */
	public static final int PEUGEOT_VALUE = 3;

	/**
	 * The '<em><b>Renault</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Renault</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RENAULT
	 * @model name="Renault"
	 * @generated
	 * @ordered
	 */
	public static final int RENAULT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Car Brand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CarBrand[] VALUES_ARRAY =
		new CarBrand[]
		{
			AUDI,
			ALPHA_ROMEO,
			BMW,
			PEUGEOT,
			RENAULT,
		};

	/**
	 * A public read-only list of all the '<em><b>Car Brand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CarBrand> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Car Brand</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CarBrand get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			CarBrand result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Car Brand</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CarBrand getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			CarBrand result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Car Brand</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CarBrand get(int value)
	{
		switch (value)
		{
			case AUDI_VALUE: return AUDI;
			case ALPHA_ROMEO_VALUE: return ALPHA_ROMEO;
			case BMW_VALUE: return BMW;
			case PEUGEOT_VALUE: return PEUGEOT;
			case RENAULT_VALUE: return RENAULT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CarBrand(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //CarBrand

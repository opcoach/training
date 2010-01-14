// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message.resolver;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * A prefix manager to get value in a bean. The value name is the property name.
 */
public class BeanPrefixManager implements PrefixManager
{
	private Object _bean = null;

	/** Init with a map (if null, will do nothing). */
	public BeanPrefixManager(Object bean)
	{
		_bean = bean;
	}

	/*
	 * Method called each time a variable has to be resolved with this PrefixManager.
	 * @param propertyName The property Name without the prefix.
	 * @param result The StringBuffer where the resulting string has to be appended.
	 * @result true if the specified variable could be resolved.
	 */
	public boolean appendVariableValue(String propertyName, StringBuffer result)
	{

		try
		{
			PropertyDescriptor desc = new PropertyDescriptor(propertyName, _bean.getClass());
			Method m = desc.getReadMethod();
			String varValue = m.invoke(_bean, (Object[]) null).toString();

			result.append(varValue);
			return true;

		} catch (Exception ex)
		{
			// Whatever exception, will return false... and nothing will be translated.
		}

		return false;

	}
}

// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message.resolver;

/**
 * Java System proporties based prefix manager. Variable resolution is performed by calling
 * System.getProperty(variableName) method.
 */
public class SystemPrefixManager implements PrefixManager
{
	/*
	 * Method called each time a variable has to be resolved with this PrefixManager.
	 * @param variable The variable name, without the prefix.
	 * @param result The StringBuffer where the resulting string has to be appended.
	 * @result true if the specified variable could be resolved.
	 */
	public boolean appendVariableValue(String variable, StringBuffer result)
	{
		String varValue = System.getProperty(variable);
		if (varValue != null)
		{
			result.append(varValue);
			return true;
		}

		return false;

	}
}

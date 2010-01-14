// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message.resolver;

/**
 * Interface imlemented by classes allowing the PrefixReolver to resolve a variable for a given prefix.
 */
public interface PrefixManager
{
	/*
	 * Method called each time a variable has to be resolved with this PrefixManager.
	 * @param variable The variable name, without the prefix.
	 * @param result The StringBuffer where the resulting string has to be appended.
	 * @result true if the specified variable could be resolved.
	 */
	public boolean appendVariableValue(String variable, StringBuffer result);
}

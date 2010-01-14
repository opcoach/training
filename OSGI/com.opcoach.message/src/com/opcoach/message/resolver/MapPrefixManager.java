// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message.resolver;

import java.util.Map;

/**
 * A prefix manager to get value in the given map.
 */
public class MapPrefixManager implements PrefixManager
{
	private Map<String, Object> _params = null;

	/** Init with a map (if null, will do nothing). */
	public MapPrefixManager(Map<String, Object> params)
	{
		_params = params;
	}

	/*
	 * Method called each time a variable has to be resolved with this PrefixManager.
	 * @param variable The variable name, without the prefix.
	 * @param result The StringBuffer where the resulting string has to be appended.
	 * @result true if the specified variable could be resolved.
	 */
	public boolean appendVariableValue(String variable, StringBuffer result)
	{
		if (_params == null)
			return false;

		Object v = _params.get(variable);
		String varValue = (v == null) ? null : v.toString();
		if (varValue != null)
		{
			result.append(varValue);
			return true;
		}

		return false;

	}
}

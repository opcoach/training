// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message.resolver;

import java.util.HashMap;
import java.util.Map;

/**
 * Prefix based Variable resolver. Context is optional for variable resolution (it can be null). Resolution is based on
 * prefix determination of resolution algorithm. The prefix is supposed to be the part of the variable name before the
 * ':' character. The resolution will be performed with the <code>PrefixManager</code> associated with the encontred
 * prefix. Ex: "Locale = '${system:locale}'" => "Locale = 'fr'". In that example, the PrefixManager used for resolution
 * is the prefix registered with "system" prefix name. To register a PrefixManager, the methode
 * addPreficManager(PrefixManager, prefix) should be used. If variable could not be resolved (the prefix has no
 * registered PrefixManager or the PrefixManager could no resolve the variable, the VariableResolver will try and
 * resolve the variable with the Map passed as the context parameter if it is not null.
 */
public class PrefixVariableResolver extends MapVariableResolver
{
	/* The map registering each PrefixManager */
	private Map<String, PrefixManager> _prefixManagerMap;

	public PrefixVariableResolver(boolean allowUnresolved)
	{
		super(allowUnresolved);
	}

	public PrefixVariableResolver(String startDelimiter, String endDelimiter, boolean allowUnresolved)
	{
		super(startDelimiter, endDelimiter, allowUnresolved);
	}

	public PrefixVariableResolver()
	{
		this(false);
	}

	public PrefixVariableResolver(String startDelimiter, String endDelimiter)
	{
		super(startDelimiter, endDelimiter);
	}

	private void _initManagerMap()
	{
		if (_prefixManagerMap == null)
		{
			_prefixManagerMap = new HashMap<String, PrefixManager>();
		}
	}

	public void addPrefixManager(String name, PrefixManager pm)
	{
		_initManagerMap();
		_prefixManagerMap.put(name, pm);
	}

	@Override
	protected void appendVariableValue(String variable, StringBuffer result, Object context) throws Exception
	{
		boolean resolved = false;
		int prefixEnd = variable.indexOf(':');
		if ((prefixEnd != -1) && (variable.length() > prefixEnd + 1))
		{
			String prefix = variable.substring(0, prefixEnd);
			if (_prefixManagerMap != null)
			{
				PrefixManager pm = _prefixManagerMap.get(prefix);
				if (pm != null)
				{
					String suffix = variable.substring(prefixEnd + 1);
					resolved = pm.appendVariableValue(suffix, result);
				}
			}
		}
		if (!resolved)
		{
			if (context != null)
			{
				super.appendVariableValue(variable, result, context);
			} else
			{
				if (_allowUnresolved)
				{ // Keep variables name
					result.append(getStartDelimiter()).append(variable).append(getEndDelimiter());
				} else
				{
					throw new IllegalArgumentException("Cannot resolve variable '" + variable + "'"); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
		}
	}
}

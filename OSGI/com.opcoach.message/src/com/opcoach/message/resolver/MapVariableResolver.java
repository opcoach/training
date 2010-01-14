// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message.resolver;

import java.util.Map;

/**
 * A simple (but useful) implementation of {@link VariableResolver} that resolves variables from their values defined in
 * a Map.
 * <p>
 * Example :
 * 
 * <pre>
 * MapVariableResolver resolver = new MapVariableResolver(&quot;{&quot;, &quot;}&quot;);
 * Map map = new HashMap();
 * map.put(&quot;color&quot;, &quot;blue&quot;);
 * map.put(&quot;weather&quot;, &quot;cold&quot;);
 * System.out.println(resolver.resolve(&quot;When the weather is {weather}, I wear my {color} coat.&quot;, map));
 * </pre>
 * 
 * will output "When the weather is cold, I wear my blue coat."
 * 
 * @author sylvain
 * @version CVS $Revision: 1.2 $ $Date: 2006-12-01 15:41:00 $
 */

public class MapVariableResolver extends VariableResolver
{
	protected boolean _allowUnresolved;

	public MapVariableResolver(boolean allowUnresolved)
	{
		super();
		_allowUnresolved = allowUnresolved;
	}

	public MapVariableResolver(String startDelimiter, String endDelimiter, boolean allowUnresolved)
	{
		super(startDelimiter, endDelimiter);
		_allowUnresolved = allowUnresolved;
	}

	public MapVariableResolver()
	{
		this(false);
	}

	public MapVariableResolver(String startDelimiter, String endDelimiter)
	{
		this(startDelimiter, endDelimiter, false);
	}

	@Override
	protected void appendVariableValue(String variable, StringBuffer result, Object context) throws Exception
	{
		Object value = ((Map<String, Object>) context).get(variable);
		if (value == null)
		{
			if (_allowUnresolved)
			{ // Keep variables name
				result.append(getStartDelimiter()).append(variable).append(getEndDelimiter());
			} else
			{
				throw new IllegalArgumentException("Cannot resolve variable '" + variable + "'"); //$NON-NLS-1$ //$NON-NLS-2$
			}
		} else
		{
			result.append(value);
		}
	}

	/*
	 * // Tests ï¿½ faire en JUnit ;) protected void appendLitteral(String litteral, StringBuffer result, Object
	 * context) { result.append('{').append(litteral).append('}'); } public static void main(String [] args) {
	 * MapVariableResolver res = new MapVariableResolver("${", "}"); Map map = new java.util.HashMap(); map.put("var1",
	 * "[-1-]"); map.put("var2", new Integer(145)); System.out.println(res.resolve("${var1}", map));
	 * System.out.println(res.resolve(">>${var1}--${var2}<<", map));
	 * System.out.println(res.resolve(">>${var1}-${var2}<", map)); System.out.println(res.resolve("${var2}${var1}",
	 * map)); }
	 */
}

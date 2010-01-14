// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message.resolver;

/**
 * Exception thrown when resolving expressions with a {@link VariableResolver}.
 */

public class VariableResolverException extends RuntimeException
{
	/**
     * 
     */
	private static final long serialVersionUID = 5095789902679850080L;

	public VariableResolverException()
	{
		super();
	}

	public VariableResolverException(String message)
	{
		super(message);
	}

	public VariableResolverException(Throwable e)
	{
		super(e);
	}

	public VariableResolverException(String message, Throwable e)
	{
		super(message, e);
	}
}
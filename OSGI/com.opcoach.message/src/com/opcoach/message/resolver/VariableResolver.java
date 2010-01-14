// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message.resolver;

/**
 * An abstract engine for resolving string values containing references to variables like
 * <code>"The ${color} umbrella"</code>. Variable resolution is deferred to concrete subclasses through the
 * {@link #appendVariableValue(String, StringBuffer, Object) appendVariableValue} method.
 * <p>
 * The default delimiters identifying variable names are '<code>${</code>' and '<code>}</code>', but they can be changed
 * using a specific constructor.
 * <p>
 * This class is also designed to be thread-safe : the <code>context</code> parameter in
 * {@link #resolve(String, Object)} can be used to pass the context required to resolve variable values without
 * requiring it to be stored as an instance attribute.
 * 
 * @author olivier
 * @version CVS $Revision: 1.2 $ $Date: 2006-12-01 15:41:00 $
 */

public abstract class VariableResolver
{
	private String _startDelim;
	private int _startLen;

	private String _endDelim;
	private int _endLen;

	/**
	 * Creates a new VariableResolver using the default delimiters ('<code>${</code>' and '<code>}</code>' for
	 * identifying variable names.
	 */
	protected VariableResolver()
	{
		this("${", "}"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Creates a new VariableResolver using specific variable names delimiters.
	 */
	protected VariableResolver(String startDelimiter, String endDelimiter)
	{
		_startDelim = startDelimiter;
		_endDelim = endDelimiter;

		_startLen = _startDelim.length();
		_endLen = _endDelim.length();
	}

	/**
	 * Returns the start delimiter for variable names. Default is "<code>${</code>".
	 * 
	 * @return the start delimiter.
	 */
	public final String getStartDelimiter()
	{
		return _startDelim;
	}

	/**
	 * Returns the end delimiter for variable names. Default is "<code>}</code>".
	 * 
	 * @return the end delimiter.
	 */
	public final String getEndDelimiter()
	{
		return _endDelim;
	}

	/**
	 * Resolves an expression, within a particular context that defines variable values.
	 * 
	 * @param expr
	 *            the expression to resolve
	 * @param context
	 *            the context defining variable values
	 * @return the resolved expression
	 * @throws VariableResolverException
	 */
	public String resolve(String expr, Object context) throws VariableResolverException
	{
		int length;
		if (expr == null || (length = expr.length()) == 0)
			return expr;

		// - StringBuffer result = new StringBuffer();

		int start = expr.indexOf(_startDelim);
		if (start == -1)
		{
			// - appendLitteral(expr, result, context);
			// - return result.toString();
			return expr;
		}

		StringBuffer result = new StringBuffer();
		int end = 0;

		while (start != -1)
		{
			// Append literal string fragment
			if (start > end)
			{
				// - appendLitteral(expr.substring(end, start), result, context);
				result.append(expr.substring(end, start));
			}

			// Pass start delimiter
			start += _startLen;

			// Find end delimiter
			end = expr.indexOf(_endDelim, start);
			if (end == -1)
			{
				throw new VariableResolverException("Missing '" + _endDelim + "' in '" + expr + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}

			// Resolve variable value
			String name = expr.substring(start, end);
			try
			{
				appendVariableValue(name, result, context);
			} catch (Exception e)
			{
				throw new VariableResolverException("Error while resolving '" + name + "' in '" + expr + "'", e); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}

			// Pass end delimiter
			end += _endLen;
			// and find next start delimiter
			start = expr.indexOf(_startDelim, end);
		}

		if (end < length)
		{
			// - appendLitteral(expr.substring(end), result, context);
			result.append(expr.substring(end));
		}

		return result.toString();

	}

	// - /**
	// - * Append a litteral substring of the expression to the result. The default here is
	// - * to append it without modifications. Subclasses may want to redefine this for specific
	// - * purposes (e.g. a code-generation engine can surround it whith '+"' and '"' to perform
	// - * String concatenation).
	// - *
	// - * @param litteral the litteral substring of the expression.
	// - * @param result the current result to which the litteral value should be appended.
	// - * @param context an object that holds the resolution context.
	// - */
	// - protected void appendLitteral(String litteral, StringBuffer result, Object context)
	// - {
	// - result.append(litteral);
	// - }

	/**
	 * Append the value of a variable to the result. Must be defined by concrete subclasses.
	 * 
	 * @param variable
	 *            the variable name.
	 * @param result
	 *            the current result to which the variable value should be appended.
	 * @param context
	 *            an object that holds the resolution context.
	 * @throws Exception
	 *             when an error occured during variable resolution.
	 */
	protected abstract void appendVariableValue(String variable, StringBuffer result, Object context) throws Exception;
}
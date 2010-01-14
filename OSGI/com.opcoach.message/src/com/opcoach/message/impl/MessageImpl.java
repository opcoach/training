// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 


package com.opcoach.message.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.opcoach.message.Message;
import com.opcoach.message.Recipient;
import com.opcoach.message.resolver.BeanPrefixManager;
import com.opcoach.message.resolver.MapPrefixManager;
import com.opcoach.message.resolver.PrefixVariableResolver;
import com.opcoach.message.resolver.SystemPrefixManager;
import com.opcoach.message.resolver.VariableResolver;


public class MessageImpl implements Message
{
	/** A unique ID for this notification */
	private String _id;

	protected long _date;

	protected Collection<Recipient> _recipients;

	private String _message = null;

	private StringBuffer _messBuff = null;

	protected String _title;

	/** The data used to valuate messages... access with bean: prefix */
	protected Object _data;

	/** A static system prefix manager (which is thread safe), to translate system values */
	private static SystemPrefixManager _spm = new SystemPrefixManager();

	/** A resolver to get title and messages */
	private VariableResolver _resolver = null;

	
	
	
	public MessageImpl(String title)
	{
		// Define the unique ID.
		_id = MessageKeyGenerator.generateKeyId(); 

		_recipients = new ArrayList<Recipient>();
		_date = System.currentTimeMillis();
		setTitle(title);
	}
	
	public MessageImpl()
	{
		this("");
	}

	public void addRecipient(Recipient rec)
	{
		_recipients.add(rec);

	}

	
	

	public void addRecipients(Collection<Recipient> recipients)
	{
		_recipients.addAll(recipients);
	}

	public void setData(Object data)
	{
		this._data = data;
	}

	public Object getData()
	{
		return _data;
	}

	public void setDate(long date)
	{
		this._date = date;
	}

	public long getDate()
	{
		return _date;
	}

	public String getId()
	{
		// TODO Auto-generated method stub
		return _id;
	}

	public String getMessage()
	{
		if (_messBuff != null)
		{
			_message = _messBuff.toString();
			_messBuff = null;
		}
		return _message;
	}

	/** Define delimiters for resolver */
	private static final String START_DELIM = "${"; //$NON-NLS-1$
	private static final String END_DELIM = "}"; //$NON-NLS-1$

	/**
	 * Translate the message using the parameters set in params map. This method translates the following parameters
	 * with : ${system:varName} returns the system value named varName ${bean:property} returns the property value for
	 * the bean set with setData ${param:key} or ${key} returns the value for the parameter named 'key' see the
	 * Notification constants.
	 * 
	 * @param params
	 * @return
	 */
	public String _resolveString(String str, Map<String, Object> params)
	{

		// check if there is any delimiter inside.
		int posDelim = str.indexOf(START_DELIM);
		if (posDelim < 0)
		{
			return str;
		}

		// There are some things to be translated...
		// Create resolver with needed prefixes...
		_createResolver(params);

		// Ok Can now resolve the string.
		String messResolved = _resolver.resolve(str, params);
		return messResolved;

	}

	/**
	 * Translate the message using the parameters set in params map. This method translates the following parameters
	 * with : ${system:varName} returns the system value named varName ${bean:property} returns the property value for
	 * the bean set with setData ${param:key} or ${key} returns the value for the parameter named 'key' see the
	 * Notification constants.
	 * 
	 * @param params
	 * @return
	 */
	public String getMessage(Map<String, Object> params)
	{
		return (params != null) ? _resolveString(getMessage(), params) : getMessage();

	}

	private void _createResolver(Map<String, Object> params)
	{
		if (_resolver == null)
		{

			// There are some things to be translated...
			// Create resolver with needed prefixes...
			PrefixVariableResolver resolver = new PrefixVariableResolver(START_DELIM, END_DELIM, true);
			resolver.addPrefixManager("system", _spm); //$NON-NLS-1$

			if (params != null)
			{
				resolver.addPrefixManager("param", new MapPrefixManager(params)); //$NON-NLS-1$
			}
			if (_data != null)
			{
				resolver.addPrefixManager("data", new BeanPrefixManager(_data)); //$NON-NLS-1$
				// resolver.addPrefixManager("url", new URLPrefixManager(_data, params)); //$NON-NLS-1$
				// resolver.addPrefixManager("user", new UserPrefixManager(_data));
			}

			_resolver = resolver;
		}

	}

	public void setMessage(String message)
	{
		this._message = message;
	}

	public void appendLine(String message)
	{
		// Choose if no message is defined, or use a string buffer.
		if (_message == null)
		{
			setMessage(message);
		} else
		{
			if (_messBuff == null)
				_messBuff = new StringBuffer(_message);
			_messBuff.append("\n"); //$NON-NLS-1$
			_messBuff.append(message);
		}
	}

	public String getTitle()
	{
		return _title;
	}

	public String getTitle(Map<String, Object> params)
	{
		return _resolveString(getTitle(), params);

	}

	public void setTitle(String title)
	{
		this._title = title;
	}

	@Override
	public boolean equals(Object obj)
	{
		if ((obj != null) && obj instanceof Message)
		{
			return _id.equals(obj);
		}

		return false;
	}

	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer(_getDescription());
		sb.append("\nTitle : ").append(getTitle()); //$NON-NLS-1$
		sb.append("\nRecipients : ").append(_recipients); //$NON-NLS-1$
		sb.append("\nMessage : ").append(getMessage()); //$NON-NLS-1$

		return sb.toString();
	}

	protected String _getDescription()
	{
		StringBuffer sb = new StringBuffer("--------  Notif #"); //$NON-NLS-1$
		sb.append(getId()).append("  ------------------"); //$NON-NLS-1$
		return sb.toString();
	}

	public Collection<Recipient> getRecipients()
	{
		return _recipients;
	}

}

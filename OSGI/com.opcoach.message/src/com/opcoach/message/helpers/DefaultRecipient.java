// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message.helpers;

import com.opcoach.message.Recipient;

/** A simple POJO to implement recipien. This class may be extended. It's provided in helper public package
 * */
public class DefaultRecipient implements Recipient
{
	protected String _id = null;

	protected String _name = null;

	protected String _mail = null;
	protected String _phone = null;
	protected String _notificationServerAddress = null;
	protected String _SMSNumber = null;

	public String getMail()
	{
		return _mail;
	}

	public void setMail(String mail)
	{
		this._mail = mail;
	}

	public String getNotificationServerAddress()
	{
		return _notificationServerAddress;
	}

	public void setNotificationServerAddress(String notificationServerAddress)
	{
		this._notificationServerAddress = notificationServerAddress;
	}

	public String getPhone()
	{
		return _phone;
	}

	public void setPhone(String phone)
	{
		this._phone = phone;
	}

	public String getSMSNumber()
	{
		return _SMSNumber;
	}

	public void setSMSNumber(String smsNumber)
	{
		this._SMSNumber = smsNumber;
	}

	public DefaultRecipient(String id, String name)
	{
		_id = id;
		_name = name;
	}

	public DefaultRecipient(String id)
	{
		_id = id;
	}

	public String getDisplayName()
	{
		// TODO Auto-generated method stub
		return _name;
	}

	public String getId()
	{
		// TODO Auto-generated method stub
		return _id;
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return getDisplayName();
	}

}

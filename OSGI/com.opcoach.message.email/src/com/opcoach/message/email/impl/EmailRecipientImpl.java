package com.opcoach.message.email.impl;

import com.opcoach.message.email.EmailRecipient;
import com.opcoach.message.helpers.DefaultRecipient;

public class EmailRecipientImpl extends DefaultRecipient implements EmailRecipient
{

	private String emailAddress;

	public EmailRecipientImpl(String id, String mail)
	{
		super(id);
		setEmailAddress(mail);
	}

	

	/**
	 * Get the mail to send mail notifications. If several mails are used, get a comma separated list of mails.
	 * 
	 * @return the mail if defined, a comma separated list or null if none.
	 */
	public String getEmailAddress()
	{
		return emailAddress;
	}

	public void setEmailAddress(String email)
	{
		emailAddress = email;
	}

}

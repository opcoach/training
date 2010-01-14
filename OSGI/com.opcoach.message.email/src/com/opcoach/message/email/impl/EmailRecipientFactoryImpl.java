package com.opcoach.message.email.impl;

import com.opcoach.message.email.EmailRecipient;
import com.opcoach.message.email.EmailRecipientFactory;

public class EmailRecipientFactoryImpl implements EmailRecipientFactory
{

	private static EmailRecipientFactory instance = new EmailRecipientFactoryImpl();

	private EmailRecipientFactoryImpl()
	{

	}

	public static EmailRecipientFactory getDefault()
	{
		return instance;
	}

	public EmailRecipient createRecipient(String id)
	{
		// TODO Auto-generated method stub
		EmailRecipient mr = new EmailRecipientImpl(id, null);
		return mr;
		
	}

	

}

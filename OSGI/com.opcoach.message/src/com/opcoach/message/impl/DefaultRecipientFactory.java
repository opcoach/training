// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message.impl;

import com.opcoach.message.Recipient;
import com.opcoach.message.RecipientFactory;
import com.opcoach.message.helpers.DefaultRecipient;

public class DefaultRecipientFactory implements RecipientFactory
{

	private static RecipientFactory instance = new DefaultRecipientFactory();

	private DefaultRecipientFactory()
	{

	}

	public static RecipientFactory getDefault()
	{
		return instance;
	}

	public Recipient createRecipient(String id)
	{
		// TODO Auto-generated method stub
		return new DefaultRecipient(id);
	}

	

}

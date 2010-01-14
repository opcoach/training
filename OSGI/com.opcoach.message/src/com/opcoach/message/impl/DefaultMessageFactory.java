// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message.impl;

import com.opcoach.message.Message;
import com.opcoach.message.MessageFactory;

public class DefaultMessageFactory implements MessageFactory
{

	private static MessageFactory instance = new DefaultMessageFactory();

	/** private constructor (hide from outside) */
	private DefaultMessageFactory()
	{

	}

	public static MessageFactory getDefault()
	{
		return instance;
	}

	public Message createMessage()
	{
		// TODO Auto-generated method stub
		return new MessageImpl();
	}
	
	public Message createMessage(String title)
	{
		// TODO Auto-generated method stub
		return new MessageImpl(title);
	}

}

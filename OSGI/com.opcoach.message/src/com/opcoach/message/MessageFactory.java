// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message;


public interface MessageFactory
{
	public static MessageFactory eInstance =  com.opcoach.message.impl.DefaultMessageFactory.getDefault();

	public Message createMessage();

	public Message createMessage(String title);
}

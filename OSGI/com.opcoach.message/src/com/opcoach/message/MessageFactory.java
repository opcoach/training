// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message;

public interface MessageFactory
{

	public Message createMessage();

	public Message createMessage(String title);
}

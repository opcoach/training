// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message;

public class MessageException extends Exception
{

	/**
     * 
     */
	private static final long serialVersionUID = 1L;

	public MessageException(String mess)
	{
		super(mess);
	}

	public MessageException(String mess, Throwable cause)
	{
		super(mess + '\n' + cause);
	}

}

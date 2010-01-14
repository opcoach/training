// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message.helpers;

import com.opcoach.message.MessageSender;

/** An helper class to manage id and name of message sender.
 * @author olivier
 *
 */
public abstract class DefaultMessageSender implements MessageSender
{
	private String id; 
	private String name;
	
	
	public DefaultMessageSender(String id, String name)
	{
		setId(id);
		setName(name);
	}
	
	public String getID()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

}

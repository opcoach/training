// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message;


import java.util.Map;

/**
 * This interface defines the message sending service Sender must be registered on OSGi as services. 
 * A service can return its name and ID The sender services are managed by the MessagePlatform
 * 
 * @author olivier
 */
public interface MessageSender
{

	/** The message sender provides the recipient factory */
	public static final RecipientFactory factory =  com.opcoach.message.impl.DefaultRecipientFactory.getDefault();

	/**
	 * send the message to the recipients defined in message.
	 * 
	 * @param message the message to be sent (channel independent)
	 * @param params an optional map of parameters used to send the message
	 */
	public void send(Message message, Map<String, Object> params) throws Exception;
	
	/** The message sender can be retrieve by its ID on message platform
	 * 
	 * @return the unique ID for this sender.
	 */
	public String getID();
	
	/**
	 * 
	 * @return the i18n name of this sender (can be used to choose the message sender)
	 */
	public String getName();

}

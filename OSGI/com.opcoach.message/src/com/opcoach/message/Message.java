// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message;

import java.util.Collection;
import java.util.Map;

/**
 * This interface defines a notification. Notifications are events sent to recipients. Several ways are possible : sms,
 * mail, and any other way available from server. Theses ways are implemented by implementing the notify method.
 * Notifications are created and proceeded when some events occures as defined in the medany model.
 * 
 * @author olivier
 * 
 */
public interface Message
{

	public MessageFactory factory = com.opcoach.message.impl.DefaultMessageFactory.getDefault();

	/**
	 * All notification have an Id
	 * 
	 * @return the unique ID for this notification.
	 */
	public String getId();

	/**
	 * All notification has a Date for history
	 * 
	 * @return the date as a long.
	 */
	public long getDate();

	/**
	 * Add a recipient for this message
	 * 
	 * @param rec
	 *            the recipient to add. If null, this method does nothing.
	 */
	public void addRecipient(Recipient rec);

	/**
	 * Add a collection of recipients to this notification
	 * 
	 * @param recipients
	 *            the list of recipients.
	 */
	public void addRecipients(Collection<Recipient> recipients);

	/**
	 * Set a global message for a string notification. If you want to set a message on several lines, use addMessageLine
	 * instead.
	 * 
	 * @param message
	 *            the message to send to recipients. This message can contains 'strings' like this : {paramName} or
	 *            {bean:fieldname} which will be replaced with the parameters given to the send method.
	 */
	public void setMessage(String message);

	/**
	 * Add a line to the current message. It adds automatically an \n character
	 * 
	 * @param message
	 *            the message to send to recipients. This message can contains 'strings' like this : {paramName} or
	 *            {bean:fieldname} which will be replaced with the parameters given to the send method.
	 */
	public void appendLine(String message);

	/**
	 * @param params
	 *            parameter to translate title (can be null)
	 * @return the title. Translate it with params if params is not null
	 */
	public String getTitle(Map<String, Object> params);

	/**
	 * @param params
	 *            parameter to translate message (can be null)
	 * @return the translated message, using the params.
	 */
	public String getMessage(Map<String, Object> params);

	/** Set the data to use to valuate message or title. Value of data can be get with the data: prefix */
	public void setData(Object data);

	/** Get the data to use for message or title. Value of data can be get with the data: prefix */
	public Object getData();

	/** @return the list of recipients */
	public Collection<Recipient> getRecipients();

}

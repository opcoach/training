
// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message.email;

import com.opcoach.message.RecipientFactory;


/**
 * Create a default recipient. Hide the implementation outside of OSGi module. 
 * 
 */
public interface EmailRecipientFactory extends RecipientFactory
{


	/**
	 * Create a recipient from its unique ID (usually its login).
	 * 
	 * @param id  the login user id.
	 * @return the corresponding recipient.
	 */
	public EmailRecipient createRecipient(String id);

	

}

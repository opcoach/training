// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message.email;

import com.opcoach.message.Recipient;

public interface EmailRecipient extends Recipient
{

	/**
	 * Get the mail to send mail notifications. If several mails are used, get a comma separated list of mails.
	 * 
	 * @return the mail if defined, a comma separated list or null if none.
	 */
	public String getEmailAddress();
	
	
	public void setEmailAddress(String mail);

}

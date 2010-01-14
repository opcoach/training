// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message;

/**
 * This interface defines a recipient for a message.
 * 
 * @author olivier
 * 
 */
public interface Recipient
{
	
	/** A recipient has a display name */
	public String getDisplayName();

	/** A recipient has a unique ID */
	public String getId();

}

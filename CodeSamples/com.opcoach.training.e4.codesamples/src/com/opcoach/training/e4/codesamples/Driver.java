// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2010     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.e4.codesamples;

import java.net.URL;

/**
 * @author olivier
 *
 */
public interface Driver
{
	 // A sample driver interface for other
	public void encode(Object o);   
	
	public void decode(Object o);
	
	public void setConfiguration(URL u);

}

// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message.email;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.opcoach.message.MessageSender;

public class EmailMessageActivator implements BundleActivator
{

	public void start(BundleContext context) throws Exception
	{
		context.registerService(MessageSender.class.getName(), new EmailMessageSender(), null);
	}

	public void stop(BundleContext context) throws Exception
	{
	}

}

package com.opcoach.training.rental.xtend;

public class LamdaJavaSample
{
	public void listenerWithJava()
	{
		IMessageSender sender = new MailSender();
		// Add a listener using the standard java notation
		sender.addMessageListener(new IMessageListener()
			{
				public void messageReceived(MessageEvent e)
				{
					System.out.println("Message received : " + e.getMessage());
				}
			});
	}
}

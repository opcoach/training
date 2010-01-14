package com.opcoach.message.test;

import org.junit.Before;
import org.junit.Test;

import com.opcoach.message.Message;
import com.opcoach.message.MessageException;
import com.opcoach.message.MessagePlatform;
import com.opcoach.message.email.EmailMessageSender;
import com.opcoach.message.email.EmailRecipient;

import static junit.framework.Assert.*;


public class SendMailTest 
{

	
	public SendMailTest() {}
	
	@Before public void init()
	{
		int a = 0;
		System.out.println("A = " + a);
	}
	
	
	@Test(timeout=100) public void myFunction()
	{
		System.out.println("My function is ok");
	}
	
	@Test public void sendBasicMail() throws Exception
	{
		// On récupère le service sur la platform. 
		EmailMessageSender mailSender = (EmailMessageSender) MessagePlatform.getDefault().getMessageSender("com.opcoach.message.mail");
		if (mailSender == null)
		{
			throw new MessageException("The mail service is not available. Check the OSGi configuration");
			
		}
		EmailRecipient olivier =  mailSender.factory.createRecipient("olivier");
		olivier.setEmailAddress("olivier.prouvost@free.fr");
		
		
		Message m = Message.factory.createMessage("Un mail de test pour prévenir");
		m.addRecipient(olivier);
		mailSender.send(m, null);
		
		assertTrue(true);
		
	}
	
	public void toto()
	{
		System.out.println("Fonction bidon pour éviter le No Runnable au lancement !!");
	}


}

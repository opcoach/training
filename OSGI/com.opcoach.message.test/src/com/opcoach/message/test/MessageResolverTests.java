package com.opcoach.message.test;

import static junit.framework.Assert.assertEquals;

import java.util.Collections;

import org.junit.Test;

import com.opcoach.message.Message;



public class MessageResolverTests 
{

	public MessageResolverTests()
	{
		super();
	}

	
	@SuppressWarnings("unchecked")
	@Test public void translateMessageWithSystemVariable()
	{
		Message currentMessage = Message.factory.createMessage("Titre du message");
		currentMessage
				.setMessage("salut utilisateur. On utilise la version :  ${system:java.version}");
		String translatedMessage = currentMessage.getMessage(null);

		System.out.println("Test de ma fonction" + translatedMessage);
	}

	public class Temp
	{
		private String name;

		public Temp(String n)
		{
			name = n;
		}

		public String getName()
		{
			return name;
		}

		public void setName(String n)
		{
			name = n;
		}

	}

	 @Test public void translateMessageWithDataVariable()
	{
		String txtSuffix = "Le nom de l'objet est : ";
		String name = "Zorro";

		Message currentMessage = Message.factory.createMessage("Message avec un objet en paramtre");

		Temp data = new Temp(name);
		currentMessage.setData(data);
		currentMessage.setMessage(txtSuffix + "${data:name}");

		String translatedMessage = currentMessage.getMessage(Collections.EMPTY_MAP);

		assertEquals(translatedMessage, txtSuffix + name);
	}
	
	

}

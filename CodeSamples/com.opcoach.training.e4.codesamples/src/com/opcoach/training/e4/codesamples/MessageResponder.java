package com.opcoach.training.e4.codesamples;

import javax.inject.Inject;

public class MessageResponder
{

	@Inject
	private MessageSender sender;

	@Inject
	public void sendAMessage(MessageSender s)
	{
		
	}
	
	
	class MessageSender{};
}

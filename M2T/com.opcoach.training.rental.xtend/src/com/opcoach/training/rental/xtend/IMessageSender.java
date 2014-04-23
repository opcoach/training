package com.opcoach.training.rental.xtend;

import java.util.List;

public interface IMessageSender
{
	public void send(Message m);
	
	 public <T> void  send(List<T> l);
	 
	 public void addMessageListener(IMessageListener listner);
}

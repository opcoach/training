package com.opcoach.training.rental.xtend

class LambdaSample {
	
	
	def lambdaSample()
	{
		var sender = new MailSender
		// Lambda to add a listener
		sender.addMessageListener([MessageEvent e | println("Message received : " + e.getMessage())])
	}
	
	
	def shortLambdaSample()
	{
		var sender = new MailSender
		// Use lambda with simplified notation
		sender.addMessageListener([println("Message received : " + it.getMessage())])
	}
	
}
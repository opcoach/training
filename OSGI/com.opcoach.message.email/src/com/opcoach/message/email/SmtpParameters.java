package com.opcoach.message.email;

/**
 * Store the stmp parameters (server, login, password... )
 * 
 * @author olivier
 * 
 */
public class SmtpParameters
{
	public static final SmtpParameters DEFAULT_SMTP = new SmtpParameters("smtp.free.fr", null, null);
	private String smtpServer;
	private String smtpLogin;
	private String smtpPasswd;

	public SmtpParameters(String server, String login, String pass)
	{
		smtpServer = server;
		smtpLogin = login;
		smtpPasswd = pass;
	}

	public String getSmtpServer()
	{
		return smtpServer;
	}

	public void setSmtpServer(String smtpServer)
	{
		this.smtpServer = smtpServer;
	}

	public String getSmtpLogin()
	{
		return smtpLogin;
	}

	public void setSmtpLogin(String smtpLogin)
	{
		this.smtpLogin = smtpLogin;
	}

	public String getSmtpPasswd()
	{
		return smtpPasswd;
	}

	public void setSmtpPasswd(String smtpPasswd)
	{
		this.smtpPasswd = smtpPasswd;
	}

}

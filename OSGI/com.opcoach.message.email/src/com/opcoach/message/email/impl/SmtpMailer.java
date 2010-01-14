// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 
package com.opcoach.message.email.impl;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import com.opcoach.message.email.SmtpParameters;

/** A utility class for sending easily a mail */
public class SmtpMailer
{

	protected String _smtpServer;
	protected String _mimeType = "text/plain"; //$NON-NLS-1$
	private Session _session;

	public SmtpMailer()
	{
		this(SmtpParameters.DEFAULT_SMTP);
	}

	/** Build the smtp mailer, with the smtp server name */
	public SmtpMailer(SmtpParameters smtpParam)
	{
		if (smtpParam.getSmtpServer() == null)
		{
			throw new IllegalArgumentException("The smtp server in stmpMailer is not defined"); //$NON-NLS-1$
		}

		_smtpServer = smtpParam.getSmtpServer();
		Properties p = new Properties();
		p.put("mail.smtp.host", _smtpServer); //$NON-NLS-1$

		if (smtpParam.getSmtpLogin() != null)
		{
			/*
			 * TODO : Authenticator auth = new Authenticator() {
			 * @Override protected PasswordAuthentication getPasswordAuthentication() { // TODO coder gestion
			 * authentication sur smtp return super.getPasswordAuthentication(); } }
			 */
		}

		_session = Session.getInstance(p, null); // passer auth
	}

	/** Set the mime type to use for the next sent messages */
	public void setMimeType(String mimeType)
	{
		_mimeType = mimeType;
	}

	/**
	 * Send a mail to 'to' with subject and txt contents...
	 * 
	 * @param mail
	 *            the e-mail address.
	 *@param text
	 *            the contents of mail.
	 *@param subject
	 *            the subject of mail.
	 */
	public void sendMail(String mail, String subject, String txt) throws SendFailedException
	{
		sendMailImpl("", mail, subject, txt, null); //$NON-NLS-1$
	}

	/**
	 * Send a mail to 'to' with subject and txt contents...
	 * 
	 * @param mail
	 *            the e-mail address.
	 *@param text
	 *            the contents of mail.
	 *@param subject
	 *            the subject of mail.
	 *@param fileName
	 *            the path of the file to send with the message
	 */
	public void sendMail(String mail, String subject, String txt, String fileName) throws SendFailedException
	{
		sendMailImpl("", mail, subject, txt, new String[] { fileName }); //$NON-NLS-1$
	}

	/**
	 * Send a mail to 'to' with subject and txt contents...
	 * 
	 * @param mail
	 *            the e-mail address.
	 *@param text
	 *            the contents of mail.
	 *@param subject
	 *            the subject of mail.
	 *@param filesName
	 *            the path of files to send with the message
	 */
	public void sendMail(String mail, String subject, String txt, String[] filesName) throws SendFailedException
	{
		sendMailImpl("", mail, subject, txt, filesName); //$NON-NLS-1$
	}

	/**
	 * Send a mail to 'to' with subject and txt contents...
	 * 
	 * @param from
	 *            the mail sender
	 *@param mail
	 *            the e-mail address.
	 *@param text
	 *            the contents of mail.
	 *@param subject
	 *            the subject of mail.
	 *@param filesName
	 *            the path of files to send with the message
	 */
	public void sendMail(String from, String mail, String subject, String txt, String[] filesName) throws SendFailedException
	{
		sendMailImpl(from, mail, subject, txt, filesName);
	}

	/**
	 * Send a mail to 'to' with subject and txt contents... (Implementation of sendMail methods)
	 * 
	 * @param mail
	 *            the e-mail address.
	 *@param text
	 *            the contents of mail.
	 *@param subject
	 *            the subject of mail.
	 *@param filesName
	 *            the path of files to send with the message
	 */
	private void sendMailImpl(String from, String mail, String subject, String txt, String[] filesName) throws SendFailedException
	{
		if ((_smtpServer != null) && (mail != null))
		{
			try
			{
				// Define message
				Message m = new MimeMessage(_session);
				m.setSubject(MimeUtility.encodeText(subject));
				InternetAddress ia = new InternetAddress(mail);
				InternetAddress[] ad = new InternetAddress[]
				{ ia };
				m.setFrom("".equals(from) ? ia : new InternetAddress(from)); //$NON-NLS-1$
				m.setRecipients(Message.RecipientType.TO, ad);

				// Create part handler
				Multipart multipart = new MimeMultipart();

				// Message part
				BodyPart messageBodyPart = new MimeBodyPart();
				messageBodyPart.setText(txt);
				multipart.addBodyPart(messageBodyPart);

				if (filesName != null)
				{
					// Attachments part
					for (int i = 0; i < filesName.length; i++)
					{
						messageBodyPart = new MimeBodyPart();
						FileDataSource source = new FileDataSource(filesName[i]);
						messageBodyPart.setDataHandler(new DataHandler(source));
						messageBodyPart.setFileName((new java.io.File(filesName[i])).getName());
						multipart.addBodyPart(messageBodyPart);
					}
				}

				// Adds parts to message
				m.setContent(multipart);

				// Sends message
				Transport.send(m);
			} catch (Exception e)
			{
				throw new SendFailedException("Unable to send smtp message to " + mail + " (subject : " + subject + ") ", e); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
		}
	}

}
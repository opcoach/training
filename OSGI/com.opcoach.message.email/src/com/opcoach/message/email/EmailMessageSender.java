// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message.email;

import java.util.Map;

import com.opcoach.message.Message;
import com.opcoach.message.MessageException;
import com.opcoach.message.Recipient;
import com.opcoach.message.email.impl.SmtpMailer;
import com.opcoach.message.helpers.DefaultMessageSender;

/**
 * This class implements the mail notification
 * 
 * @author olivier
 * 
 */
public class EmailMessageSender extends DefaultMessageSender
{
	/** Recipient name : use it with : ${param:to} access. */
	public static final String RECIPIENT_NAME_PARAM = "to"; //$NON-NLS-1$

	public static EmailRecipientFactory factory = com.opcoach.message.email.impl.EmailRecipientFactoryImpl.getDefault();

	/**
	 * Property key for Smtp server initialized by external call... (see servlet init)
	 */
	public static final String SMTP_Server = "smtpServer"; //$NON-NLS-1$
	/**
	 * Property key for Smtp server login initialized by external call... (see servlet init)
	 */
	public static final String SMTP_Login = "smtpLogin"; //$NON-NLS-1$
	/**
	 * Property key for Smtp server password initialized by external call... (see servlet init)
	 */
	public static final String SMTP_Password = "smtpPassword"; //$NON-NLS-1$

	
	public EmailMessageSender()
	{
		super("com.opcoach.message.email", "e-mail");
	}
	
	
	public void send(Message message, Map<String, Object> params) throws Exception
	{
		// use the smtp Mailer.

		try
		{
			SmtpParameters smtp = new SmtpParameters((String) params.get(SMTP_Server), (String) params.get(SMTP_Login), (String) params.get(SMTP_Password));

			SmtpMailer mailer = new SmtpMailer(smtp);
			// On envoit le mail pour chaque recipient.
			for (Recipient recipient : message.getRecipients())
			{

				String email = (recipient instanceof EmailRecipient) ? ((EmailRecipient) recipient).getEmailAddress() : null;
				if (email != null)
				{

					String title = message.getTitle(params);
					String mess = message.getMessage(params);
					System.out.println("Envoi du mail  " + message.getTitle(params) + " à " + recipient + "\nContenu : " + mess); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					try
					{
						mailer.sendMail(email, title, mess);

					} catch (Exception exadr)
					{
						// L'adresse mail est erronée... on pourra jamais
						// l'envoyer...
						System.err.println("Impossible d'envoyer le mail pour cette notication : " + this);
						exadr.printStackTrace();
					}
				}

			}

		} catch (Exception ex)
		{
			throw new MessageException("Unable to send mail for notification " + this, ex); //$NON-NLS-1$
		}

	}

}

// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.message;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;

/** MessagePlatform provides the MessageSender. It retrieves them from OSGI service.
 * @author olivier
 *
 */
public class MessagePlatform implements ServiceListener
{

	/** this class is a singleton */
	private static MessagePlatform singleton = new MessagePlatform();
	/** Store the message sender registered -> updated by service listener */
	private Map<String, MessageSender> senders = new HashMap<String,MessageSender>();
	/*$ Refer to bundle context */
	private BundleContext bundleContext = null;
	
	// Hide the constructor for singleton management */
	private MessagePlatform()
	{
		
	}
	
	public static MessagePlatform getDefault() { return singleton; }
	
	/** Retrieve a message sender from its ID
	 * 
	 * @param id of the message sender to look for
	 * @return null if service not registered. The corresponding MessageSender instead
	 */
	public MessageSender getMessageSender(String id)
	{
		return senders.get(id);
	}
	
	
	/** init of platform using the bundle context */
	static void init(BundleContext context)
	{
		getDefault().internalInit(context);
	}


	private  void internalInit(BundleContext context)
	{
		bundleContext = context;

		context.addServiceListener(this); // , MessageSender.class.getName());
	}


	/* Update the MessageSender collection.
	 * @see org.osgi.framework.ServiceListener#serviceChanged(org.osgi.framework.ServiceEvent)
	 */
	public void serviceChanged(ServiceEvent event)
	{
		      ServiceReference sr = event.getServiceReference();
	      switch(event.getType()) {
	        case ServiceEvent.REGISTERED:
	          {
	             MessageSender ms = (MessageSender) bundleContext.getService(sr);
	             System.out.println("On a récupéré le service : " + ms.getName());
	             senders.put(ms.getID(), ms);
	          }
	          break;
	        case ServiceEvent.UNREGISTERING :
	        {
	        	MessageSender ms = (MessageSender) bundleContext.getService(sr);
	             System.out.println("On a perdu le service : " + ms.getName());
	             senders.remove(ms.getID());
	        	
	        }
	        break;
	        default:
	          break;
		
	}
	}
	
}

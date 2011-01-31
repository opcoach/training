package com.opcoach.training.rental.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class RentalUIActivator extends AbstractUIPlugin implements IPropertyChangeListener, RentalUIConstants
{

	// The plug-in ID
	public static final String PLUGIN_ID = "com.opcoach.training.rental.ui";

	// The shared instance
	private static RentalUIActivator plugin;

	/** The collection of possible color providers (read in extensions) */
	private Map<String, IColorProvider> additionalColorProviders = new HashMap<String, IColorProvider>();
	/** The choosen color provider among the addtional (may be null) */
	private IColorProvider chosenColorProvider;

	/**
	 * The constructor
	 */
	public RentalUIActivator()
	{
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception
	{
		super.start(context);
		plugin = this;
		readColorProviderExtensions();
		
		// Get the pref value for color preference
		String val = getPreferenceStore().getString(COLOR_PROVIDER);
		chosenColorProvider = (val == null) ? null : additionalColorProviders.get(val);

;		// Listen to preferences
		getPreferenceStore().addPropertyChangeListener(this);
	}

	public void readColorProviderExtensions()
	{
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint extp = reg.getExtensionPoint("com.opcoach.training.rental.ui.ColorProvider");
		IExtension[] extensions = extp.getExtensions();

		for (IExtension ext : extensions)
		{
			IConfigurationElement[] config = ext.getConfigurationElements();
			for (IConfigurationElement elt : config)
			{
				// Create the color provider for label.
				try
				{
					// Create the executable extension
					Object exeExt = elt.createExecutableExtension("colorProviderClass");
					// Add it (with its name) in the color provider map
					String name = elt.getAttribute("name");
					additionalColorProviders.put(name, (IColorProvider) exeExt);
				} catch (CoreException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	/* @return a never null collection of overriden color providers */

	public Map<String, IColorProvider> getAdditionalColorProviders()
	{
		return additionalColorProviders;
	}

	/** @return the selected chosen color provider (null if none selected) */
	public IColorProvider getColorProvider()
	{
		return chosenColorProvider;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception
	{
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static RentalUIActivator getDefault()
	{
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path
	 * 
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path)
	{
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}



	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.util.IPropertyChangeListener#propertyChange(org.eclipse.jface.util.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event)
	{
		// Get the possible chosen color provider.
		if (COLOR_PROVIDER.equals(event.getProperty()))
		{
			String newVal = (String) event.getNewValue();
			// null value means selected 'None'.
			chosenColorProvider = (newVal == null) ? null : additionalColorProviders.get(newVal);
		}

	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg)
	{
		reg.put(CUSTOMER_KEY, getImageDescriptor("icons/Customers.png"));
		reg.put(RENTAL_KEY, getImageDescriptor("icons/Rentals.png"));
		reg.put(RENTAL_OBJECT_KEY, getImageDescriptor("icons/RentalObjects.png"));
		reg.put(AGENCY_KEY, getImageDescriptor("icons/Agency.png"));
	}
	
	public Image getMyImage(String path)
	{
		// Utilise le Registry global de JfaceResources
		ImageRegistry reg = JFaceResources.getImageRegistry();
		// Essai de récuperer l'image peut être déjà présente
		Image img = reg.get(path);
		if (img == null)
		{
			// L'image n'est pas encore stockée dans le registry, on l'ajoute
			ImageDescriptor desc = ImageDescriptor.createFromFile(this.getClass(), path);
			// Le path sert de clé
			reg.put(path, desc);
			img = reg.get(path);
		}
		
		return img;
			
	}
	
	
}

// ------------------------------------------------
// OPCoach Training Projects
// © OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.opcoach.training.rental.gef;

import java.io.IOException;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.opcoach.training.rental.provider.RentalItemProviderAdapterFactory;


/**
 * @author olivier
 * 
 */
public class RentalGraphicalEditor extends GraphicalEditorWithFlyoutPalette 
{
	
	public static final String ID = "com.opcoach.training.rental.gef.rental.editor";
	
	private PropertySheetPage propertySheetPage;
	
	/** This is the one adapter factory used for providing views of the model.
	 *  and propertySources
	  */
	protected ComposedAdapterFactory adapterFactory;
        
    private RentalAgency currentAgency;


	/**
	 * This keeps track of the editing domain that is used to track all changes to the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterFactoryEditingDomain editingDomain;



	public RentalGraphicalEditor()
	{
		super();
		// GEF Edit Domain
		setEditDomain(new DefaultEditDomain(this));
		
		// other init will be done during the call to 'init(Site, EditorInput)
	}

	


	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{		
	    super.init(site, input);
       
        // initialize EMF editing model
        initializeEMFEditingDomain();
        
        EObject element = null;
        Resource resource = null;
        ResourceSet resourceSet = editingDomain.getResourceSet();
        if (input instanceof URIEditorInput)
        {
            element = resourceSet.getEObject(((URIEditorInput) input).getURI(), true);
            resource = resourceSet.getResource(((URIEditorInput) input).getURI(), true);
        }
        else
        {

            // il s'agit du cas ou on ouvre un .games qui est en fait un level,
            // (a voir si ca pourra etre utile dans le futur ou pas)
            // mais ca fonctionne pas correctement aujourd'hui
            // the file to edit: loading the model from the opened file
            final IFile file = ((IFileEditorInput) input).getFile();
            final URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
            // resource with respect to EMF model
            resource = resourceSet.getResource(uri, true);
            //resource = editingDomain.getResourceSet().getResource(uri, true);
            // getting the root element and cast as Level
            // MB, 03/06/09 : on verifie que cet element est bien un Level, car lors de la creation
            // d'un jeu .games depuis la navigateur, c'est un Game et on ne peut alors l'ouvrir
            element = resource.getContents().get(0);
        }
        
        if(resource != null)  
        {
            Adapter adapter = new AdapterFactoryEditingDomain.EditingDomainProvider(editingDomain);
            resource.eAdapters().add(adapter);
        }
        
        // Set title on editor
       setPartName(input.getName());
       
       // Set viewer contents
       if ((element != null) && element instanceof RentalAgency)
    	   currentAgency = (RentalAgency) element;	
	}
	
	
	/**
	 * Initialize the edit domain using factory provided
	 * @see org.eclipse.emf.edit.provider#ComposedAdapterFactory
	 */
	protected void initializeEMFEditingDomain() 
	{
			// Create an adapter factory that yields item providers.
			adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new RentalItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
			
			// EMF Editing Domain.
			editingDomain = new AdapterFactoryEditingDomain(adapterFactory, new BasicCommandStack());
	}




	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getPaletteRoot
	 * ()
	 */
	@Override
	protected PaletteRoot getPaletteRoot()
	{
		PaletteRoot palette = new PaletteRoot();

		PaletteGroup group1 = new PaletteGroup("Groupe 1");
		ToolEntry selTool = new PanningSelectionToolEntry();
		group1.add(selTool);

		PaletteGroup group2 = new PaletteGroup("Groupe 2");
		PaletteEntry custTool = new CreationToolEntry("Customer", "Création de l'objet", 
				                                      new RentalCreationFactory(Customer.class), null, null);
		group2.add(custTool);

		PaletteEntry rentalObjectTool = new CreationToolEntry("Rental Object", "Création de l'objet", 
				                                              new RentalCreationFactory(RentalObject.class), null, null);
		group2.add(rentalObjectTool);

		PaletteEntry rentalTool = new CreationToolEntry("Rental", "Création de l'objet", new RentalCreationFactory(Rental.class), null,
				null);
		group2.add(rentalTool);

		palette.setDefaultEntry(selTool);
		palette.add(group1);
		palette.add(group2);
		return palette;
	}

	/** A private method to create the default starting model */
	/*protected RentalAgency createAgencyModel()
	{
		return RentalAgencyGenerator.createSampleAgency();
	}*/
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#initializeGraphicalViewer()
	 */
	@Override
	protected void initializeGraphicalViewer()
	{
		// element associated to root edit part
		GraphicalViewer viewer = getGraphicalViewer();
        //viewer.setContents(createAgencyModel());
        viewer.setContents(currentAgency);
    }
	
	@Override
	protected void configureGraphicalViewer()
	{
		super.configureGraphicalViewer();

		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setRootEditPart(new ScalableFreeformRootEditPart());
		viewer.setEditPartFactory(new RentalEditPartFactory());
		/*
		 * viewer.setKeyHandler( new
		 * GraphicalViewerKeyHandler(viewer).setParent(getCommonKeyHandler()));
		 * ContextMenuProvider cmProvider = new
		 * ShapesEditorContextMenuProvider(viewer, getActionRegistry());
		 * viewer.setContextMenu(cmProvider); //
		 * getSite().registerContextMenu(cmProvider, viewer);
		 */

	}
	

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.
	 * IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor)
	{
		try
		{
			// Save only resources that have actually changed.
			// and use CData for text nodes
			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

			// Do the work within an operation because this is a long running
			// activity that modifies the workbench.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation()
				{
					@Override
					public void execute(IProgressMonitor monitor)
					{
						// Save the resources to the file system.
						boolean first = true;
						for (Resource resource : editingDomain.getResourceSet().getResources())
						{
							if ((first || !resource.getContents().isEmpty()) && !editingDomain.isReadOnly(resource))
							{
								try
								{
									resource.save(saveOptions);

								} catch (IOException e)
								{
									RentalGEFActivator.log(e);
								}
								first = false;
							}
						}
					}
				};
			operation.run(new NullProgressMonitor());

			getCommandStack().markSaveLocation();

		} catch (Exception e)
		{
			RentalGEFActivator.log(e);

		}

	}
	
	/**
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Class key)
	{
		if (key.equals(IContentOutlinePage.class))
		{
			return null; // showOutlineView() ? getContentOutlinePage() : null;
		}
		else if (key.equals(IPropertySheetPage.class))
		{
			return getPropertySheetPage();
		}
		else if (key.equals(EditingDomain.class)) 
		{
			return (EditingDomain) editingDomain;
		}
		else
		{
			return super.getAdapter(key);
		}
	}

	/**
	 * This accesses a cached version of the property sheet.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertySheetPage getPropertySheetPage()
	{
		if (propertySheetPage == null)
		{
			propertySheetPage =	new ExtendedPropertySheetPage(editingDomain);
			propertySheetPage.setPropertySourceProvider(new EditPartToProperySourceAdapterFactory());
		}
		return propertySheetPage;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#getActionRegistry()
	 */
	@Override
	protected ActionRegistry getActionRegistry()
	{
		return super.getActionRegistry();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose()
	{
		
		adapterFactory.dispose();

		if (propertySheetPage != null)
		{
			propertySheetPage.dispose();
		}


		super.dispose();
	}


	// private boolean isDirty = false;

	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#isDirty()
	 */
	@Override
/*	public boolean isDirty()
	{
		return isDirty;
	}
	*/

	public boolean isDirty()
	{
		return (editingDomain == null) ? false : ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
	}

/*	protected void setDirty(boolean dirty)
	{
		if (isDirty != dirty)
		{
			isDirty = dirty;
			firePropertyChange(PROP_DIRTY);
		}
	}*/


	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#commandStackChanged(java.util.EventObject)
	 */
	/*@Override
	public void commandStackChanged(EventObject event)
	{
		super.commandStackChanged(event);
		// Set the dirty state
		setDirty(getEditDomain().getCommandStack().isDirty());
	} */
	
	

	
}

package com.opcoach.training.rental.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import java.util.LinkedList;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import com.opcoach.training.rental.diagram.edit.parts.Address2EditPart;
import com.opcoach.training.rental.diagram.edit.parts.AddressEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerCustomerAddressCompartmentEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerCustomerLicensesCompartmentEditPart;
import com.opcoach.training.rental.diagram.edit.parts.CustomerEditPart;
import com.opcoach.training.rental.diagram.edit.parts.LicenseEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalAgencyEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalCustomerEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalObjectEditPart;
import com.opcoach.training.rental.diagram.edit.parts.RentalRentedObjectEditPart;
import com.opcoach.training.rental.diagram.part.Messages;
import com.opcoach.training.rental.diagram.part.RentalVisualIDRegistry;

/**
 * @generated
 */
public class RentalNavigatorContentProvider implements ICommonContentProvider
{

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public RentalNavigatorContentProvider()
	{
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap()
			{
				public Object get(Object key)
				{
					if (!containsKey(key))
					{
						put(key, Boolean.TRUE);
					}
					return super.get(key);
				}
			});
		myViewerRefreshRunnable = new Runnable()
			{
				public void run()
				{
					if (myViewer != null)
					{
						myViewer.refresh();
					}
				}
			};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate()
			{
				public void dispose()
				{
				}

				public boolean handleResourceChanged(final Resource resource)
				{
					unloadAllResources();
					asyncRefresh();
					return true;
				}

				public boolean handleResourceDeleted(Resource resource)
				{
					unloadAllResources();
					asyncRefresh();
					return true;
				}

				public boolean handleResourceMoved(Resource resource, final URI newURI)
				{
					unloadAllResources();
					asyncRefresh();
					return true;
				}
			});
	}

	/**
	 * @generated
	 */
	public void dispose()
	{
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources()
	{
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources())
		{
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh()
	{
		if (myViewer != null && !myViewer.getControl().isDisposed())
		{
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement)
	{
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento)
	{
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento)
	{
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig)
	{
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement)
	{
		if (parentElement instanceof IFile)
		{
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<RentalNavigatorItem> result = new ArrayList<RentalNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents())
			{
				if (o instanceof View)
				{
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof RentalNavigatorGroup)
		{
			RentalNavigatorGroup group = (RentalNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof RentalNavigatorItem)
		{
			RentalNavigatorItem navigatorItem = (RentalNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView()))
			{
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement)
	{
		switch (RentalVisualIDRegistry.getVisualID(view))
		{

		case RentalCustomerEditPart.VISUAL_ID:
		{
			LinkedList<RentalAbstractNavigatorItem> result = new LinkedList<RentalAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RentalNavigatorGroup target = new RentalNavigatorGroup(Messages.NavigatorGroupName_RentalCustomer_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RentalNavigatorGroup source = new RentalNavigatorGroup(Messages.NavigatorGroupName_RentalCustomer_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(CustomerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(RentalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty())
			{
				result.add(target);
			}
			if (!source.isEmpty())
			{
				result.add(source);
			}
			return result.toArray();
		}

		case RentalRentedObjectEditPart.VISUAL_ID:
		{
			LinkedList<RentalAbstractNavigatorItem> result = new LinkedList<RentalAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RentalNavigatorGroup target = new RentalNavigatorGroup(Messages.NavigatorGroupName_RentalRentedObject_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RentalNavigatorGroup source = new RentalNavigatorGroup(Messages.NavigatorGroupName_RentalRentedObject_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(RentalObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(RentalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty())
			{
				result.add(target);
			}
			if (!source.isEmpty())
			{
				result.add(source);
			}
			return result.toArray();
		}

		case CustomerEditPart.VISUAL_ID:
		{
			LinkedList<RentalAbstractNavigatorItem> result = new LinkedList<RentalAbstractNavigatorItem>();
			Node sv = (Node) view;
			RentalNavigatorGroup incominglinks = new RentalNavigatorGroup(Messages.NavigatorGroupName_Customer_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(CustomerCustomerAddressCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, RentalVisualIDRegistry.getType(Address2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(CustomerCustomerLicensesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, RentalVisualIDRegistry.getType(LicenseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(RentalCustomerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty())
			{
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RentalEditPart.VISUAL_ID:
		{
			LinkedList<RentalAbstractNavigatorItem> result = new LinkedList<RentalAbstractNavigatorItem>();
			Node sv = (Node) view;
			RentalNavigatorGroup outgoinglinks = new RentalNavigatorGroup(Messages.NavigatorGroupName_Rental_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(RentalCustomerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(RentalRentedObjectEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty())
			{
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RentalObjectEditPart.VISUAL_ID:
		{
			LinkedList<RentalAbstractNavigatorItem> result = new LinkedList<RentalAbstractNavigatorItem>();
			Node sv = (Node) view;
			RentalNavigatorGroup incominglinks = new RentalNavigatorGroup(
					Messages.NavigatorGroupName_RentalObject_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(RentalRentedObjectEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty())
			{
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RentalAgencyEditPart.VISUAL_ID:
		{
			LinkedList<RentalAbstractNavigatorItem> result = new LinkedList<RentalAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			RentalNavigatorGroup links = new RentalNavigatorGroup(Messages.NavigatorGroupName_RentalAgency_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), RentalVisualIDRegistry.getType(AddressEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(RentalObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(CustomerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), RentalVisualIDRegistry.getType(RentalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(RentalCustomerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RentalVisualIDRegistry.getType(RentalRentedObjectEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty())
			{
				result.add(links);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type)
	{
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges)
		{
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource))
			{
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type)
	{
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges)
		{
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget))
			{
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type)
	{
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes)
		{
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type)
	{
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes)
		{
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type)
	{
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes)
		{
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type)
	{
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams)
		{
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type)
	{
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views)
		{
			if (type.equals(nextView.getType()) && isOwnView(nextView))
			{
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view)
	{
		return RentalAgencyEditPart.MODEL_ID.equals(RentalVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<RentalNavigatorItem> createNavigatorItems(Collection<View> views, Object parent, boolean isLeafs)
	{
		ArrayList<RentalNavigatorItem> result = new ArrayList<RentalNavigatorItem>(views.size());
		for (View nextView : views)
		{
			result.add(new RentalNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element)
	{
		if (element instanceof RentalAbstractNavigatorItem)
		{
			RentalAbstractNavigatorItem abstractNavigatorItem = (RentalAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element)
	{
		return element instanceof IFile || getChildren(element).length > 0;
	}

}

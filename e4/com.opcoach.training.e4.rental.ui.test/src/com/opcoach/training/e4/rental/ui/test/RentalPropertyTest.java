package com.opcoach.training.e4.rental.ui.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.tools.context.spy.ContextSpyPart;
import org.eclipse.e4.ui.internal.workbench.ModelServiceImpl;
import org.eclipse.e4.ui.internal.workbench.SelectionServiceImpl;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.opcoach.training.e4.rental.ui.RentalAddon;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;
import com.opcoach.training.e4.rental.ui.parts.RentalPropertyPart;
import com.opcoach.training.e4.rental.ui.test.e4Stubs.DisplayRealm;
import com.opcoach.training.e4.rental.ui.test.e4Stubs.EclipseAdapter;
import com.opcoach.training.e4.rental.ui.test.e4Stubs.MyLogger;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.helpers.RentalAgencyGenerator;

public class RentalPropertyTest implements RentalUIConstants {

	static IEclipseContext ctx;

	@SuppressWarnings("restriction")
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		// ICI IL FAUDRAIT RECUPERER LE CONTEXtE DE EQUINOX DS
		// ET SE METTRE EN CONTEXTE FILS POUR LE REMPLIR ...
		Bundle e4Bundle = Platform.getBundle("org.eclipse.e4.ui.workbench");

		BundleContext e4BundleContext = e4Bundle.getBundleContext();
		IEclipseContext osgiCtx = EclipseContextFactory.getServiceContext(e4BundleContext);
		osgiCtx.set("myKeyInOsgi1", "value");

		ctx = EclipseContextFactory.create("TestContext");
		ctx.setParent(osgiCtx);
		ctx.set(RentalAgency.class, RentalAgencyGenerator.createSampleAgency());
		ctx.set(Composite.class, new Shell());
		ctx.set(IEclipseContext.class, ctx);
		ctx.set(Adapter.class, new EclipseAdapter());
		
		osgiCtx.set(ESelectionService.class, ContextInjectionFactory.make(SelectionServiceImpl.class, ctx));
		ModelServiceImpl ms = new ModelServiceImpl(ctx);
		ContextInjectionFactory.inject(ms, ctx);
		ctx.set(EModelService.class, ms);
		ctx.set(Logger.class, ContextInjectionFactory.make(MyLogger.class, ctx));
		
		initDataBindingRealm();
		
		MApplication appli = ms.createModelElement(MApplication.class);
		appli.setContext(ctx);
		ctx.set(MApplication.class, appli);
		
		 openContextSpy();

		Shell s = new Shell(Display.getCurrent());
		s.setText("Test window");
		ctx.set(Composite.class, s);
		
		// Create addon to load rental stuff
		ContextInjectionFactory.make(RentalAddon.class, ctx);

		
		
		// Create a part
		RentalPropertyPartForTest part = ContextInjectionFactory.make(RentalPropertyPartForTest.class, ctx);
		ctx.set(RentalPropertyPart.class, part);
		
		
	}
	
	
	/** Databinding needs a realm... which can not be overriden due to private construcdtor...
	 *  We create here on local realm which is a copy of the jface.DisplayRealm
	 *  This is needed only if databinding is used in your application.
	 */
	private static void initDataBindingRealm() {
		
		Realm realm = DisplayRealm.getRealm(Display.getDefault());
		DisplayRealm.initDefault(realm);
		ctx.set(Realm.class, realm);
		
	}

	private static void openContextSpy()
	{
		System.out.println("Opening SpyContext");
		Display d = Display.getCurrent();
		Shell s = new Shell(d);
		s.setLayout(new GridLayout(1,true));
		s.setText("Context Spy");
		IEclipseContext spyCtx = EclipseContextFactory.create("SpyContext");
		spyCtx.setParent(ctx);
		spyCtx.set(Composite.class, s);
		ContextSpyPart cs = ContextInjectionFactory.make(ContextSpyPart.class, spyCtx);
		s.pack();
		s.open();
		
		while (!s.isDisposed()) {
			if (!d.readAndDispatch())
				d.sleep();
		}
		
		System.out.println("End Opening SpyContext");

		
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("Testing ... ");
	}

	@Test
	public void testCreateContent() throws InterruptedException {
		assertNotNull("The rentalPropertyPart must be created", ctx.get(RentalPropertyPart.class));
	}

	@Test
	public void testSetSelection() throws InterruptedException {
		Rental r = ctx.get(RentalAgency.class).getRentals().get(1);
		
		ctx.set(IServiceConstants.ACTIVE_SELECTION, r);
		wait1second();

		// Check widget in UI
		RentalPropertyPartForTest p = (RentalPropertyPartForTest) ctx.get(RentalPropertyPart.class);
		
		
		
		assertEquals("Customer Name is correct", r.getCustomer().getDisplayName(), p.getCustomerNameDisplayed());
	}


	private void wait1second()  {
		try {
			Thread.sleep(100L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

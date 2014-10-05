package com.opcoach.training.rental.rcp;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.util.Util;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.jface.action.IAction;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {


    // Actions - important to allocate these only in makeActions, and then use them
    // in the fill methods.  This ensures that the actions aren't recreated
    // when fillActionBars is called with FILL_PROXY.
    private IWorkbenchAction exitAction;
    //private IWorkbenchAction aboutAction;
    //private IWorkbenchAction newWindowAction;
    private IWorkbenchAction prefAction;  
    private IAction helpContentsAction;
    

    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(final IWorkbenchWindow window) {
        // Creates the actions and registers them.
        // Registering is needed to ensure that key bindings work.
        // The corresponding commands keybindings are defined in the plugin.xml file.
        // Registering also provides automatic disposal of the actions when
        // the window is closed.

        exitAction = ActionFactory.QUIT.create(window);
        register(exitAction);
        
       // aboutAction = ActionFactory.ABOUT.create(window);
       // register(aboutAction);
        
        //newWindowAction = ActionFactory.OPEN_NEW_WINDOW.create(window);
        //register(newWindowAction);
        
        prefAction = ActionFactory.PREFERENCES.create(window);
        register(prefAction);
        
   
    	{
    		helpContentsAction = ActionFactory.HELP_CONTENTS.create(window);
    		register(helpContentsAction);
    	}
    }
    
    protected void fillMenuBar(IMenuManager menuBar) {
        MenuManager fileMenu = new MenuManager("&File",  IWorkbenchActionConstants.M_FILE);
        MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
        
        menuBar.add(fileMenu);
        // Add a group marker indicating where action set menus will appear.
        menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
        menuBar.add(helpMenu);
        helpMenu.add(helpContentsAction);
        
        // File Menu
        /* fileMenu.add(prefAction);
        fileMenu.add(new Separator());
        fileMenu.add(exitAction); */
        
        // Ajout sous la forme de ActionContributionItem pour pouvoir rendre les actions ensuite
        // invisibles, car elle sont d�j� pr�sentes dans le menu Pomme du mac. 
        ActionContributionItem preferencesActionItem = new ActionContributionItem(prefAction);
        fileMenu.add(preferencesActionItem);
    	ActionContributionItem exitActionItem = new ActionContributionItem(exitAction);
		fileMenu.add(exitActionItem);
          
  /*      if (Util.isMac()) {
        	preferencesActionItem.setVisible(false);
        	exitActionItem.setVisible(false);
        } */
        
    }
    
    protected void fillCoolBar(ICoolBarManager coolBar) {
        IToolBarManager toolbar = new ToolBarManager(SWT.FLAT | SWT.RIGHT);
        coolBar.add(new ToolBarContributionItem(toolbar, "main"));   
        toolbar.add(exitAction);
    }
    
  
    
}

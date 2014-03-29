 
package com.opcoach.training.e4.rental.eap.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class TestHandler {
	@Execute
	public void execute(Shell s) {
		MessageDialog.openInformation(s, "In Test Handler", "In Test Handler :");

}
		
}
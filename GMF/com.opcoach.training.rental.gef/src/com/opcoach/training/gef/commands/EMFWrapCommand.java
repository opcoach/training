package com.opcoach.training.gef.commands;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

public class EMFWrapCommand extends Command
{
	private org.eclipse.emf.common.command.Command emfCommand = null;
	private EditingDomain domain = null;

	
	/*protected EditingDomain getEditingDomain()
	{
		EditingDomain result = null;
		IEditorPart currentEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		domain = (EditingDomain) currentEditor.getAdapter(EditingDomain.class);
		return result;

	}*/


	/**
	 * @param emfCommand
	 *            the emfCommand to set
	 */
	public void setEmfCommand(EditingDomain domain, org.eclipse.emf.common.command.Command emfCommand)
	{
		this.emfCommand = emfCommand;
		this.domain = domain;
		setLabel(emfCommand.getLabel());
	}

	@Override
	public void execute()
	{
		redo();
	}

	@Override
	public void redo()
	{
		domain.getCommandStack().execute(emfCommand);
	}

	@Override
	public void undo()
	{
		domain.getCommandStack().undo();
	}

}

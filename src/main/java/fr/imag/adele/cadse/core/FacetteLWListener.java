package fr.imag.adele.cadse.core;

import java.util.List;

import fr.imag.adele.cadse.core.transaction.delta.ImmutableWorkspaceDelta;

public interface FacetteLWListener {

	public void addListener(WorkspaceListener l, int eventFilter);

	public void addListener(WorkspaceListener l, EventFilter eventFilter);

	public void removeListener(WorkspaceListener l);

	public List<WorkspaceListener> filter(int filters, ImmutableWorkspaceDelta workspaceDelta);
}

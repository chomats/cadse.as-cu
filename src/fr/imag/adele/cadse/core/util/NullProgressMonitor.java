package fr.imag.adele.cadse.core.util;

import fr.imag.adele.cadse.core.delta.revision.IProgressMonitor;

public class NullProgressMonitor implements IProgressMonitor {
	boolean	_canceled	= false;

	public void beginTask(String name, int totalWork) {
	}

	public void done() {
	}

	public boolean isCanceled() {
		return _canceled;
	}

	public void setCanceled(boolean value) {
		_canceled = value;
	}

	public void setTaskName(String name) {
	}

	public void subTask(String name) {
	}

	public void worked(int work) {
	}

}

package fr.imag.adele.cadse.core.ui;


public abstract class AbstractActionContributor implements IActionContributor {
	protected IActionContributor[] _overwirte;
	public static final IActionContributor[] EMPTY = new IActionContributor[0];

	@Override
	public IActionContributor[] getOverwriteActionContributor() {
		if (_overwirte == null)
			return EMPTY;
		return _overwirte;
	}
	
	public void setOverwriteActionContributor(IActionContributor ...actionContributors) {
		if (actionContributors.length == 0) {
			_overwirte = EMPTY;
			return;
		}
		_overwirte = actionContributors;
	}

}

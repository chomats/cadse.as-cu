package fr.imag.adele.cadse.core.transaction.delta;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.util.ArraysUtil;

public abstract class MappingOperation extends WLWCOperationImpl {
	MappingOperation[]	beforeOperation	= null;

	public MappingOperation(ItemDelta parent) throws CadseException {
		super(OperationTypeCst.MAPPING_OPERATION, parent);
		parent.addMappingOperaion(this);
	}

	/**
	 * Ajoute les operation qui doivent etre commiter avent celle-ci
	 * 
	 * @param mappingOperation
	 */
	public void addBeforeMappingOperation(MappingOperation mappingOperation) {
		this.beforeOperation = ArraysUtil.add(MappingOperation.class, this.beforeOperation, mappingOperation);
	}

	public MappingOperation[] getBeforeOperation() {
		return beforeOperation;
	}

	public abstract void commit(LogicalWorkspace wl, Item goodItem);

	public void toStringShort(StringBuilder sb) {
		sb.append("mapping-operation ").append(getLabel());
	}

	@Override
	public ItemDelta getParentOperDelta() {
		return (ItemDelta) super.getParentOperDelta();
	}

	abstract protected String getLabel();
}

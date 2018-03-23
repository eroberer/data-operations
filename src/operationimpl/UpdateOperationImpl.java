package operationimpl;

import model.ParameterDTO;
import operations.Operation;

public class UpdateOperationImpl extends PersistenceImpl implements Operation {
	private boolean controlFlag = false;
	private ParameterDTO dto;

	public UpdateOperationImpl(ParameterDTO dto) {
		this.dto = dto;
	}

	@Override
	public void doControl() {
		ParameterDTO obj = findById(dto.getId());
		if (obj != null) {
			controlFlag = true;
		}
	}

	@Override
	public void makeOperation() {
		doControl();
		if (controlFlag) {
			update(dto);
		}
	}
}

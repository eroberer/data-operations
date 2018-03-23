package operations;

import model.ParameterDTO;
import model.State;
import operationimpl.DeleteOperationImpl;
import operationimpl.InsertOperationImpl;
import operationimpl.UpdateOperationImpl;

public class OperationFactory {

	public static Operation getInstance(ParameterDTO dto) {

		if (dto.getState() == State.DELETE) {
			return new DeleteOperationImpl(dto);
		} else if (dto.getState() == State.INSERT) {
			return new InsertOperationImpl(dto);
		} else if (dto.getState() == State.UPDATE) {
			return new UpdateOperationImpl(dto);
		}
		return null;
	}

}

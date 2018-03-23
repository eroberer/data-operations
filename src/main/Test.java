package main;

import model.ParameterDTO;
import model.State;
import operations.Operation;
import operations.OperationFactory;

public class Test {
	public static void main(String[] args) throws Exception {
		ParameterDTO dto = new ParameterDTO();

		dto.setState(State.INSERT);
		dto.setParameterKey("Key");
		dto.setParameterValue("Value");
		dto.setId(1L);
		Operation insert = OperationFactory.getInstance(dto);
		insert.makeOperation();

		dto.setState(State.UPDATE);
		dto.setParameterValue("Value2");
		Operation update = OperationFactory.getInstance(dto);
		update.makeOperation();

		dto.setState(State.DELETE);
		Operation delete = OperationFactory.getInstance(dto);
		delete.makeOperation();

	}
}

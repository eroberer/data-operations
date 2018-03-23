package operationimpl;

import java.util.HashMap;
import java.util.Map;

import model.ParameterDTO;
import util.Logger;

public class PersistenceImpl {

	static Map<Long, ParameterDTO> parameters = new HashMap<Long, ParameterDTO>();

	public void insert(ParameterDTO obj) {
		parameters.put(obj.getId(), obj);
		Logger.log(obj);
	}

	public void update(ParameterDTO obj) {
		parameters.put(obj.getId(), obj);
		Logger.log(obj);
	}

	public void delete(ParameterDTO obj) {
		parameters.remove(obj.getId());
		Logger.log(obj);
	}

	public ParameterDTO findById(long id) {
		return parameters.get(id);
	}

}

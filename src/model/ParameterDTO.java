package model;

public class ParameterDTO {

	private State state;
	private long id;
	private String parameterKey;
	private String parameterValue;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getParameterKey() {
		return parameterKey;
	}

	public void setParameterKey(String parameterKey) {
		this.parameterKey = parameterKey;
	}

	public String getParameterValue() {
		return parameterValue;
	}

	public void setParameterValue(String parameterValue) {
		this.parameterValue = parameterValue;
	}

	@Override
	public String toString() {
		return "ParameterDTO [state=" + state + ", id=" + id + ", parameterKey=" + parameterKey + ", parameterValue="
				+ parameterValue + "]";
	}

}

package DTO;

import java.util.List;

public class Output extends Response {
	
	private List<String> headers;
	
	private List<Rows> array;
	
	public Output(String returnCode, String returnMessage) {
		super(returnCode, returnMessage);
	}

	public List<String> getHeaders() {
		return headers;
	}

	public void setHeaders(List<String> headers) {
		this.headers = headers;
	}
	
	public List<Rows> getArray() {
		return array;
	}

	public void setArray(List<Rows> array) {
		this.array = array;
	}
	
}

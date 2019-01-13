package DTO;

import java.util.List;

public class Output extends Response {
	
	private List<String> headers;
	
	public Output(String returnCode, String returnMessage) {
		super(returnCode, returnMessage);
	}

	

	public List<String> getHeaders() {
		return headers;
	}

	public void setHeaders(List<String> headers) {
		this.headers = headers;
	}
}

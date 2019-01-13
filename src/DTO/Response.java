package DTO;

public class Response 
{
	
	public Response(String returnCode, String returnMessage) {
		this.returnCode = returnCode;
		this.returnMessage = returnMessage;
	}

	private String returnCode;
	private String returnMessage;
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	
	@Override
	public String toString() {
		return "Response [returnCode=" + returnCode + ", returnMessage=" + returnMessage + "]";
	}

}

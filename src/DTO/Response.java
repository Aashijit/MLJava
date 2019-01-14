package DTO;

public class Response 
{
	
	public Response(String returnCode, String returnMessage) {
		this.returnCode = returnCode;
		this.returnMessage = returnMessage;
	}
	

	public Response(String returnCode, String returnMessage, String detailedMessage) {
		this.returnCode = returnCode;
		this.returnMessage = returnMessage;
		this.detailedMessage = detailedMessage;
	}


	private String returnCode;
	private String returnMessage;
	private String detailedMessage;
	
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
	public String getDetailedMessage() {
		return detailedMessage;
	}
	public void setDetailedMessage(String detailedMessage) {
		this.detailedMessage = detailedMessage;
	}
	@Override
	public String toString() {
		return "Response [returnCode=" + returnCode + ", returnMessage=" + returnMessage + ", detailedMessage="
				+ detailedMessage + "]";
	}
}

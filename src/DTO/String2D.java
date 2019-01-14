package DTO;

import java.util.List;

public class String2D 
{
	private List<String> strings;

	public List<String> getStrings() {
		return strings;
	}

	public void setStrings(List<String> strings) {
		this.strings = strings;
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public String2D convertStringArrayToString2D(String[] array)
	{
		for(String string : array)
		{
			this.getStrings().add(string);
		}	
		return this;
	}
}

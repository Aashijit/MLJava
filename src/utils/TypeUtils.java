package utils;

public class TypeUtils implements Codes{
	
	
	/**
	 * 
	 * @param string
	 * @return
	 */
	public static String getTypeFromString(String string)
	{
		if(isNumeric(string))
			return TYPE_NUMBER;
		return TYPE_STRING;
	}
	
	
	/**
	 * @param string
	 * @return If the string is numeric
	 */
	public static boolean isNumeric(String string)
	{
		if(string == null)
			return false;
		return string.matches("-?\\d+(\\.\\d+)?");

	}
}

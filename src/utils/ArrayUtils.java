package utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils implements Codes {

	/**
	 * @param array
	 * @param column
	 * @return List<Object>
	 */
	public static List<Object> getColumnFromStringArray(String[][] array, int column) {
		// Step 1 : Create the list of objects
		List<Object> objects = new ArrayList<>();

		// Step 2 : Determine the type of the variable here and return the list of the
		// particular type

		switch (TypeUtils.getTypeFromString(array[INDEX_ZERO][column])) {

		case TYPE_NUMBER:
			// Type cast the string into type Number
			for(String[] string : array)
			{
				//Create an Double object Here and add it to the Objects List
				objects.add(new Double(string[column])); 
			}
			break;

		case TYPE_STRING:
			for(String[] string : array)
				objects.add(new String(string[column]));
			break;
		}

		return objects;
	}
	
	
	
	/**
	 * @param array
	 * @param column
	 * @return List<Object>
	 */
	public static List<Object> getRowFromStringArray(String[][] array, int row) {
		// Step 1 : Create the list of objects
		List<Object> objects = new ArrayList<>();

		// Step 2 : Determine the type of the variable here and return the list of the
		// particular type

		switch (TypeUtils.getTypeFromString(array[row][INDEX_ZERO])) {

		case TYPE_NUMBER:
			// Type cast the string into type Number
			for(String string : array[row])
			{
				//Create an Double object Here and add it to the Objects List
				objects.add(new Double(string)); 
			}
			break;

		case TYPE_STRING:
			for(String string : array[row])
				objects.add(new String(string));
			break;
		}

		return objects;
	}
}
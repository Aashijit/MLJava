/**
 * 
 */
package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import DTO.String2D;

/**
 * @author Aashijit
 *
 */
public class FileUtils implements Codes {

	/**
	 * 
	 * @param bufferedReader
	 * @return
	 * @throws IOException
	 */
	public static List<String2D> getStringArrayFromBufferedReader(BufferedReader bufferedReader) throws IOException {
		List<String2D> string2Ds = new ArrayList<>();
		String string = bufferedReader.readLine();
		while (string != null) {
			string2Ds.add(new String2D().convertStringArrayToString2D(string.split(DEFAULT_DELIMETER)));
		}
		return string2Ds;
	}
}

package utils;

import java.io.File;

import DTO.Response;

/**
 * 
 * @author Aashijit
 * @version 1.0
 * 
 */
public class DataValidation implements Codes {

	/**
	 * Check if the file is Valid
	 * 
	 * @param file
	 * @return true only if File is found, otherwise false
	 */
	public static Response isValidFile(File file, String filePath) {
		
		File file2 = file == null ? new File(filePath) : file;
		
		if(!file2.exists())
			return new Response(RC_FILE_DOES_NOT_EXISTS, RETURN_MSG_FILE_DOES_NOT_EXISTS);
		if(!file2.canRead())
			return new Response(RC_FILE_NOT_READABLE, RETURN_MSG_FILE_NOT_READABLE);
		if(!file2.canWrite())
			return new Response(RC_FILE_NOT_WRITABLE, RETURN_MSG_FILE_NOT_WRITABLE);
		
		return new Response(RC_SUCCES, RETURN_MSG_SUCCESS);
	}
}

package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.sound.sampled.Line;

import DTO.Response;
import utils.Codes;
import utils.DataValidation;

/**
 * 
 * @author Aashijit
 * @version 1.0
 * 
 *          This class will be used to read CSV values and pass on an object
 *          with List of different values read from the CSV file.
 *
 */
public class ReadCSV implements Codes {

	private File file;
	private String filePath;

	private BufferedReader bufferedReader;

	public ReadCSV() {

	}

	public ReadCSV(File file) {
		this.file = file;
	}

	public ReadCSV(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * 
	 * @return {@link Response}
	 * @throws FileNotFoundException
	 */
	private Response initCSV()
	{
		//Step 1: Data Validation of the File/ File Path input
		Response response = DataValidation.isValidFile(file, filePath);
		if(!response.getReturnCode().equals(RC_SUCCES))
			return new Response(response.getReturnCode(), response.getReturnMessage());
		
		//Step 2: Initialize the BufferedReader Object with File found
		File fileNew = file == null ? new File(filePath) : file; 
		try {
			bufferedReader = new BufferedReader(new FileReader(fileNew));
		} catch (FileNotFoundException e) {
			return new Response(RC_FILE_DOES_NOT_EXISTS, RETURN_MSG_FILE_DOES_NOT_EXISTS);		
		}
		
		//Step 3: Extract the header from the File using the ArrayUtils method in utils package
			
		
		
		return new Response(RC_SUCCES, RETURN_MSG_SUCCESS);
	}
}

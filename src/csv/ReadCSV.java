package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import DTO.Output;
import DTO.Response;
import DTO.String2D;
import utils.Codes;
import utils.DataValidation;
import utils.FileUtils;

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
	
	private List<String2D> stringData;
	
	private Output output;

	public ReadCSV() {

	}

	/**
	 * 1. Send the file as arguments to the Constructor 
	 * @param file
	 */
	public ReadCSV(File file) {
		this.file = file;
	}

	/**
	 * 1. Send the file path as arguments to the Constructor
	 * @param filePath
	 */
	public ReadCSV(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * 1. Validates the file/ file path
	 * 2. Creates the BufferedReader Object
	 * 3. Extracts the String data from the File using the {@link FileUtils} class 
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
		
		//Step 3: Extract the String 2D List from the File
		try {
			stringData = FileUtils.getStringArrayFromBufferedReader(bufferedReader);
		} catch (IOException e) {
			return new Response(RC_IO_ERROR, RETURN_MSG_IO_ERROR,e.getMessage());
		}
		return new Response(RC_SUCCES, RETURN_MSG_SUCCESS);
	}
	
	
	/**
	 * @return {@link Output}
	 */
	private Output read()
	{
		//Step 1 : Call the initCSV method and pass on the output if the response received is not 
		// RC_SUCCESS
		Response response = initCSV(); 
		if(!response.getReturnCode().equals(RC_SUCCES))
			return new Output(response.getReturnCode(), response.getReturnMessage());
		
		//Step 2 :  Extract the Header in the Headers List of the Output Object
		
		
		
		return null;
	}

	public Output getOutput() {
		return output;
	}

	public void setOutput(Output output) {
		this.output = output;
	}
}

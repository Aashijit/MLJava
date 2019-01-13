package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class test 
{
	private static Logger logger = Logger.getLogger("Test");
	public static void main(String[] args)
	{
		List<Object> objects = new ArrayList<>();
		
		Object object = new String("12.3");
		
		logger.info(object.getClass().getTypeName());
		
		object = new Double("1234");
		
		logger.info(object.getClass().getTypeName());
		
	}
}
package tester;


import java.util.List;

import utils.ArrayUtils;

public class test 
{
	public static void main(String[] args)
	{
		String a[][] = {{ "ABC","1","3.4","GEF"},
				{ "ABD","2","5.4","GEF"},
				{ "ABE","3","63.4","GEM"},
				{ "ABF","4","73.4","GEF"},
				{ "ABG","5","34.4","GEF"},
				{ "ABF","6","34.4","GEF"}
		};
		
		
		List<Object> objects = ArrayUtils.getColumnFromStringArray(a, 1);
		
		for(Object object : objects)
		{
			System.out.println(object+"\t"+object.getClass());
		}
		
	}
}
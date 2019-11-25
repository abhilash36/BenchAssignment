package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pgm31PgmToCreateSysnchronizedList 
{
	public static void main(String[] args) 
	{
		   List<String> li = new ArrayList<String>();
	        List<String> sysLi = Collections.synchronizedList(li);
	        System.out.println("Synchronized list got created...");	
	}

}

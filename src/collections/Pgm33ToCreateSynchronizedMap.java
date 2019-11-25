package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Pgm33ToCreateSynchronizedMap 
{
	public static void main(String[] args) 
	{
		Map<String,String> hm=new HashMap();
		Map<String,String> b=Collections.synchronizedMap(hm);
		System.out.println("Synchronized map is created");
	}
}

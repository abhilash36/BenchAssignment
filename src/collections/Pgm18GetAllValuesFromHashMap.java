package collections;

import java.util.HashMap;

public class Pgm18GetAllValuesFromHashMap
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hm1=new HashMap<>();
		hm1.put(1,10);
		hm1.put(2,20);
		hm1.put(3,30);
		hm1.put(4,40);
		
		System.out.println("Result of getting all the values are: "+hm1.entrySet());
	}
}

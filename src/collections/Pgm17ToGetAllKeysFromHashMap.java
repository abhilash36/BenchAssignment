package collections;

import java.util.HashMap;

public class Pgm17ToGetAllKeysFromHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hm1=new HashMap<>();
		hm1.put(1,10);
		hm1.put(2,20);
		hm1.put(3,30);
		hm1.put(4,40);
		
		System.out.println("Result after getting all the keys are: "+hm1.keySet());

	}

}

package collections;

import java.util.HashMap;

public class Pgm14CopyMapContentToAnotherHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hm1=new HashMap<>();
		hm1.put(1,10);
		hm1.put(2,20);
		
		HashMap<Integer,Integer> hm2=new HashMap<>();
		hm2.put(3,30);
		hm2.put(4,40);
		
		hm1.putAll(hm2);
		
		System.out.println("After adding the objects of hm2 to hm1,result is: "+hm1);
	}
}

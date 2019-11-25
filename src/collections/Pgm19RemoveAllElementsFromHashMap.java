package collections;

import java.util.HashMap;

public class Pgm19RemoveAllElementsFromHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hm1=new HashMap<>();
		hm1.put(1,10);
		hm1.put(2,20);
		hm1.put(3,30);
		hm1.put(4,40);
		
		//we can use clear method to remove all the objects in the hashmap
		hm1.clear();
		
		System.out.println("Size of the collection hm1 after removing all the objects is: "+hm1.size());
	}
}

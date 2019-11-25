package collections;

import java.util.TreeMap;

public class Pgm26GettingAllKeysFromTreeMap 
{
	public static void main(String[] args)
	{
		TreeMap<Integer,Integer> tm1=new TreeMap<>();
		tm1.put(1,10);
		tm1.put(2,20);
		tm1.put(3,30);
		
		System.out.println("All key values of the collection tm1 is: "+tm1.keySet());
	}
}

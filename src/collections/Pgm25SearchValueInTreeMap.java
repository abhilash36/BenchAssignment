package collections;

import java.util.TreeMap;

public class Pgm25SearchValueInTreeMap
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,Integer> tm1=new TreeMap<>();
		tm1.put(1,10);
		tm1.put(2,20);
		tm1.put(3,30);
		
		System.out.println("Is key 3 is present in the collection tm1? "+tm1.containsValue(30));
	}
}

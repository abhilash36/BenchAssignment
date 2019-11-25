package collections;

import java.util.TreeMap;

public class Pgm23CopyMapContentToOtherTreeMap 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,Integer> tm1=new TreeMap<>();
		tm1.put(1,10);
		tm1.put(2,20);
		tm1.put(3,30);
		
		
		TreeMap<Integer,Integer> tm2=new TreeMap<>();
		tm2.put(4,40);
		tm2.put(5,50);
		
		tm2.putAll(tm1);

		System.out.println("After copying all the content of tm1 to tm2,tm2 objects are: "+tm2);
	}

}

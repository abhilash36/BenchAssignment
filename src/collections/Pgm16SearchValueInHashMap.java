package collections;

import java.util.HashMap;

public class Pgm16SearchValueInHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hm1=new HashMap<>();
		hm1.put(1,10);
		hm1.put(2,20);
		
		System.out.println("Is Value 20 is present in collection map hm1? "+hm1.containsValue(20));
	}
}

package collections;

import java.util.ArrayList;

public class Pgm3CopyArrayListToArray 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ls1=new ArrayList<>();
		ls1.add(10);
		ls1.add(20);
		
		Object[] res = ls1.toArray();
		
		System.out.println("Values of an array are: ");
		
		for(Object r:res)
		{
			System.out.println(r);
		}
	}
}

package collections;

import java.util.LinkedList;
import java.util.List;

public class Pgm7GetSublistFromTheLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		
		List<Integer> res = ls.subList(2,5);
		
		System.out.println("fetched Sublist from the given linkedlist is: ");
		for(Integer r:res)
		{
		  System.out.println(r);
		}
	}
}

package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Pgm11IterationThroughLinkedListInReverseOrder 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		Iterator<Integer> i = ls.descendingIterator();
		System.out.println("After iterating linked list in reverse order,result is: ");
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}

package collections;

import java.util.LinkedList;

public class Pgm10ToReadLastElementFromLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		System.out.println("First element in the mentioned linked list is: "+ls.getLast());
		System.out.println("First element in the mentioned linked list is: "+ls.peekLast());
	}
}

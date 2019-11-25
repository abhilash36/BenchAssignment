package collections;

import java.util.LinkedList;

public class Pgm9ToReadFirstElementFromLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		System.out.println("First eelement in the mentioned linked list is: "+ls.getFirst());
		System.out.println("First eelement in the mentioned linked list is: "+ls.peekFirst());
		System.out.println("First eelement in the mentioned linked list is: "+ls.peek());
		System.out.println("First eelement in the mentioned linked list is: "+ls.element());
	}
}

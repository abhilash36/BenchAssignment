package collections;

import java.util.Collections;
import java.util.LinkedList;

public class Pgm8HowToReverseTheLinkedListContent 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		
		Collections.reverse(ls);
		
		System.out.println("Reverse of the list is: "+ls);
		
		
	}

}

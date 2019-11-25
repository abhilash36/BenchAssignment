package collections;
import java.util.LinkedList;

public class Pgm6CopyLinkedListToArray 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		Object[] res = ls.toArray();
		
		System.out.println("Result after copying linked list to an array is: ");
		
		for(Object r:res)
		{
			System.out.println(r);
		}
	}
}

package collections;
import java.util.TreeSet;

public class Pgm22GetSubsetFromTheSortedSet 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		
		System.out.println("Result of the subset for the given set is: "+ts.subSet(20,50));
	}
}

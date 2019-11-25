package collections;
import java.util.HashSet;
public class Pgm13aComparingSets 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(10);
		hs1.add(20);
		
		HashSet<Integer> hs2=new HashSet<>();
		hs2.add(10);
		hs2.add(20);
		hs2.add(30);
		hs2.add(40);
		
		//Comparing 2 sets
		System.out.println("Is all the objects of hs2 is present in hs1? "+hs1.containsAll(hs2));
		
		//Retaining elements which are same on both sets
		hs2.retainAll(hs1);
		System.out.println("Result after removing uncomman elements of hs1 from hs2 are: "+hs2);
	}
}

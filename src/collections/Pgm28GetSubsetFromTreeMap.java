package collections;
import java.util.TreeMap;

public class Pgm28GetSubsetFromTreeMap 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,Integer> tm1=new TreeMap<>();
		tm1.put(1,10);
		tm1.put(2,20);
		tm1.put(3,30);
		tm1.put(4,40);
		tm1.put(5,50);
		
		System.out.println("Subset of the given collection tm1 is: "+tm1.subMap(3,5));
	}
}

package collections;

import java.util.ArrayList;

public class Pgm2ContainsAllInArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> ls1=new ArrayList<>();
		ls1.add(10);
		ls1.add(20);
		
		ArrayList<Integer> ls2=new ArrayList<>();
		ls2.add(10);
		ls2.add(20);
		
		System.out.println("Is arrays list ls2 contains all values of ls1? "+ls2.containsAll(ls1));
	}

}

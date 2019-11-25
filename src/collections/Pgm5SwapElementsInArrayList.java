package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Pgm5SwapElementsInArrayList 
{
	public static void main(String[] args) 
	{	
		ArrayList<Integer> ls2=new ArrayList<>();
		ls2.add(30);
		ls2.add(40);
		ls2.add(50);
		ls2.add(60);
		
		
		Collections.swap(ls2,1,3);
		
		System.out.println("Objects present in collection ls2 are: "+ls2);
	}
}

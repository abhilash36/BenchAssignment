package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Pgm4ShufflingOfArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ls1=new ArrayList<>();
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		ls1.add(40);
		
        Collections.shuffle(ls1);
        
        System.out.println("Result after shuffling for the first time is: ");
        
        for(Integer i:ls1)
        {
        	System.out.println(i);
        }
        
        Collections.shuffle(ls1);
        
        System.out.println("Result after shuffling for the second time is: ");
        
        for(Integer i:ls1)
        {
        	System.out.println(i);
        }
	}
}

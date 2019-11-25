package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pgm34GetMaxElementFromTheGivenList 
{
	public static void main(String[] args) 
	{
		List<Integer> ls=new ArrayList<>(); 
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		System.out.println("Maximum element present in the given list is: "+Collections.max(ls));
	}
}

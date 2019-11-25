package collections;

import java.util.ArrayList;

public class Pgm1CopyOrCloneArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ls=new ArrayList<>();
		ls.add(10);
		ls.add(20);
		
		//Code to copy object from collection to other collection
		Object copy = ls.clone();
		
		System.out.println("Content in the Array list Clone is: "+copy);

	}

}

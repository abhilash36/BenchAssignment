package collections;

import java.util.HashSet;

public class Pgm12CopySetContentToAnotherHashset 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(10);
		hs1.add(20);
		
		HashSet<Integer> hs2=new HashSet<>();
		hs2.add(30);
		hs2.add(40);
		
		//Copying set content of hs1 to hs2
		hs2.addAll(hs1);
		
		System.out.println("After copying set content of hs1 to hs2 is: "+hs2);
	}
}

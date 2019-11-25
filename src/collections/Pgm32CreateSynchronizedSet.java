package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Pgm32CreateSynchronizedSet 
{
	public static void main(String[] args) 
	{
		Set<String> ss=new HashSet();
		Set<String> a=Collections.synchronizedSet(ss);
		System.out.println("Sysnchronized set is created");
	}
}

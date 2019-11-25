package numbertheory;

import java.util.Scanner;

public class Pgm24PrintMiddleNumAmong3GivenNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[3];
		
		System.out.println("Enter the numbers");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Middle number from the 3 given numbers are: "+a[1]);
	}
}

package numbertheory;

import java.util.Scanner;

public class Pgm26PrintTrueIfSumOf2NumIsEqualTo3rdNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1");
		int a=s.nextInt();
		System.out.println("Enter number2");
		int b=s.nextInt();
		System.out.println("Enter number3");
		int c=s.nextInt();
		
		int sum=a+b;
		
		boolean res=(sum==c);
		
		if(res)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}

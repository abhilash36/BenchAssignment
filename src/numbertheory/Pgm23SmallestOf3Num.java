package numbertheory;

import java.util.Scanner;

public class Pgm23SmallestOf3Num {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1");
		int a=s.nextInt();
		System.out.println("Enter number2");
		int b=s.nextInt();
		System.out.println("Enter number3");
		int c=s.nextInt();
		
		
		if(a<b && a<c)
		{
			System.out.println(a+" is smaller");
		}
		else if(b<a && b<c)
		{
			System.out.println(b+" is smaller");
		}
		else if(c<a && c<b)
		{
			System.out.println(c+" is smaller");
		}

	}

}

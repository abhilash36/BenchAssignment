package numbertheory;

import java.util.Scanner;

public class Pgm22BiggerOf2num 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1");
		int a=s.nextInt();
		System.out.println("Enter number2");
		int b=s.nextInt();
		
		
		if(a>b)
			System.out.println(a+" is greater");
		else
			System.out.println(b+" is greater");
	}

}

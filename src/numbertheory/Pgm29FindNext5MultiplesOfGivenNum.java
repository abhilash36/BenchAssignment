package numbertheory;

import java.util.Scanner;

public class Pgm29FindNext5MultiplesOfGivenNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		int size=5;
		
		System.out.println("Result of next 5 multiples of the given num "+n+" is:");
		
		for(int i=1;i<=size;i++)
		{
			int res=n*i;
			
			System.out.println(res);
		}

	}

}

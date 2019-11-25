package numbertheory;

import java.util.Scanner;

public class Pgm30SumOfAllEvenNumBtwnGivenRange 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start=s.nextInt();
		System.out.println("Enter the ending number");
		int end=s.nextInt();
		int sum=0;
		
		System.out.println("Sum of all even numbers between the given range "+start+" and the "+end+" is:");
		
		for(int i=start;i<=end;i++)
		{
			if((i%2)==0)
			{
				sum=sum+i;
			}
		}
	    System.out.println(sum);
	}

}

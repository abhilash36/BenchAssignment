package numbertheory;

import java.util.Scanner;

public class Pgm28PrintAllOddNumBtwnRange 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start=s.nextInt();
		System.out.println("Enter the ending number");
		int end=s.nextInt();
		
		System.out.println("Odd number range between "+start+" and the "+end+" is:");
		for(int i=start;i<=end;i++)
		{
			if((i%2)==1)
			{
				System.out.println(i);
			}
		}
	}
}

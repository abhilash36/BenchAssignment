package patterns;

import java.util.Scanner;

public class Pgm313LeftAngleTriangle 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
			if(i>j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
	   	}
			System.out.println();
	  }
   }
}

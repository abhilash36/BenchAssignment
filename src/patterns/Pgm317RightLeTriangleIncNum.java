package patterns;

import java.util.Scanner;

public class Pgm317RightLeTriangleIncNum 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		
		int num=1;
		
		System.out.println("Result is: ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>j)
				{
					System.out.print(num+" ");
					num++;
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

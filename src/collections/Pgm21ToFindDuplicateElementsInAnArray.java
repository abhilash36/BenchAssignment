package collections;

import java.util.Scanner;

public class Pgm21ToFindDuplicateElementsInAnArray 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		
		int[] a=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Duplicate elements present in an array are: ");
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]==a[i] && i!=j)
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}

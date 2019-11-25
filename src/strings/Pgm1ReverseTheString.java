package strings;

import java.util.Scanner;

public class Pgm1ReverseTheString 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		char[] ch=s1.toCharArray();
		String rev=" ";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
       System.out.println("Reverse of the given string is: "+rev);
	}
}

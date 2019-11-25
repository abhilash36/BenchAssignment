package strings;

import java.util.Scanner;

public class Pgm6WordCount 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		char[] ch=str.trim().toCharArray();
		int count=1;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ' && ch[i+1]!=' ')
			{
				count++;
			}
		}
		System.out.println("Number of words present in the given string is: "+count);
	}
}

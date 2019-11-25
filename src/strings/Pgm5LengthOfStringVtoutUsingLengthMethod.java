package strings;

import java.util.Scanner;

public class Pgm5LengthOfStringVtoutUsingLengthMethod 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		char[] ch=str.trim().toCharArray();
		
		int count=0;
		
		//code to get the Length of the given string including space
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println("Length of the given string "+str+" is: "+count);
	}
}

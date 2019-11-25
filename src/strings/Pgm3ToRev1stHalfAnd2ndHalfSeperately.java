package strings;

import java.util.Scanner;

public class Pgm3ToRev1stHalfAnd2ndHalfSeperately 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		char[] ch=str.toCharArray();
		
		String rev1=" ";
		
		String rev2=" ";
		
		//Code to reverse the first half of the string
		for(int i=(ch.length-1)/2;i>=0;i--)
         {
	       rev1=rev1+ch[i];
         }	
		System.out.println("First half of the string in the reverse order is: "+rev1);
		
		
		//Code to reverse the second half of the String
		for(int i=ch.length-1;i>(ch.length-1)/2;i--)
		{
			rev2=rev2+ch[i];
		}
		System.out.println("Second half of the string in the reverse order is: "+rev2);	
	}
}

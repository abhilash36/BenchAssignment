package strings;

import java.util.Scanner;

public class Pgm4RotateOneCharInGivenString 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		
		//Code to rotate one character left for the given string
		String s1=str.substring(1)+str.substring(0,1);
		
		System.out.println("Result of rotating one character left of the given string "+str+" is: "+s1);
		
		

		//Code to rotate one character right for the given string
		 String s2=str.substring(str.length()-1)+str.substring(0,str.length()-1);
				
		 System.out.println("Result of rotating one character right of the given string "+str+" is: "+s2);
	}

}

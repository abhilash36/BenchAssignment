package numbertheory;

import java.util.Scanner;

public class Pgm25Print3GivenNumInAceOrder {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1");
		int a=s.nextInt();
		System.out.println("Enter number2");
		int b=s.nextInt();
		System.out.println("Enter number3");
		int c=s.nextInt();
		
		int temp=0;
		
		System.out.println("Numbers in ascending order of the given input is: ");
		
	  for(int i=0;i<3;i++)
	  {	
		if(a<b)
		{
		   temp=a;
		   a=b;
		   b=temp;
		}
		
		if(b<c)
		{
			temp=b;
			b=c;
			c=temp;
		}
		
		if(c<a)
		{
			temp=c;
			c=a;
			a=temp;
		}
	  }
	  
	  System.out.println("a: "+a+",b: "+b+",c: "+c);
  }
}

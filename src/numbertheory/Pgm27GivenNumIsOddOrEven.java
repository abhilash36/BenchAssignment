package numbertheory;

import java.util.Scanner;

public class Pgm27GivenNumIsOddOrEven {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		if((n%2)==0)
			System.out.println(n+" is even number");
		else
			System.out.println(n+" is odd number");

	}
}

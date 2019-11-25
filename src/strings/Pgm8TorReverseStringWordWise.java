package strings;

public class Pgm8TorReverseStringWordWise
{
	public static void main(String[] args) 
	{
		String s="how are you?";
		
		String[] s1=s.split(" ");
		
		String rev=" ";
		
		for(int i=s1.length-1;i>=0;i--)
		{
		 rev=rev+" "+s1[i];	
		}

		System.out.println("Result is: "+rev);
	}
}

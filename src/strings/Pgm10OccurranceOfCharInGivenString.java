package strings;

import java.util.Scanner;

public class Pgm10OccurranceOfCharInGivenString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			boolean duplicate=false;
			
			for(int j=0;j<=i-1;j++)
			{
				if(ch[j]==ch[i])
				{
					duplicate=true;
					break;
				}
			}
			
			
			if(!duplicate)
			{
				int count=0;
				
				for(int j=0;j<ch.length;j++)
				{
					if(ch[j]==ch[i])
					{
						count++;
					}
				}
				
				if(count>1)
				{
					System.out.println(ch[i]+" has occurred "+count+" times in the given string "+str);
				}
			}
		}

	}

}

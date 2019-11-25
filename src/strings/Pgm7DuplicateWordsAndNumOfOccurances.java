package strings;

public class Pgm7DuplicateWordsAndNumOfOccurances 
{
	public static void main(String[] args)
	{
		String str="hi mom hi dad hi sister how are you?";
		
		str=str.toLowerCase();
		
		String[] s1=str.split(" ");
		
		System.out.println("Duplicate words present in the given string is: ");
		
		for(int i=0;i<s1.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count++;
					s1[j]="0";
				}
			}
			
			if(count>1 && s1[i]!="0")
			{
				System.out.println(s1[i]+" and its number of occurances is: "+count);
			}	
		}
	}
}

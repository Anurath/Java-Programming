import java.util.Scanner;
class MockQuestoinCharacterFrequencyInString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next().toUpperCase();
		int maxCount = 0;
		char maxDgt='\u0000';
		for (char ch='A';ch<='Z' ;ch++ )
		{
			int cnt= 0;
			for (int i=0;i<str.length() ;i++ )
			{
				char ch1 = str.charAt(i);
				if (ch==ch1)
				{
					cnt++;
				}
			}
			if (maxCount<cnt)
			{
				maxCount=cnt;
				maxDgt=ch;
			}
		}
		System.out.println("Heghesty Frequency of digit is "+maxDgt +" with count of "+maxCount+" times.");
	}
}	
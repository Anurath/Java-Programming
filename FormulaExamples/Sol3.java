import java.util.Scanner;
class Solution3
{
	public static void main(String[] args)
	{
		int i=1;
		for (char ch='A';ch<='Z' ;ch+=i)
		{
			System.out.println(ch);
			i++;
		}
	}
}
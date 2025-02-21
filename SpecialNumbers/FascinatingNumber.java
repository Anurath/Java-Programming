import java.util.Scanner;
class FascinatingNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int  num = sc.nextInt();
		boolean flag = true;
		String str= num+""+(num*2)+(num*3);
		for (char ch='1';ch<='9' ;ch++ )
		{
			int cnt = 0;
			for (int i=0;i<str.length() ;i++ )
			{
				char ch1 = str.charAt(i);
				if (ch1==ch)
				{
					cnt++;
				}
			}
			if (cnt!=1)
			{
				flag = false;
				break;
			}
		}
		if (flag)
		{
			System.out.println("Number is fascinating number.");
		}
		else
			System.out.println("Not a fascinating number.");

	}
}
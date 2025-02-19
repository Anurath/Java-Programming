import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		String num = sc.next();
		boolean flag = false;
		boolean flag1 = true;
		for (int i=0;i<num.length() ;i++ )
		{
			char ch = num.charAt(i);
			if (!(ch<='9'&&ch>='0'))
			{
				flag1 = false;
			}
		}
		if (flag1)
		{
			if ((num.charAt(0)=='0'))
				System.out.println("The given number is not Duck Number.");
			else
			{
				for (int i=1;i<num.length() ;i++ )
				{
					char ch = num.charAt(i);
					if ((ch=='0'))
						flag=true;
				}
				if (flag)
					System.out.println("The give numebr is Duck Number.");
				else
					System.out.println("The given number is not Duck Number.");
			}
		}
		else
			System.out.println("INVALID INPUT!");
	}
}

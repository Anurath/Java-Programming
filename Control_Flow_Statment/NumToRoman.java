import java.util.Scanner;
class NumToRoman
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		String str = ""+num;
		int len = str.length();

		if (len==4)
		{
			for (int i=0;i<str.length() ;i++ )
			{
				char ch=str.charAt(i);
				int n= Character.getNumericValue(ch);
				switch(n)
				{
					case 1:
					{
						
					}
					case 1:
					{
						
					}
					case 1:
					{
						
					}
					case 1:
					{
						
					}
				}
			}
		}
		else if (len==3)
		{
			for (int i=0;i<str.length() ;i++ )
			{
				char ch=str.charAt(i);
				int n= Character.getNumericValue(ch);
				System.out.print(n);
			}
		}
		else if (len==2)
		{
			for (int i=0;i<str.length() ;i++ )
			{
				char ch=str.charAt(i);
				int n= Character.getNumericValue(ch);
				System.out.print(n);
			}
		}
		else if (len==1)
		{
			for (int i=0;i<str.length() ;i++ )
			{
				char ch=str.charAt(i);
				int n= Character.getNumericValue(ch);
				System.out.print(n);
			}
		}
	}
}
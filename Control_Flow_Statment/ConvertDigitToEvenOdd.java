import java.util.Scanner;
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		String str=""+num;
		int len = str.length();
		String newStr = "";

		if (len%2==0)
		{
			for (int i=0;i<len ;i++ )
			{
				char ch = str.charAt(i);
				int n = Character.getNumericValue(ch);
				if (n%2!=0)
				{
					if (n==9)
					{
						n--;
					    newStr=newStr+n;
					}
					else
					{
					  n++;
					  newStr=newStr+n;
					}
				}
				else
				{
					newStr=newStr+n;
				}
			}
		}
		else
		{
		    for(int i=0;i<len;i++)
			{
				char ch= str.charAt(i);
				int n = Character.getNumericValue(ch);
				if (n%2==0)
				{
					n++;
					newStr=newStr+n;
				}
				else
				{
					newStr= newStr+n;
				}
			}
		}
		int num1 = Integer.parseInt(newStr);
		System.out.println(num1);
	}
}

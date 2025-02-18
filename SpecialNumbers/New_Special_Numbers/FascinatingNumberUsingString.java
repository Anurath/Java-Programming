import java.util.Scanner;
class FascinatingNumberUsingString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = true;
		String str = num+""+num*2+num*3;
		System.out.println(str);
		for (char ch ='1';ch<='9' ;ch++ )
		{
			int cnt=0;
			for (int i=0;i<str.length() ;i++ )
			{
				char ch1  = str.charAt(i);
				if (ch==ch1)
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
		if(flag){
			System.out.println("The given number is fascinating number.");
		}
		else{
			System.out.println("The given number is not fascinating numebr.");
		}
	}
}





/*for (char ch='0';ch<='9' ;ch++ )
		{
			int cnt=0;
			for (int i=0;i<str.length() ;i++ )
			{
				char ch1 = str.charAt(i);
				System.out.println(ch1);
				if (ch==ch1)
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
			System.out.print("The give number is fascinating number.");
		else
			System.out.print("The given number is not fascinating number.");
*/
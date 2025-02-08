import java.util.Scanner;
class NumberToWord1
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		String str= "";
		int num = sc.nextInt();
		while (num>0)
		{
			int rem= num%10;
			switch(rem)
			{
				case 0:
				{
					str="zero"+str;
					break;
				}
				case 1:
				{
					str="one"+str;
					break;
				}
				case 2:
				{
					str="two "+str;
					break;
				}
				case 3:
				{
					str="three "+str;
					break;
				}
				case 4:
				{
					str="four "+str;
					break;
				}
				case 5:
				{
					str="five "+str;
					break;
				}
				case 6:
				{
					str="six "+str;
					break;
				}
				case 7:
				{
					str="seven "+str;
					break;
				}
				case 8:
				{
					str="eight "+str;
					break;
				}
				case 9:
				{
					str="nine "+str;
					break;
				}
			}
			num/=10;
		}
		System.out.println(str);
	}
}
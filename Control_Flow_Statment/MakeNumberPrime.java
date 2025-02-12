import java.util.Scanner;
class MakeNumberPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = true;
		int originalNum=num;
		int dup = num;
		for (int i=2;i<num ;i++ )
			if (num%i==0)
			{
				num++;
				flag = false;
			}
		if (flag)
		{
			System.out.println(num);
			return;
		}
		int nPrime= num;
		for (int i=2;i<dup ;i++ )
			if (dup%i==0)
				dup--;
		int pPrime = dup;
		int diff1=originalNum-pPrime;
		int diff2=nPrime-originalNum;

		if (diff1<diff2)
			System.out.println(pPrime + " "+ originalNum );
		else if (diff1>diff2)
			System.out.println(originalNum+ " "+nPrime);
		else
			System.out.println(pPrime+" " + originalNum+ " " +nPrime);
	}

}
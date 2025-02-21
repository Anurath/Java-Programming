import java.util.Scanner;
class BouncyNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int cnt=0;
		int inc=0;
		int decs=0;
		boolean flag = true;
		for (int i=num;i>0 ;i/=10 )
			cnt++;
		int[] arr = new int[cnt];
		for (int i=num,j=cnt-1;i>0 ;j--,i/=10 )
		{
			arr[j]=i%10;
		}
		for (int i=cnt-1;i>=1;i-- )
		{
			if (arr[i]>arr[i-1])
			{
				inc++;
				decs=0;
			}
			else if(arr[i]<arr[i-1])
			{
				decs++;
				inc=0;
			}
			if (inc>1||decs>1)
			{
				flag = false;
				break;
			}
		}
		if (flag)
		{
			System.out.println("Bouncy Number.");
		}
		else
			System.out.println("Not Bouncy Number.");
	}
}
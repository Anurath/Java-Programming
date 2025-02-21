import java.util.Scanner;
class DecreasingNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = true;
		int cnt = 0;
		for (int i=num;i>0 ;i/=10 )
			cnt++;
		int[] arr = new int[cnt];
		for (int i=num,j=cnt-1;i>0 ;j--,i/=10 )
		{
			arr[j]=i%10;
		}
		for (int i=cnt-1;i>=1 ;i-- )
		{
			if (arr[i]<arr[i-1])
			{
				continue;
			}
			else
				flag = false;
		}
		if (flag)
		{
			System.out.println("Decreaing Number");
		}
		else
			System.out.println("Not Decreasing Number");
	}
}
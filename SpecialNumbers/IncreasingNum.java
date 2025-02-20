import java.util.Scanner;
class IncreasingNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int cnt=0;
		boolean flag = true;
		for (int i=num;i>0 ;i/=10)
		{
			cnt++;
		}
		int[] arr = new int[cnt];
		for (int i=num;i<arr.length;i/=10)
		{
			int rem = i%10;
			System.out.println(rem);
			arr[i]=rem;
		}
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
	}
}

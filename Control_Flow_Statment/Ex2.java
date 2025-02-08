import java.util.Scanner;
class Ex2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length : ");
		int num = sc.nextInt();
		System.out.print("Enter the target element : ");
		int target= sc.nextInt();
		int[] arr = new int[num];

		for (int i=0;i<num;i++ )
		{
			System.out.print("Enter the "+i+"th "+" element");
			int ele= sc.nextInt();
			arr[i]=ele;
		}
		for (int i=0;i<num ;i++ )
		{
			if (target==arr[i])
			{
				System.out.println("Element is present at index "+i);
			}
		}
	}
}
import java.util.Scanner;
class Array4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of arr");
		int arrSize = sc.nextInt();

		int[] arr= new int[arrSize];

		for (int i=0;i<arrSize;i++ )
		{
			System.out.print("Enter "+ i+" element");
			arr[i]=sc.nextInt();
		}

		System.out.print("Enter the target element : ");
		int target = sc.nextInt();

		for (int j=0;j<arrSize;j++ )
		{
			if (arr[j]==target)
			{
				System.out.print("Element found at "+j+ "index");
				return;
			}
		}
	}
}
import java.util.Scanner;
class Array6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//array size
		System.out.print("Enter the array length : ");
		int arrSize = sc.nextInt();
		//target element
		System.out.print("Enter target element : ");
		int target = sc.nextInt();
		
		int[] location= int[arrSize];
		int[] arr = new int[arrSize];
		for (int i=0;i<arrSize ;i++)
		{
			System.out.print("Enter the "+i +" element : ");
			int newEle= sc.nextInt();
			arr[i]= newEle;
		}
		for (int i=0;i<arrSize ;i++ )
		{
			if (target==arr[i])
			{
				
			}
		}
		
	}
}
import java.util.Scanner;
class Array5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array");
		int size = sc.nextInt();

		int [] arr = new int[size];

		for (int i=0;i<size ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		for (int j=0;j<size;j++)
		{
			int temp = arr[j];
			for (int k=j;k<size-1 ;k++ )
			{
				if (temp==arr[k+1])
				{
					System.out.println("Duplucate at"+k);
				}
			}
		}
	}
}
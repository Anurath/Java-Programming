package array;

public class SumEvenOddElements {

	public static void main(String[] args)
	{
		int[] arr = {12,23,43,54,67,76,45,673,34,56,};
		sumOddEvenElements(arr);
	}
	public static void sumOddEvenElements(int[] arr)
	{
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenSum+=arr[i];
			}
			else
			{
				oddSum+=arr[i];
			}
		}
		System.out.println("Even Sum: "+evenSum);
		System.out.println("Odd Sum: "+oddSum);
	}
}

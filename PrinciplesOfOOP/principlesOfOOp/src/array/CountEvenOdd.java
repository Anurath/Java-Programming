package array;

public class CountEvenOdd {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,12,34,5};
		countEvenOdd(arr);
	}
	
	public static void countEvenOdd(int[]arr)
	{
		int even = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				even++;
		}
		System.out.println("Even elements: "+even);
		System.out.println("Odd elements: "+(arr.length-even));
	}
}

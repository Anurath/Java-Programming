package array;

import java.util.Arrays;

public class HalfReverse {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,3,2,};
		halfReverse(arr);
	}
	
	public static void halfReverse(int[] arr)
	{
		int mid = arr.length/2;
		int j=arr.length-1;
		for(int i=mid;i<j;i++,j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

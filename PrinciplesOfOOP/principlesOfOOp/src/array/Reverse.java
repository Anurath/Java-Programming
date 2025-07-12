package array;

import java.util.Arrays;

public class Reverse {

	public static void reverse(int[] arr)
	{
		int j=arr.length-1;
		for(int i=0;i<arr.length/2;i++,j--)
		{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
		}
	}
	
	public static void main(String[]args)
	{
		int[] arr = {1,2,3,4,5,6};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
}

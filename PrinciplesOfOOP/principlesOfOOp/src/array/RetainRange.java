package array;

import java.util.Arrays;

public class RetainRange {

	public static int[] retainRange(int[] arr,int start,int end)
	{
		if(start<end&&start>=0&&end<arr.length)
		{
			int[] ans = new int[end-start];
			
			for(int i=0;i<end-start;i++)
			{
				ans[i]=arr[start+i];
			}
			return ans;
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(retainRange(arr, 2, 5)));
	}
}

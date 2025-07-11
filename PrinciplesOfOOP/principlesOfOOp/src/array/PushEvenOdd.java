package array;

import java.util.Arrays;

public class PushEvenOdd {

	public static int[] pushEvenOdd(int[] arr)
	{
		int[] ans = new int[arr.length];
		int j=0,k=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				ans[j]=arr[i];
				j++;
			}
			else
			{
				ans[k]=arr[i];
				k--;
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,3,5,5,6,7,8,5,4,3,1,2};
		System.out.println(Arrays.toString(pushEvenOdd(arr)));
	}
}

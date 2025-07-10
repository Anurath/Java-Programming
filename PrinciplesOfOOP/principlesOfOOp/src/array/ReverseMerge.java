package array;

import java.util.Arrays;

public class ReverseMerge {

	public  static int[] reverseMerge(int[] arr1,int[] arr2)
	{
		int len1 = arr1.length,len2 = arr2.length;
		int len = len1+len2;
		int[] ans = new int[len];
		for(int i=0;i<len;i++)
		{
			if(len1>0)
			{
				ans[i]=arr1[len1-1];
				len1--;
			}
			else
			{
				ans[i]=arr2[len2-1];
				len2--;
			}
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8};
		System.out.println(Arrays.toString(reverseMerge(arr1, arr2)));
	}
}

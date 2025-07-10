package array;

import java.util.Arrays;

public class ReverseZigZagMerge {

	public static int[] reverseZigZagMerge(int[]arr1,int[] arr2)
	{
		int len1 =arr1.length,len2 = arr2.length;
		int[] ans = new int[len1+len2];
		
		for(int i=0;i<ans.length;i++)
		{
			if(len1>0)
			{
				ans[i]=arr1[len1-1];
				len1--;
				if(len2>0)
				{
					i++;
				}
			}
			if(len2>0)
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
		System.out.println(Arrays.toString(reverseZigZagMerge(arr1, arr2)));
	}
}

package array;

import java.util.Arrays;

public class ZigZagArrayMerge {

	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10,11};
		System.out.println(Arrays.toString(zigZagMerge(arr1, arr2)));
	}
	
	public static int[] zigZagMerge(int[] arr1,int[] arr2)
	{
		int len1=0,len2=0;
		int len =arr1.length+arr2.length;
		int[] ans = new int[len];
		for(int i=0;i<len;i++)
		{
			if(len1<arr1.length)
			{
				ans[i]=arr1[len1];
				len1++;
				if(len2<arr2.length)
				{
					i++;
				}
			}
			if(len2<arr2.length)
			{
				ans[i]=arr2[len2];
				len2++;
			}
		}
		return ans;
	}
}

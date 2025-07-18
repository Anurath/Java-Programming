package merging;

import java.util.Arrays;

public class Merge {

	
	
	public static int[] sortSameArraySortedTwoHalf(int[]a)
	{
		int[] ans = new int[a.length];
		int i=0,j=a.length/2,k=0;
		
		while(i<a.length/2&&j<a.length)
		{
			if(a[i]<=a[j])
			{
				ans[k++]=a[i++];
			}
			else if(a[i]>a[j])
			{
				ans[k++]=a[j++];
			}
		}
		while(i<a.length/2)
		{
			ans[k++]=a[i++];
		}
		while(j<a.length)
		{
			ans[k++]=a[j++];
		}
		return ans;
	}
	
	public static int[] mergeTwoSortedArray(int[] a,int[] b)
	{
		int[] ans = new int[a.length+b.length];
		
		int i=0,j=0,k=0;
		
		while(i<a.length&&j<b.length)
		{
			if(a[i]<=b[j])
			{
				ans[k++]=a[i++];
			}
			else if(a[i]>b[j])
			{
				ans[k++] = b[j++]
;			}
		}
		
		while(i<a.length)
		{
			ans[k++]=a[i];
		}
		while(j<b.length)
		{
			ans[k++]=b[j++];
		}
		return ans;
	}
	
	
	
	public static void main(String[] args)
	{
		int[] a = {1,3,5,7,4,5,6,7};
		int[] b = {2,4,6,8,90};
		
		System.out.println(Arrays.toString(sortSameArraySortedTwoHalf(a)));
	}
}

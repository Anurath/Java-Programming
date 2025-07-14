package array;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayInsertion {

	public static int[] arrayInsertion(int[] a,int[] b,int idx)
	{
		if(idx<a.length&&idx>=0)
		{
			int j=0;
			int[] ans = new int[a.length+b.length];
			for(int i=0;i<ans.length;i++)
			{
				if(i<idx)
				{
					ans[i]=a[i];
				}
				else if(i<(idx+b.length))
				{
					ans[i]=b[j++];
				}
				else {
					ans[i]=a[i-b.length];
				}
			}
			return ans;
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {100,200,300,400,500};
		System.out.println(Arrays.toString(arrayInsertion(arr1, arr2,3)));
	}
}

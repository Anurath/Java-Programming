package array;

import java.util.Arrays;

public class ArrayInsertion {

	public static int[] arrayInsertion(int[] arr1,int[] arr2,int k)
	{
		int[] ans = new int[arr2.length+arr1.length];
		int i=0;
		for(;i<k;i++)
		{
			ans[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;k++,j++)
		{
			ans[k]=arr2[j];
		}
		for(;k<ans.length;k++)
		{
			ans[k]=arr1[i];
		}
		return ans;
	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {100,200,300,400,500};
		System.out.println(Arrays.toString(arrayInsertion(arr1, arr2,3)));
	}
}

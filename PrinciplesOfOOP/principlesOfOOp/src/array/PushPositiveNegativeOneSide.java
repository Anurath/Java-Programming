package array;

import java.util.Arrays;

public class PushPositiveNegativeOneSide {

	public static int[] pushPosNegAtOneSide(int[] arr)
	{
		int[] ans = new int[arr.length];
		int k=0,l=arr.length-1;
		for(int i=0;i<ans.length;i++)
		{
			if(arr[i]>0)
			{
				ans[k]=arr[i];
				k++;
			}
			if(arr[i]<0)
			{
				ans[l]=arr[i];
				l--;
			}
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,-4,3,-5,9,-12,0,4,-6,-2,3,5};
		System.out.println(Arrays.toString(pushPosNegAtOneSide(arr)));
	}
}

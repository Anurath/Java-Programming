package array;

import java.util.Arrays;

public class NegativePositivePush {

	public static void negPosPush(int[]arr)
	{
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			if(arr[i]<0)
			{
				if(arr[j]>0)
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				else
				{
					i--;
				}
			}
			else
			{
				j++;
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int[] arr= {-3,1,-1,4,-5,8,-4,2,-3,4,-6,-4,3,6};
		negPosPush(arr);
		System.out.println(Arrays.toString(arr));
	}
}

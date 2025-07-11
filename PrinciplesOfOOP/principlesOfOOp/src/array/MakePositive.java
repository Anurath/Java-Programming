package array;

import java.util.Arrays;

public class MakePositive {

	public static int[] makePositive(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=arr[i]*(-1);
			}
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,-3,-9,10,-3,-9,6,7,-3,4};
		System.out.println(Arrays.toString(makePositive(arr)));
	}
}

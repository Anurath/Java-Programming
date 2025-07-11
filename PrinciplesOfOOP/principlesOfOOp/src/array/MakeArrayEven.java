package array;

import java.util.Arrays;

public class MakeArrayEven {

	public static int[] makeEven(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				arr[i]=arr[i]+1;
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,3,2,3,4,5,7,6,7,8,9,6,45,3,45,67,7};
		System.out.println(Arrays.toString(makeEven(arr)));
	}
}

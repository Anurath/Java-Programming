package array;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElement {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,7,8};
		
		int missNum = missingElement(arr);
		System.out.println(missNum);
		
	}
	public static int missingElement(int[] arr)
	{
		for(int i=0,j=1;i<arr.length;i++,j++)
		{
			if(arr[i]!=j)
			{
				return i+1;
			}
		}
		return -1;
	}
}

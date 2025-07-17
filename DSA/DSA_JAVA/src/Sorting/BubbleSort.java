package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[]arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,7,6,5,4,5,6,7,4,3,2};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
}

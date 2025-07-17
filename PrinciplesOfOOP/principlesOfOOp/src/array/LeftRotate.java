package array;

import java.util.Arrays;

public class LeftRotate {

	public static void leftRotate(int[] arr,int times)
	{
		while(times!=0)
		{
			int temp=arr[0];
			
			for(int i=1;i<arr.length;i++)
			{
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
			times--;
		}
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6,7};
		
		leftRotate(a, 2);
		System.out.println(Arrays.toString(a));
	}
}

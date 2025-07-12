package array;

import java.util.Arrays;

public class EvenOddPush {

	public static void evenOddPush(int[]arr)
	{
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			if(arr[i]%2==0)
			{
				if(arr[j]%2!=0) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
				else
				{
					i--;
				}
			}
			else {
				j++;
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		evenOddPush(arr);
		System.out.println(Arrays.toString(arr));
	}
}

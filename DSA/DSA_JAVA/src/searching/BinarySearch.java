package searching;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int[] arr,int search)
	{
		int start=0, end=arr.length-1,mid=(start+end)/2;
		
		while(start<=end)
		{
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(arr[mid]>search)
			{
				end=mid-1;
			}
			else if(arr[mid]<search)
			{
				start = mid+1;
			}
			
			mid=(start+end)/2;
		}
		return -1;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,8,7,6,7,5,65,45,335,66,3,223,1,2,11,22,32,34,34,35,45,56,56,667,7,889,1,2,1,21,3,443,45,43};
		System.out.println(binarySearch(arr, 11));
	}
}

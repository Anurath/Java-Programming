package array;

public class CheckElement {

	public static void main(String[] args)
	{
		int[] arr = {12,23,44,25,34,56,34,77,877,34,23,54,7};
		int target = 7;
		System.out.println(isIn(arr, target));
	}
	
	public static  boolean isIn(int[] arr,int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
				return true;
		}
		return false;
	}
}

package array;

public class OddEvenSumEqual {
	
	public static void main(String[] args)
	{
		int[] arr = {4,6,4,5,5,3};
		System.out.println(isEqual(arr));
	}
	
	public static boolean isEqual(int[]arr)
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				res+=arr[i];
			else
				res-=arr[i];
		}
		return res==0;
	}
}

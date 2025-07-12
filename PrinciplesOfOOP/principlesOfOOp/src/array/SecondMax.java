package array;

public class SecondMax {

	public static int secondMax(int[] arr)
	{
		int max=-2147483648,secMax=max;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secMax =max;
				max=arr[i];
			}
			else if(arr[i]>secMax&& arr[i]!=max)
			{
				secMax=arr[i];
			}
		}
		return secMax;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr  = {1,2,3,4,5,6,6};
		
		System.out.println(secondMax(arr));
	}
}

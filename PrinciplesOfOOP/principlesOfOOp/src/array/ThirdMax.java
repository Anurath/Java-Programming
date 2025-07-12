package array;

public class ThirdMax {

	public static int thirdMax(int[] arr)
	{
		int max=-2147483648,secMax = max,thirdMax=max;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				thirdMax=secMax;
				secMax = max;
				max=arr[i];
			}
			else if(arr[i]>secMax&&arr[i]!=max)
			{
				thirdMax=secMax;
				secMax = arr[i];
			}
			else if(arr[i]>thirdMax&&arr[i]!=secMax)
			{
				thirdMax=arr[i];
			}
		}
		return thirdMax;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6};
		System.out.println(thirdMax(arr));
	}
}

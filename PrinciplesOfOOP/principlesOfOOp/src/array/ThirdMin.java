package array;

public class ThirdMin {

	public static int thirdMinimum(int[] arr)
	{
		int min=2147483647,secMin=min,thirdMin=min;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				thirdMin=secMin;
				secMin=min;
				min=arr[i];
			}
			else if(arr[i]<secMin&&arr[i]!=min)
			{
				thirdMin=secMin;
				secMin=arr[i];
			}
			else if(arr[i]<thirdMin&&arr[i]!=secMin)
			{
				thirdMin=arr[i];
			}
		}
		return thirdMin;
	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(thirdMinimum(arr));
	}
}

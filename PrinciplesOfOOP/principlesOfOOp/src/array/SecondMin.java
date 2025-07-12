package array;

public class SecondMin {

	public static int secMinimum(int[] arr)
	{
		int min = 2147483647,secMin=min;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				secMin=min;
				min=arr[i];
			}
			else if(arr[i]<secMin&&arr[i]!=min)
			{
				secMin=arr[i];
			}
		}
		return secMin;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,1,2,3,4,5,6};
		System.out.println(secMinimum(arr));
	}
}

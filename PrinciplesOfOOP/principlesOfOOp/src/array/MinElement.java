package array;

public class MinElement {

	public static int minElement(int[] arr)
	{
		int min = 2147483637;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,4,3,1,-3,4};
		System.out.println(minElement(arr));
	}
}

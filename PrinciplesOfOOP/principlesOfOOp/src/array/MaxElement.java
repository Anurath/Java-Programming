package array;

public class MaxElement {

	public static int maxElement(int[]arr)
	{
		int max=-2147483648;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	
	public static void main(String[] args)
	{
		int[]arr = {1,2,3,4,3,1,2,3,4,3,4,5,5,6,6,77,8,8,9,9,0,9,8,877,8,98,9,9,88,7,7,7,6,56,66,767};
		
		System.out.println(maxElement(arr));
	}
}

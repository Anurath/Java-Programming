package array;

public class MissingElement {

	public static void main(String[] args)
	{
		int[] arr = {8,7,3,4,5,6,1,2};
		
	}
	public static int missingElement(int[] arr)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=j)
			{
				return j;
			}
		}
		return -1;
	}
}

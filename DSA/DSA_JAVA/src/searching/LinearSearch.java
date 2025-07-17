package searching;



public class LinearSearch {

	public static int linearSearch(int[] arr,int ele)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,12,9,1,2,3,4,5,6,7,8};
		
		int ans = linearSearch(arr, 12);
		System.out.println(ans);
	}
}

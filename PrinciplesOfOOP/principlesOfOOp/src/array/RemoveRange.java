package array;

import java.util.Arrays;

public class RemoveRange {

	public static int[] removeRange(int[] arr,int start,int end,boolean inc)
	{
		return removeRange(arr, start, end+1);
	}
	public static int[] removeRange(int[] arr,int start,int end)
	{
		if(start<end&&start>=0&&end<arr.length)
		{
			int[] ans = new int[arr.length-(end-start)];
			
			for(int i=0;i<arr.length;)
			{
				if(i<start)
				{
					ans[i]=arr[i];
					i++;
				}
				else if(i==start)
				{
					i+=(end-start);
				}
				else if(i>=end)
				{
					ans[i-(end-start)] = arr[i];
					i++;
				}
			}
			return ans;
		}
		return arr;
	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(removeRange(arr, 2, 4,true)));
	}
}

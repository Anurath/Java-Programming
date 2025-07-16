package array;

import java.util.Arrays;

public class Frequency {

	public static int[] frequency(int[]arr)
	{
		int[] count = new int[arr.length];
		
		for(int i=0 ; i<arr.length;i++)
		{
			if(count[i]!=-1)
			{
				int cnt = 0;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						cnt++;
						count[j]=-1;
					}
				}
				count[i]=cnt;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,2,3,4,5,6,7,6,5,4,5,6,7,8,9,0,0,9,8,9,0};
		System.out.println(Arrays.toString(frequency(arr)));
	}
}

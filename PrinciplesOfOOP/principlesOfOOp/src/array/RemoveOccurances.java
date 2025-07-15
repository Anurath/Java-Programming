package array;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveOccurances {

	public static int[] removeOccurances(int[] arr,int ele) {
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==ele)
				cnt++;
		}
		if(cnt>0)
		{
			int[] ans =  new int[arr.length-cnt];
			for(int i=0,j=0;i<arr.length;i++)
			{
				if(arr[i]!=ele)
				{
					ans[j++]=arr[i];
				}
			}
			return ans;
		}
		return arr;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,9,6,5,4,3,4,5,67,1,2,3,5,6,7,8,5,4,3,5,6,7,8,9,0,0,9,3,2,2,3,4,6,0};
		System.out.println(Arrays.toString(removeOccurances(arr, 0)));
	}
}

package array;

import java.util.Arrays;

public class RemoveSameInTwoArray {

	public static int[] removeArrayElements(int[] a,int[] b)
	{
		int[] ref = new int[a.length];
		int cnt=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					ref[j]=-1;
					cnt++;
				}
			}
		}
		
		if(cnt>0)
		{
			int[] ans = new int[a.length-cnt];
			
			for(int i=0,j=0;i<a.length;i++)
			{
				if(ref[i]!=-1)
				{
					ans[j++]=a[i];
				}
			}
			return ans;
		}
		return a;
		
	}
	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6,2,3,4};
		int[] b = {2,3,4};
		
		System.out.println(Arrays.toString(removeArrayElements(a, b)));
	}
}

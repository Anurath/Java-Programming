package array;

import java.util.Arrays;

public class arrayInsertionInRange {

	public static int[] rangeInsertion(int[] a,int[] b,int start,int end)
	{
		int j=0;
		if(start>=0&&end<a.length&&start<end)
		{
			int[] ans = new int[a.length+b.length];
			
			for(int i=0;i<ans.length;i++)
			{
				if(i<start)
				{
					ans[i]=a[i];
				}
				else if(i<(start+b.length))
				{
					ans[i]=b[j++];
				}
				else {
					ans[i]=a[i-b.length];
				}
			}
			return ans;
		}
		return null;
	}
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6,7};
		int[] b={10,20,30};
		System.out.println(Arrays.toString(rangeInsertion(a, b, 2, 3)));
	}
}

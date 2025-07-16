package array;

import java.util.Arrays;

public class UniqueElements {

	public static int[] uniqueElements(int[] a)
	{
		boolean[] ref = new boolean[a.length];
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					ref[j]=true;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(ref[i]==false)
			{
				cnt++;
			}
		}
		if(cnt>0)
		{
			int[] ans = new int[cnt];
			
			for(int i=0,j=0;i<a.length;i++)
			{
				if(ref[i]==false)
				{
					ans[j]=a[i];
					j++;
				}
			}
			return ans;
		}
		return a;
	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,4,3,2,1,2,3,4,5,6,6,7,7};
		System.out.println(Arrays.toString(uniqueElements(arr)));
	}
}

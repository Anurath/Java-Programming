package array;

import java.util.Arrays;

public class RepeatedUnique {

	public static int[] repeatedUnique(int[] a)
	{
		int[] count = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(count[i]!=-1)
			{
				int cnt=0;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						cnt++;
						count[j]=-1;
					}
				}
				count[i]=cnt;
			}
		}
		
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(count[i]>=1)
			{
				cnt++;
			}
		}
		if(cnt>0)
		{
			int[] ans = new int[cnt];
			
			for(int i=0,j=0;i<a.length;i++)
			{
				if(count[i]>=1)
				{
					ans[j++]=a[i];
				}
			}
			return ans;
		}
		return null;
	}
	
	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,3,2,1,2,3,4,4,5};
		System.out.println(Arrays.toString(repeatedUnique(a)));
	}
}

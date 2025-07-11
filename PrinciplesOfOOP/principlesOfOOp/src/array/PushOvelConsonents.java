package array;

import java.util.Arrays;

public class PushOvelConsonents {

	public static char[] pushOvelsConsonets(char[] arr)
	{
		char[] ans = new char[arr.length];
		int j=0,k=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				ans[j]=arr[i];
				j++;
			}
			else
			{
				ans[k]=arr[i];
				k--;
			}
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		char[] arr = {'a','r','h','t','u','y','o','p'};
		System.out.println(Arrays.toString(pushOvelsConsonets(arr)));
	}
}

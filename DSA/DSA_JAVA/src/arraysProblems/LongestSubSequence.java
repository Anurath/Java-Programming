package arraysProblems;

public class LongestSubSequence {

	
	public static void main(String[] args)
	{
		int[] arr = {1,1,1,1,1,1,1,1};
		longSubSequence(arr);
	}
	
	public static void longSubSequence(int[] arr)
	{
		int max=0,num=arr[0];
		int cnt=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				cnt++;
			}
			else
			{
				if(cnt>max)
				{
					max=cnt;
					num=arr[i];
				}
				cnt=0;
			}
			if(cnt==arr.length-2)
			{
				max=cnt;
			}
		}
		System.out.println(num+" is repeated for "+(max+1)+" times.");
	}
}

package array;import java.util.Arrays;

public class RetainOccurance {

	public static int[] retainOccurence(int[]arr,int ele)
	{
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==ele)
				cnt++;
		}
		
		if(cnt>0)
		{
			int[] ans = new int[cnt];
			for (int i = 0,j=0; i < arr.length; i++) {
				if(arr[i]==ele)
					ans[j++]=arr[i];
			}
			return ans;
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,3,4,5,4,4,3,2,2,3,4,5,6,7,7,6,7,6,5,4,3,2,1,2,3,4,5,6,7,8,9,0};
		System.out.println(Arrays.toString(retainOccurence(arr, 4)));
	}
}

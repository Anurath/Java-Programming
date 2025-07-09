package array;

public class Repeatationcount {

	public static void main(String[] args)
	{
		int[] arr = {335,34,65,332,45,6,44,23,44,55,22,454,35,356,7,6532,2233,445,3,2,4,6,6,7,5,3,2,2,4,6,7,7,8,9,0,12};
		System.out.println(repCount(arr, 5));
	}
	
	public static int repCount(int[] arr,int num)
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
				cnt++;
		}
		return cnt;
	}
}

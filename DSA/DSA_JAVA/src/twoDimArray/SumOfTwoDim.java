package twoDimArray;

public class SumOfTwoDim {

	public static void main(String[] args)
	{
		int sum = 0;
		int[][] nums = {{1,2,3,4},{2,3,4,5},{6,7,8,100}};
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				sum+=nums[i][j];
			}
		}
		System.out.println(sum);
	}
}

import java.util.Scanner;
class LeetCodeSumExample {
    public static void main(String[] args) {
		int[] nums={2,7,11,15};
		int target= 9;
        int[] result=new int[2];
        for(int i=0; i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if (target==nums[i]+nums[j])
                    {
						result[0]=i;
                        result[1]=j;
                    }
                }
            }
        }
        for (int i=0;i<result.length ;i++ )
        {
			System.out.println(result[i]);
        }
    }
}

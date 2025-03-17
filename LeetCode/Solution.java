class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        byte j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(j!=2)
                {
                    arr[j]=i;
                    j++;
                }
                arr[1]=i;
            }
        }
        if(j<=1)
		{
			if(j==1)
			{
				arr[1]=arr[0];
			}
			else
			{
				arr[0]=-1;
				arr[1]=-1;
			}
		}
        return arr;
    }
}
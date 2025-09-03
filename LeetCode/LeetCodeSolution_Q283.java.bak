
class LeetCodeSolution_Q283 {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0,k=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                ans[k++]=nums[i];
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            nums[j]=ans[j];
        }
    }
}
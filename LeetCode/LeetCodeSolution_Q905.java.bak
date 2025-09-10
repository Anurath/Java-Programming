class LeetCodeSolution_Q905{
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0,k=0,l=ans.length-1;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                ans[k++] = nums[i];
            }
            else{
                ans[l--] = nums[i];
            }
        }
        return ans;
    }
}
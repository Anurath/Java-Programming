class Leetcode_Q_136_Solution {
	//Q136
    public int singleNumber(int[] nums) {
        int op=0;
        for(int i=0;i<nums.length;i++)
        {
            byte cnt = 0;
            int outNum = nums[i];
            for(int j=0;j<nums.length;j++)
                if(outNum==nums[j])
                    cnt++;
            if(cnt==1)
            {
                op=outNum;
                break;
            }
        }
        return op;
    }
}
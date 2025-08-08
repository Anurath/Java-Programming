class LeetCodeQ34Position {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        byte idx = 0;
        boolean flag = true;
        for(byte i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                arr[idx]=i;
                if(idx==1)
                {
                    flag = false;
                    break;
                }
                idx++;
            }
        }
        if(idx==1)
        {
            arr[0]=0;
            arr[1]=0;
            return arr;
        }
        if(flag)
        {
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        return arr;
    }
}